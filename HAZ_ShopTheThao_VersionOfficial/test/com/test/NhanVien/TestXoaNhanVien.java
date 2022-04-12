package com.test.NhanVien;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.NhanVienDAO;
import com.software.entity.NhanVien;
import com.test.helper.ExcelHelper;

public class TestXoaNhanVien {
	private NhanVienDAO dao;
	private ExcelHelper excel;

	@BeforeClass
	public void initialize() {
		dao = new NhanVienDAO();
		excel = new ExcelHelper();
	}
	
	@Test
	public Object[] getData(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx","RemoveNhanVien");

		String maNV = excel.getCellData("MaNV", i);
		boolean confirmRemove = Boolean.valueOf(excel.getCellData("confirmRemove", i));
		String result = excel.getCellData("result", i);
		
		return new Object[] {maNV,confirmRemove,result};
	}
	
	@DataProvider(name="db")
	private Object[][]data() throws Exception{
		return new Object[][] {
			getData(1),getData(2),getData(3)
		};
	}
	@Test(dataProvider = "db")
	public void testXoaNhanVien(String manv,boolean confirmRemove,String result) {
		Assert.assertEquals(result, dao.checkXoaNhanVien(manv,confirmRemove));
	}
}
