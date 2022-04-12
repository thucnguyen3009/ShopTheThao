package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.LoaiSanPhamDAO;
import com.software.entity.LoaiSanPham;

public class testCapNhatLoaiSP {
	private LoaiSanPhamDAO sp;

	@BeforeClass
	public void initialize() {
		sp = new LoaiSanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { "6", "Đồ ngủ", "Pijama", "Đồ ngủ" }, { "7", "Dây Chuyền", "", "Dây Chuyền" },
				{ "8", "Nhẫn", "EldenRing", "Nhẫn" }, { "9", "Áo thể thao", "", "Áo thể thao" },
				{ "100", "Quần jean", "", "" }, { "0pds", "Quần jean", "", "" }, };
	}

	@Test(dataProvider = "db")
	public void TestUpdate(String maLoai, String tenLoai, String moTa, String result) {
		LoaiSanPham entity = new LoaiSanPham(maLoai, tenLoai, moTa);
		String TenLoai = null;
		try {
			sp.update(entity);
			LoaiSanPham list = sp.SelectByID(entity.getMaLoai());
			TenLoai = list.getTenLoai();
		} catch (NullPointerException e) {
			TenLoai = "";
		}
		Assert.assertEquals(result, TenLoai);
	}
}
