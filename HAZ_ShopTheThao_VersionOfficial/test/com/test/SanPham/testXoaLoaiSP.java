package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.LoaiSanPhamDAO;
import com.software.entity.LoaiSanPham;
import com.software.entity.SanPham;

public class testXoaLoaiSP {
	private LoaiSanPhamDAO sp;
	List<LoaiSanPham> list;

	@BeforeClass
	public void initialize() {
		sp = new LoaiSanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { "6", 1 }, { "7", 1 }, { "8", 1 }, { "9", 1 }, { "100", 0 }, { "10", 0 }, { "5", 0 }  };
	}

	@BeforeMethod
	public List<LoaiSanPham> getSize() {
		return list = sp.SelectAll();
	}

	@Test(dataProvider = "db")
	public void TestDelete(String maLoai, int result) {
		sp.delete(maLoai);
		List<LoaiSanPham> del = sp.SelectAll();
		int check = 0;
		check = list.size() - del.size();
		Assert.assertEquals(result, check);
		;
	}
}
