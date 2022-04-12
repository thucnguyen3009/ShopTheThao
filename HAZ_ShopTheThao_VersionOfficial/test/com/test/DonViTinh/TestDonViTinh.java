package com.test.DonViTinh;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.DonViTinhDAO;

public class TestDonViTinh {
	private DonViTinhDAO dao;
	
	@BeforeTest
	public void testDVT() {
		dao = new DonViTinhDAO();
	}
	
	@DataProvider(name = "db")
	public Object[][] data(){
		return new Object[][] { {"1","Cái","Đơn vị dùng cho áo...","Thêm thất bại"}};
	}
	
	@Test(dataProvider = "db")
	public void testThemDonViTinh(String maDVT,String tenDVT,String moTa,String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.CheckThemDonViTinh(maDVT, tenDVT, moTa));
	}
	
	@DataProvider(name = "db1")
	public Object[][] data1() {
		return new Object[][] { {"1","Cái","Đơn vị dùng cho áo...","Dữ liệu chưa thay đổi"}};
	}
	
	@Test(dataProvider = "db1")
	public void testSuaChucVu(String maDVT,String tenDVT,String moTa,String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkSuaDonViTinh(maDVT, tenDVT, moTa));
	}
	
	@DataProvider(name = "db2")
	public Object[][] data2() {
		return new Object[][] { {"3",false,"Xóa thất bại"}};
	}
	
	@Test(dataProvider = "db2")
	public void testXoaDonViTinh(String maDVT, boolean luaChon, String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkXoaDonViTinh(maDVT, luaChon));
	}
	
	@DataProvider(name = "db3")
	public Object[][] data3() {
		return new Object[][] { {"4","Tìm thành công"}};
	}
	
	@Test(dataProvider = "db3")
	public void testTimDonViTinh(String maDVT, String ketQuaMongDoi)
	{
		Assert.assertEquals(ketQuaMongDoi, dao.checkTimDonViTinh(maDVT));
	}
}
