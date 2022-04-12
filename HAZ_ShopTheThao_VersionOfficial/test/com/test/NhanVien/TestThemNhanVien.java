package com.test.NhanVien;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.NhanVienDAO;
import com.software.entity.NhanVien;
import com.test.helper.ExcelHelper;

public class TestThemNhanVien {

	private NhanVienDAO dao;
	private ExcelHelper excel;

	@BeforeClass
	public void initialize() {
		dao = new NhanVienDAO();
		excel = new ExcelHelper();
	}

	@DataProvider(name = "db")
	private Object[][] data() throws Exception {
		return new Object[][] { getData1(1),
			getData1(2),
			getData1(3)
		};

	}
	@Test
	public Object[] getData1(int i) throws Exception {
		excel.setExcelFile("data/TestData.xlsx", "InsertNhanVien");

		String maNV = excel.getCellData("MaNV", i);
		String tenNV = excel.getCellData("TenNV", i);
		boolean gioiTinh = Boolean.valueOf(excel.getCellData("GioiTinh", i));
		String sdt = excel.getCellData("SoDienThoai", i);
		String gmail = excel.getCellData("Gmail", i);
		String cmnd = excel.getCellData("Cmnd", i);
		String diaChi = excel.getCellData("DiaChi", i);
		String maChucVu = excel.getCellData("MaChucVu", i);
		String path = excel.getCellData("Path", i);
		String result = excel.getCellData("result", i);

		return new Object[] { maNV, tenNV, sdt, diaChi, cmnd, gioiTinh, maChucVu, gmail, path, result };
	}

	@Test(dataProvider = "db")
	public void testThemNhanVien(String maNV,String tenNV,String sdt,String diaChi,String cmnd,boolean gioiTinh,String maChucVu,String
			gmail,String path, String result) {
		Assert.assertEquals(result, dao.checkThemNhanVien( maNV, tenNV, sdt, diaChi, cmnd, gioiTinh, maChucVu, gmail, path));
	}

}
