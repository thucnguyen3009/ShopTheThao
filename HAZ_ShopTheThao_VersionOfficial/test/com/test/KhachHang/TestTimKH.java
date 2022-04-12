package com.test.KhachHang;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.*;

import com.software.dao.KhachHangDAO;
import com.software.entity.KhachHang;

public class TestTimKH {

	private KhachHangDAO khachHangDAO;
	List<KhachHang> listKH;

	@DataProvider(name = "dbId")
	private Object[][] data() {
		return new Object[][] { { 11, false }, { 12, false }, { 1, true } };
	}

	@DataProvider(name = "dbKey")
	private Object[][] dataKey() {
		return new Object[][] { { "0978215902", true }, { "046326452656", false }, { "Thanh", true } };
	}

	@DataProvider(name = "dbKHinHD")
	private Object[][] dataKHinHD() {
		return new Object[][] { { 10, false }, { 2, true }, { 1, true } };
	}

	@BeforeClass
	public void initialize() {
		khachHangDAO = new KhachHangDAO();
		listKH = null;
	}

	@BeforeMethod
	public void setListSize1() {
		listKH = null;
	}

	@Test(dataProvider = "dbId", priority = 1)
	public void findKHbyID(Integer maKH, Boolean result) {
		Boolean kt = false;
		try {
			listKH = khachHangDAO.SelectByIDS(maKH);
			if (listKH.size() > 0) {
				kt = true;
			} else {
				kt = false;
			}
		} catch (NullPointerException e) {
			kt = false;
		}
		assertEquals(result, kt);
	}

	@Test(dataProvider = "dbKey", priority = 2)
	public void findKHbyKey(String key, Boolean result) {
		Boolean kt = false;
		try {
			listKH = khachHangDAO.selectByKeyWord(key);
			if (listKH.size() > 0) {
				kt = true;
			} else {
				kt = false;
			}
		} catch (NullPointerException e) {
			kt = false;
		}
		assertEquals(result, kt);
	}

	@Test(dataProvider = "dbKHinHD", priority = 3)
	public void findKHbyHD(Integer maKH, Boolean result) {
		Boolean kt = false;
		try {
			listKH = khachHangDAO.selectByKhachHanngInHoaDon(maKH);
			if (listKH.size() > 0) {
				kt = true;
			} else {
				kt = false;
			}
		} catch (NullPointerException e) {
			kt = false;
		}
		assertEquals(result, kt);
	}
}
