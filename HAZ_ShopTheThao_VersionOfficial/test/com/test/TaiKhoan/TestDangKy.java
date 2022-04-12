package com.test.TaiKhoan;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.TaiKhoanDAO;
import com.software.entity.TaiKhoan;
import com.test.helper.ExcelHelper;

public class TestDangKy {

	private TaiKhoanDAO dao;
	private ExcelHelper excel;
	
	@BeforeClass
	public void initialize() {
		dao = new TaiKhoanDAO();
		excel = new ExcelHelper();
	}
	@Test
	public Object[] getData(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx", "Register");

		String username = excel.getCellData("username", i);
		String pass = excel.getCellData("password", i);
		String result = excel.getCellData("result", i);
		
		return new Object[] {username,pass,result};
	}
	
	@DataProvider(name="db")
	private Object[][]data() throws Exception{
		return new Object[][] {
			getData(1),getData(2),getData(3)
		};
	}
	
	@Test(dataProvider = "db")
	public void testDangKy(String username,String password,String result) {
		Assert.assertEquals(result,dao.checkDangKy(username,password));
	}
	

}
