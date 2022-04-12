package com.test.KhachHang;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.testng.annotations.*;
import com.software.dao.KhachHangDAO;
import com.software.entity.KhachHang;

public class TestSuaKH {

	private KhachHang khachHang;
	private KhachHangDAO khachHangDAO;
	List<KhachHang> listKH;

	@BeforeClass
	public void initialize() {
		khachHang = new KhachHang();
		khachHangDAO = new KhachHangDAO();
		listKH = null;
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { 11, "XYZ", "0986764632", true }, { 12, "XYZ", "0978215902", false },
				{ 12, "Nguyễn Văn B", "0987467369", true } };
	}

	@Test(dataProvider = "db", priority = 1)
	public void updateKH(Integer maKhachHang, String tenKhachHang, String soDT, Boolean result) {
		Boolean kt = false;
		khachHang = new KhachHang(maKhachHang, tenKhachHang, soDT);
		khachHangDAO.update(khachHang);
		listKH = khachHangDAO.SelectByIDS(maKhachHang);
		try {
			if (!listKH.isEmpty()) {
				if (String.valueOf(listKH.get(0).getMaKhachHang()).equals(String.valueOf(maKhachHang))
						&& listKH.get(0).getTenKhachHang().equals(tenKhachHang)
						&& listKH.get(0).getSoDT().equals(soDT)) {
					kt = true;
				}
			}
		} catch (Exception e) {
			kt = false;
		}
		assertEquals(result, kt);
	}
}
