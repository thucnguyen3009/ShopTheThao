package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.LoaiSanPhamDAO;
import com.software.entity.LoaiSanPham;
import com.software.entity.SanPham;

public class testTimKiemLoaiSP {
	private LoaiSanPhamDAO sp;

	@BeforeClass
	public void initialize() {
		sp = new LoaiSanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { "1", "1" }, { "2", "2" }, { "3", "3" }, { "4", "4" }, { "5", "5" }, { "10", "" } };
	}

	@DataProvider(name = "db2")
	private Object[][] data2() {
		return new Object[][] { { "1", 1 }, { "2", 1 }, { "3", 1 }, { "Phụ", 1 }, { "ụ", 2 }, { "Lamboghini", 0 } };
	}

	@DataProvider(name = "db3")
	private Object[][] data3() {
		return new Object[][] { { "1", 1 }, { "2", 1 }, { "4", 1 }, { "5", 1 }, { "3", 0 } };
	}

	@Test
	public void TestSelectAll() {
		Assert.assertNotNull(sp.SelectAll());
	}

	@Test(dataProvider = "db")
	public void TestFindById(String maLoai, String result) {
		try {
			LoaiSanPham list = sp.SelectByID(maLoai);
			maLoai = list.getMaLoai();
		} catch (NullPointerException e) {
			maLoai = "";
		}
		Assert.assertEquals(result, maLoai);
	}

	@Test(dataProvider = "db2")
	public void TestFindByKeyword(String key, int result) {
		int value = 0;
		try {
			List<LoaiSanPham> list = sp.selectByKeyWord(key);
			value = list.size();
		} catch (NullPointerException e) {
			value = 0;
		}
		Assert.assertEquals(result, value);
	}

	@Test(dataProvider = "db3")
	public void TestSelectByLoaiInSanPham(String maLoai, int result) {
		int value = 0;
		try {
			List<LoaiSanPham> list = sp.selectByLoaiInSanPham(maLoai);
			value = list.size();
		} catch (NullPointerException e) {
			value = 0;
		}
		Assert.assertEquals(result, value);
	}

}
