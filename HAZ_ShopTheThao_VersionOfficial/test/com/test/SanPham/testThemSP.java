package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.SanPhamDAO;
import com.software.entity.SanPham;

public class testThemSP {
	private SanPhamDAO sp;

	@BeforeClass
	public void initialize() {
		sp = new SanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { "6", "Găng tay chóng nắng (Hồng) ", 200, "5", "2", 15000.0, "Đang Kinh Doanh", "6" },
				{ "7", "Găng tay chóng nắng (Đỏ)", 200, "5", "2", 15000.0, "Đang Kinh Doanh", "7" },
				{ "8", "Găng tay chóng nắng (Xanh)", 200, "5", "2", 15000.0, "Đang Kinh Doanh", "8" },
				{ "9", "Găng tay chóng nắng (Đen)", 200, "5", "9", 15000.0, "Đang Kinh Doanh", "" },
				{ "10", "Găng tay chóng nắng (Tím)", 200, "100", "2", 15000.0, "Đang Kinh Doanh", "" } };
	}

	@Test(dataProvider = "db")
	public void TestInsert(String maSanPham, String tenSanPham, Integer soLuong, String loaiSanPham, String donViTinh,
			Double gia, String trangThai, String result) {
		SanPham entity = new SanPham(maSanPham, tenSanPham, soLuong, loaiSanPham, donViTinh, gia, trangThai);
		sp.insert(entity);
		String Id = null;
		try {
			SanPham list = sp.SelectByID(entity.getMaSanPham());
			Id = list.getMaSanPham();
		} catch (NullPointerException e) {
			Id = "";
		}
		Assert.assertEquals(result, Id);
	}
}
