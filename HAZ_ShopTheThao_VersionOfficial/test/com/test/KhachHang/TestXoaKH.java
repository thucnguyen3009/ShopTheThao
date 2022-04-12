package com.test.KhachHang;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.testng.annotations.*;
import com.software.dao.KhachHangDAO;
import com.software.entity.KhachHang;

public class TestXoaKH {
	private KhachHangDAO khachHangDAO;
	List<KhachHang> listKH;
	private Integer listSizeKH1;
	private Integer listSizeKH2;

	@BeforeClass
	public void initialize() {
		khachHangDAO = new KhachHangDAO();
		listKH = null;
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { 11, 1 }, { 12, 1 }, { 1, 0 } };
	}

	@BeforeMethod
	public void setListSize1() {
		listKH = khachHangDAO.SelectAll();
		listSizeKH1 = listKH.size();
	}

	@Test(dataProvider = "db", priority = 1)
	public void updateKH(Integer maKhachHang, Integer result) {
		khachHangDAO.delete(maKhachHang);
		listKH = khachHangDAO.SelectAll();
		listSizeKH2 = listKH.size();
		result = listSizeKH1 - result;
		assertEquals(result, listSizeKH2);
	}
}
