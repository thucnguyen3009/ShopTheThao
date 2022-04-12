package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.LoaiSanPhamDAO;
import com.software.entity.LoaiSanPham;

public class testThemLoaiSP {
	private LoaiSanPhamDAO sp;

	@BeforeClass
	public void initialize() {
		sp = new LoaiSanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { "6", "Dây chuyền", "", "Dây chuyền" }, { "7", "Nhẫn", "", "Nhẫn" },
				{ "8", "Bông tai", "", "Bông tai" }, { "9", "Quần đùi", "", "Quần đùi" },
				{ "6", "Quần jean", "", "Dây chuyền" }, { "5", "Quần jean", "", "Phụ Kiện" } };
	}

	@Test(dataProvider = "db")
	public void TestInsert(String maLoai, String tenLoai, String moTa, String result) {
		LoaiSanPham entity = new LoaiSanPham(maLoai, tenLoai, moTa);
		String TenLoai = null;
		try {
			sp.insert(entity);
			LoaiSanPham list = sp.SelectByID(entity.getMaLoai());
			TenLoai = list.getTenLoai();
		} catch (NullPointerException e) {
			TenLoai = "";
		}
		Assert.assertEquals(result, TenLoai);
	}
}
