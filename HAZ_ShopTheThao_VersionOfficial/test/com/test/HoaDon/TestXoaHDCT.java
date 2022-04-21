package com.test.HoaDon;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.testng.annotations.*;
import com.software.dao.HoaDonChiTietDAO;
import com.software.entity.HoaDonChiTiet;

public class TestXoaHDCT {

	private HoaDonChiTietDAO chiTietDAO;
	private List<HoaDonChiTiet> listHDCT;
	private Integer listSizeHDCT1;
	private Integer listSizeHDCT2;

	@DataProvider(name = "dbct")
	private Object[][] dataHDCTbyID() {
		// Result = 1 tức là 1 bản ghi được xóa khỏi database ==> Xóa thành công!!!
		// Result = 0 tức là 0 bản ghi được xóa khỏi database ==> Xóa thất bại!!!
		return new Object[][] { { 13, 1 }, { 100, 0 } };
	}

	@DataProvider(name = "dbcts")
	private Object[][] dataHDCTbyMaHD() {
		return new Object[][] { { 7, true }, { 100, false } };
	}

	@BeforeClass
	public void initialize() {
		chiTietDAO = new HoaDonChiTietDAO();
		listHDCT = null;
	}

	@BeforeMethod
	public void setListSize1() {
		listHDCT = chiTietDAO.SelectAll();
		listSizeHDCT1 = listHDCT.size();
	}

	@Test(dataProvider = "dbct", priority = 0)
	public void deleteHDCTbyID(Integer maHDCT, Integer result) {
		chiTietDAO.delete(maHDCT);
		listHDCT = chiTietDAO.SelectAll();
		listSizeHDCT2 = listHDCT.size();
		result = listSizeHDCT1 - result;
		assertEquals(result, listSizeHDCT2);
	}

	@Test(dataProvider = "dbcts", priority = 2)
	public void deleteHDCTbyMaHD(Integer maHD, Boolean result) {
		Boolean kt = false;
		int sl1 = 0;
		int sl2 = 0;
		listHDCT = chiTietDAO.SelectByMaHD(maHD);
		try {
			listHDCT = chiTietDAO.SelectByMaHD(maHD);
			sl1 = listHDCT.size();
			if (listHDCT.size() <= 0) {
				kt = false;
				assertEquals(result, kt);
				return;
			}
		} catch (Exception e) {
			kt = false;
			assertEquals(result, kt);
			return;
		}
		try {
			chiTietDAO.deletes(maHD);
			listHDCT = chiTietDAO.SelectByMaHD(maHD);
			sl2 = listHDCT.size();
			if (sl1 == sl2) {
				kt = false;
			} else {
				kt = true;
			}
		} catch (NullPointerException e) {
			kt = true;
		}
		assertEquals(result, kt);
	}
}
