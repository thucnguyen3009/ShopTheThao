package com.test.TaiKhoan;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.TaiKhoanDAO;
import com.test.helper.ExcelHelper;

public class TestTimKiem {
	private TaiKhoanDAO taiKhoanDAO;
	private ExcelHelper excel;

	@BeforeClass
	public void initialize() {
		taiKhoanDAO = new TaiKhoanDAO();
		excel = new ExcelHelper();
	}
	@Test
	public Object[] getData(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx","FindUser");

		String username = excel.getCellData("username", i);
		String result = excel.getCellData("result", i);
		
		return new Object[] {username,result};
	}
	
	@DataProvider(name="db")
	private Object[][]data() throws Exception{
		return new Object[][] {
			getData(1),getData(2),getData(3)
		};
	}

	@Test(dataProvider = "db")
	public void testTimKiemTK(String username, String result) {
		Assert.assertEquals(result, taiKhoanDAO.checkTimKiemTK(username));
	}
}
