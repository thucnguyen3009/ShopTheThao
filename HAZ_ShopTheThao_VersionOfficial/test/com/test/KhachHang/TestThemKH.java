package com.test.KhachHang;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.testng.annotations.*;
import com.software.dao.KhachHangDAO;
import com.software.entity.KhachHang;

public class TestThemKH {

	private KhachHang khachHang;
	private KhachHangDAO khachHangDAO;

	List<KhachHang> listKH;

	private Integer listSizeKH1;
	private Integer listSizeKH2;

	@BeforeClass
	public void initialize() {
		khachHang = new KhachHang();
		khachHangDAO = new KhachHangDAO();
		listKH = null;
	}

	@BeforeMethod
	public void setListSize1() {
		listKH = khachHangDAO.SelectAll();
		listSizeKH1 = listKH.size();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		// Result = 1 tức là 1 bản ghi được thêm vào database ==> Thêm thành công!!!
		// Result = 0 tức là 0 bản ghi được thêm vào database ==> Thêm thất bại!!!
		return new Object[][] { { 11, "ABC", "0986764632", 1 }, { 12, "XYZ", "0978215902", 0 },
				{ 12, "Nguyễn Văn B", "0987467362", 1 } };
	}

	@Test(dataProvider = "db", priority = 1)
	public void insertKH(Integer maKhachHang, String tenKhachHang, String soDT, Integer result) {
		khachHang = new KhachHang(maKhachHang, tenKhachHang, soDT);
		khachHangDAO.insert(khachHang);
		listKH = khachHangDAO.SelectAll();
		listSizeKH2 = listKH.size();
		result = listSizeKH1 + result;
		assertEquals(result, listSizeKH2);
	}
}
