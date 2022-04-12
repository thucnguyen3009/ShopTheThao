package com.test.NhanVien;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.NhanVienDAO;
import com.test.helper.ExcelHelper;

public class TestTimKiem {
	private NhanVienDAO dao;
	private ExcelHelper excel;

	@BeforeClass
	public void initialize() {
		dao = new NhanVienDAO();
		excel = new ExcelHelper();
	}

	@Test
	public Object[] getData1(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx", "FindNhanVienByUser");

		String username = excel.getCellData("MaNV", i);
		String result = excel.getCellData("result", i);

		return new Object[] { username, result };
	}
	@Test
	public Object[] getData2(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx", "FindNhanVienBySdt");

		String sdt = excel.getCellData("SDT", i);
		String result = excel.getCellData("result", i);

		return new Object[] {sdt, result };
	}

	@Test
	public Object[] getData3(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx", "FindNhanVienByHoTen");

		String hoTen = excel.getCellData("HoTen", i);
		String result = excel.getCellData("result", i);

		return new Object[] {hoTen, result };
	}
	@DataProvider(name = "db")
	private Object[][] data() throws Exception {
		return new Object[][] { getData1(1), getData1(2), getData1(3) };
	}

	@DataProvider(name = "db2")
	private Object[][] data2() throws Exception {
		return new Object[][] {getData2(1),getData2(2),getData2(3)};
	}
	@DataProvider(name = "db3")
	private Object[][] data3() throws Exception {
		return new Object[][] {getData3(1),getData3(2),getData3(3)};
	}

	@Test(dataProvider = "db",priority = 2)
	public void testTimKiemMaNV(String manv, String result) {
		Assert.assertEquals(result, dao.checkTimKiemMaNV(manv));
	}

	@Test(dataProvider = "db2",priority = 0)
	public void testTimKiemSdt(String sdt, String result) {
		Assert.assertEquals(result, dao.checkTimKiemSdt(sdt));
	}
	
	@Test(dataProvider = "db3",priority = 1)
	public void testTimKiemHoTen(String hoTen, String result) {
		Assert.assertEquals(result, dao.checkTimKiemTenNV(hoTen));
	}
}
