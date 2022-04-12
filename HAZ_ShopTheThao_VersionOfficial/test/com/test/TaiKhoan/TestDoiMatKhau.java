package com.test.TaiKhoan;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.software.dao.TaiKhoanDAO;
import com.test.helper.ExcelHelper;

public class TestDoiMatKhau {

	private TaiKhoanDAO dao;
	private ExcelHelper excel;

	@BeforeClass
	public void initialize() {
		dao = new TaiKhoanDAO();
		excel = new ExcelHelper();
	}

	@Test
	public Object[] getData(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx","ChangePassword");

		String username = excel.getCellData("username", i);
		String pass = excel.getCellData("password", i);
		String confirmPass = excel.getCellData("confirmPass", i);
		boolean confirmChangePass =Boolean.valueOf(excel.getCellData("confirmChangePass", i));
		String result = excel.getCellData("result", i);

		return new Object[] { username, pass,confirmPass,confirmChangePass, result };
	}

	@DataProvider(name = "db")
	private Object[][] data() throws Exception {
		return new Object[][] {getData(1),getData(2),getData(3)};
	}

	@Test(dataProvider = "db")
	public void testDoiMatKhau(String username, String password, String confirmPass, boolean confirmChangePass,
			String result) {
		Assert.assertEquals(result, dao.checkCapNhatTaiKhoan(username, password, confirmPass, confirmChangePass));
	}

}
