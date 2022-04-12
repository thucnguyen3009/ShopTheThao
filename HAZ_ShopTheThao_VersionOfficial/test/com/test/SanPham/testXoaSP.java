package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.SanPhamDAO;
import com.software.entity.SanPham;

public class testXoaSP {
	private SanPhamDAO sp;
	List<SanPham> list;

	@BeforeClass
	public void initialize() {
		sp = new SanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { "6", 1 }, { "7", 1 }, { "8", 1 }, { "100", 0 },{ "1", 0 }, { "3", 0}};
	}

	@BeforeMethod
	public List<SanPham> getSize() {
		return list = sp.SelectAll();
	}

	@Test(dataProvider = "db", priority = 0)
	public void TestUpdateTenSP(String maSanPham, int result) {
		sp.delete(maSanPham);
		List<SanPham> del = sp.SelectAll();
		int check = 0;
		check = list.size() - del.size();
		Assert.assertEquals(result, check);
		;
	}

}
