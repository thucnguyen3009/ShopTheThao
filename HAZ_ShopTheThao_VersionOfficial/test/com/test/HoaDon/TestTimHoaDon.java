package com.test.HoaDon;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.HoaDonChiTietDAO;
import com.software.dao.HoaDonDAO;
import com.software.entity.HoaDon;
import com.software.entity.HoaDonChiTiet;

public class TestTimHoaDon {

	private HoaDonDAO hoaDonDAO;
	private HoaDonChiTietDAO chiTietDAO;

	private List<HoaDon> listHD;
	private List<HoaDonChiTiet> listHDCT;

	@DataProvider(name = "dbhd")
	private Object[][] dataHDbyMaHD() {
		return new Object[][] { { 3, true }, { 100, false } };
	}

	@DataProvider(name = "dbHdKey")
	private Object[][] dataHDbyKey() {
		return new Object[][] { { "0978215902", true }, { "100", false } };
	}

	@DataProvider(name = "dbHdctID")
	private Object[][] dataHDCTbyMaHD() {
		return new Object[][] { { 3, true }, { 100, false } };
	}

	@DataProvider(name = "dbHdctMahd")
	private Object[][] dataHDCTbyKey() {
		return new Object[][] { { 3, true }, { 200, false } };
	}

	@BeforeClass
	public void initialize() {
		hoaDonDAO = new HoaDonDAO();
		chiTietDAO = new HoaDonChiTietDAO();
		listHD = null;
		listHDCT = null;
	}

	@BeforeMethod
	public void setListSize1() {
		listHD = null;
		listHDCT = null;
	}

	@Test(dataProvider = "dbhd", priority = 1)
	public void findHDbyMaHD(Integer maHD, Boolean result) {
		Boolean kt = false;
		try {
			listHD = hoaDonDAO.SelectByIDS(maHD);
			if (listHD.size() > 0) {
				kt = true;
			} else {
				kt = false;
			}
		} catch (NullPointerException e) {
			kt = false;
		}
		assertEquals(result, kt);
	}

	@Test(dataProvider = "dbHdKey", priority = 2)
	public void findHDbyKey(String key, Boolean result) {
		Boolean kt = false;
		try {
			listHD = hoaDonDAO.selectByKeyWord(key);
			if (listHD.size() > 0) {
				kt = true;
			} else {
				kt = false;
			}
		} catch (NullPointerException e) {
			kt = false;
		}
		assertEquals(result, kt);
	}

	@Test(dataProvider = "dbHdctID", priority = 3)
	public void findHDCTbyID(Integer ID, Boolean result) {
		Boolean kt = false;
		try {
			listHDCT = chiTietDAO.SelectByIDS(ID);
			if (listHDCT.size() > 0) {
				kt = true;
			} else {
				kt = false;
			}
		} catch (NullPointerException e) {
			kt = false;
		}
		assertEquals(result, kt);
	}

	@Test(dataProvider = "dbHdctID", priority = 4)
	public void findHDCTbyMaHD(Integer maHD, Boolean result) {
		Boolean kt = false;
		try {
			listHDCT = chiTietDAO.SelectByMaHD(maHD);
			if (listHDCT.size() > 0) {
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
