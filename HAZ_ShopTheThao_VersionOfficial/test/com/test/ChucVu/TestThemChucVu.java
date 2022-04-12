package com.test.ChucVu;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.ChucVuDAO;

public class TestThemChucVu {

	private ChucVuDAO dao;

	@BeforeClass
	public void init() {
		dao = new ChucVuDAO();
	}

	@DataProvider(name = "db")
	public Object[][] data() {
		return new Object[][] { {"1","Admin","Là admin chủ cửa hàng","Thêm thất bại"}};
	}
	
	@Test(dataProvider = "db")
	public void testThemChucVu(String maCV,String tenCV,String moTa,String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkThemChucVu(maCV, tenCV, moTa));
	}
	
	@DataProvider(name = "db1")
	public Object[][] data1() {
		return new Object[][] { {"1","Admin","Là admin chủ cửa hàng","Dữ liệu chưa thay đổi"}};
	}
	
	@Test(dataProvider = "db1")
	public void testSuaChucVu(String maCV,String tenCV,String moTa,String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkSuaChucVu(maCV, tenCV, moTa));
	}
	
	@DataProvider(name = "db2")
	public Object[][] data2() {
		return new Object[][] { {"4",false,"Xóa thất bại"}};
	}
	
	@Test(dataProvider = "db2")
	public void testXoaChucVu(String maCV, boolean luaChon, String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkXoaChucVu(maCV, luaChon));
	}
	
	@DataProvider(name = "db3")
	public Object[][] data3() {
		return new Object[][] { {"4","Tìm thành công"}};
	}
	
	@Test(dataProvider = "db3")
	public void testTimChucVu(String maCV, String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkTimChucVu(maCV));
	}
}
