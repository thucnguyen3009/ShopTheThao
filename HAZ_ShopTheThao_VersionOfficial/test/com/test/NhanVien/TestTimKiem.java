package com.test.NhanVien;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.NhanVienDAO;

public class TestTimKiem {
	private NhanVienDAO dao;

	@BeforeClass
	public void initialize() {
		dao = new NhanVienDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { 
				{ "1", "Tìm thấy!" }, 
				{ "2", "Nhân viên không tồn tại!" },
				{ "8", "Nhân viên không tồn tại!" }, };
	}
	@DataProvider(name = "db2")
	private Object[][] data2() {
		return new Object[][] { 
				{ "0946492294", "Tìm thấy!" }, 
				{ "0769331203", "Nhân viên không tồn tại!" },
				{ "", "Nhân viên không tồn tại!" }, };
	}

	@Test(dataProvider = "db")
	public void testTimKiemMaNV(String manv, String result) {
		Assert.assertEquals(result, dao.checkTimKiemMaNV(manv));
	}
	@Test(dataProvider = "db2")
	public void testTimKiemSdt(String sdt, String result) {
		Assert.assertEquals(result, dao.checkTimKiemSdt(sdt));
	}
}
