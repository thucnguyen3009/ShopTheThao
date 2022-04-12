package com.test.TaiKhoan;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.NhanVienDAO;
import com.software.dao.TaiKhoanDAO;
import com.software.entity.NhanVien;
import com.software.entity.TaiKhoan;
import com.test.helper.ExcelHelper;

public class TestDangNhap {

	private TaiKhoanDAO taiKhoanDAO;
	private ExcelHelper excel;

	@BeforeClass
	public void initialize() {
		taiKhoanDAO = new TaiKhoanDAO();
		excel = new ExcelHelper();
	}

	@Test
	public Object[] getData(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx", "Login");

		String username = excel.getCellData("username", i);
		String pass = excel.getCellData("password", i);
		String result = excel.getCellData("result", i);
		
		return new Object[] {username,pass,result};
	}

	@DataProvider(name = "db")
	private Object[][] data() throws Exception {
		return new Object[][] {getData(1),getData(2),getData(3)};
	}

	@Test(dataProvider = "db")
	public void testDangNhap(String username, String password, String result) {
		Assert.assertEquals(result, taiKhoanDAO.CheckLogin(username, password));
	}

}
