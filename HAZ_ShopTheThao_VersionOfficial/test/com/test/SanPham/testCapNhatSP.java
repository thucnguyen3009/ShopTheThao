package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.SanPhamDAO;
import com.software.entity.SanPham;

public class testCapNhatSP {
	private SanPhamDAO sp;

	@BeforeClass
	public void initialize() {
		sp = new SanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] {
				{ "6", "Găng tay thường (Hồng)", 200, "5", "2", 15000.0, "Đang Kinh Doanh", "Găng tay thường (Hồng)" },
				{ "7", "Găng tay thường (Đỏ)", 200, "5", "2", 15000.0, "Đang Kinh Doanh", "Găng tay thường (Đỏ)" },
				{ "8", "Găng tay thường (Xanh)", 200, "5", "2", 15000.0, "Đang Kinh Doanh",
						"Găng tay thường (Xanh)" }, };
	}

	@DataProvider(name = "db1")
	private Object[][] data1() {
		return new Object[][] { { "6", "Găng tay thường (Hồng)", 150, "5", "2", 15000.0, "Đang Kinh Doanh", 150 },
				{ "7", "Găng tay thường (Đỏ)", 690, "5", "2", 15000.0, "Đang Kinh Doanh", 690 },
				{ "8", "Găng tay thường (Xanh)", 300, "5", "2", 15000.0, "Đang Kinh Doanh", 300 } };
	}

	@DataProvider(name = "db2")
	private Object[][] data2() {
		return new Object[][] { { "6", "Găng tay thường (Hồng)", 150, "5", "2", 10000.0, "Đang Kinh Doanh", 10000.0 },
				{ "7", "Găng tay thường (Đỏ)", 690, "5", "2", 12000.0, "Đang Kinh Doanh", 12000.0 },
				{ "8", "Găng tay thường (Xanh)", 300, "5", "2", 13000.0, "Đang Kinh Doanh", 13000.0 } };
	}
	
	@Test(dataProvider = "db", priority = 0)
	public void TestUpdateTenSP(String maSanPham, String tenSanPham, Integer soLuong, String loaiSanPham,
			String donViTinh, Double gia, String trangThai, String result) {
		SanPham entity = new SanPham(maSanPham, tenSanPham, soLuong, loaiSanPham, donViTinh, gia, trangThai);
		sp.update(entity);
		String tensp = null;
		SanPham list = sp.SelectByID(entity.getMaSanPham());
		tensp = list.getTenSanPham();

		Assert.assertEquals(result, tensp);
	}

	@Test(dataProvider = "db1", priority = 1)
	public void TestUpdateSoLuongSP(String maSanPham, String tenSanPham, Integer soLuong, String loaiSanPham,
			String donViTinh, Double gia, String trangThai, int result) {
		SanPham entity = new SanPham(maSanPham, tenSanPham, soLuong, loaiSanPham, donViTinh, gia, trangThai);
		sp.update(entity);
		int sl = 0;
		try {
			SanPham list = sp.SelectByID(entity.getMaSanPham());
			sl = list.getSoLuong();
		} catch (NullPointerException e) {
			sl = 0;
		}
		Assert.assertEquals(result, sl);
	}
	
	@Test(dataProvider = "db2", priority = 2)
	public void TestUpdateGiaSP(String maSanPham, String tenSanPham, Integer soLuong, String loaiSanPham,
			String donViTinh, Double gia, String trangThai, double result) {
		SanPham entity = new SanPham(maSanPham, tenSanPham, soLuong, loaiSanPham, donViTinh, gia, trangThai);
		sp.update(entity);
		double giaSP = 0;
		try {
			SanPham list = sp.SelectByID(entity.getMaSanPham());
			giaSP = list.getGia();
		} catch (NullPointerException e) {
			giaSP = 0;
		}
		Assert.assertEquals(result, giaSP);
	}

}
