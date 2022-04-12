package com.test.NhanVien;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.NhanVienDAO;
import com.software.entity.NhanVien;

public class TestXoaNhanVien {
	private NhanVienDAO dao;

	@BeforeClass
	public void initialize() {
		dao = new NhanVienDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { 
				{ "8","Xóa thất bại!"}, 
				{ "8","Xóa thất bại!"},
				{ "8","Xóa thành công!"}, };
	}
	@Test(dataProvider = "db")
	public void testXoaNhanVien(String manv,String result) {
		Assert.assertEquals(result, dao.checkXoaNhanVien(manv));
	}
}
