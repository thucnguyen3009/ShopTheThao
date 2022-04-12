package com.test.DoanhThu;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.DoanhThuDAO;

public class TestDoanhThu {
	private DoanhThuDAO dao;
	@BeforeClass
	public void init() {
		dao = new DoanhThuDAO();
	}

	@DataProvider(name = "db")
	public Object[][] data() {
		return new Object[][] { {"20210401","","Thống kê thành công"},
			{"","20220401","Thống kê thành công"},
			{"20210401","20220401","Thống kê thất bại"},
			{"20210401","20220401","Thống kê thành công"}};
	}
	
	@Test(dataProvider = "db")
	public void testThemChucVu(String ngayBatDau, String ngayKetThuc, String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkDoanhThua(ngayBatDau, ngayKetThuc));
	}
}
