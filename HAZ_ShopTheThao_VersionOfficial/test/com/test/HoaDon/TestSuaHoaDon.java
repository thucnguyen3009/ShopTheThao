package com.test.HoaDon;

import static org.testng.Assert.assertEquals;
import java.util.List;

import org.testng.annotations.*;

import com.software.dao.HoaDonChiTietDAO;
import com.software.dao.HoaDonDAO;
import com.software.entity.HoaDon;
import com.software.entity.HoaDonChiTiet;

public class TestSuaHoaDon {
	private HoaDonDAO hoaDonDAO;
	private HoaDonChiTietDAO chiTietDAO;
	private List<HoaDon> listHD;
	private List<HoaDonChiTiet> listHDCT;

	@BeforeClass
	public void initialize() {
		hoaDonDAO = new HoaDonDAO();
		chiTietDAO = new HoaDonChiTietDAO();

		listHD = null;
		listHDCT = null;

	}

	@DataProvider(name = "dbhd")
	private Object[][] dataHD() {
		// Result = true ==> Cập nhật thành công!!!
		// Result = false ==> Cập nhật thất bại!!!
		return new Object[][] { { 2, "3", 100, 0, 0.0, "2021-10-14", "Đã thanh toán", 315000.0, false },
				{ 3, "3", 7, 0, 0.0, "2021-11-15", "Đã thanh toán", 3240000.0, true },
				{ 4, "3", 1, 0, 0.0, "2021-12-15", "Đã thanh toán", 1030000.0, true },
				{ 100, "10", 2, 0, 0.0, "2021-09-13", "Đã thanh toán", 1030000.0, false } };
	}

	@Test(dataProvider = "dbhd", priority = 1)
	public void updatetHD(Integer maHD, String maNV, Integer maKH, Integer phanTramGiam, Double giaGiam,
			String ngayLapHD, String trangThai, Double thanhTien, Boolean result) {
		Boolean kt = false;
		HoaDon hoaDon = new HoaDon(maHD, maNV, maKH, phanTramGiam, giaGiam, ngayLapHD, trangThai, thanhTien);
		hoaDonDAO.update(hoaDon);
		listHD = hoaDonDAO.SelectByIDS(maHD);
		try {
			if (!listHD.isEmpty()) {
				if (listHD.get(0).getMaHD() == maHD && listHD.get(0).getMaNV().equals(maNV)
						&& listHD.get(0).getMaKH() == maKH && listHD.get(0).getPhanTramGiam() == phanTramGiam
						&& String.valueOf(listHD.get(0).getGiaGiam()).equals(String.valueOf(giaGiam))
						&& listHD.get(0).getTrangThai().equals(trangThai)
						&& String.valueOf(listHD.get(0).getThanhTien()).equals(String.valueOf(thanhTien))) {
					kt = true;
				}
			}
		} catch (Exception e) {
			kt = false;
		}

		assertEquals(result, kt);
	}

	@DataProvider(name = "dbhdct")
	private Object[][] dataHDCT() {
		// Result = true ==> Cập nhật thành công!!!
		// Result = false ==> Cập nhật thất bại!!!
		return new Object[][] { { 1, 1, "1", 1, 80000.0, true }, { 2, 1, "3", 1, 950000.0, true },
				{ 3, 2, "4", 2, 150000.0, true }, { 4, 100, "5", 1, 15000.0, false } };
	}

	@Test(dataProvider = "dbhdct", priority = 2)
	public void updatetHDCT(Integer maHDCT, Integer maHD, String maSP, Integer soLuong, Double donGia, Boolean result) {
		Boolean kt = false;
		HoaDonChiTiet hoaDonCT = new HoaDonChiTiet(maHD, maHDCT, maSP, soLuong, donGia);
		chiTietDAO.update(hoaDonCT);
		try {
			listHDCT = chiTietDAO.SelectByIDS(maHDCT);
			if (!listHDCT.isEmpty() || listHDCT != null) {
				if (listHDCT.get(0).getMaHD() == maHD && listHDCT.get(0).getMaHDCT() == maHDCT
						&& listHDCT.get(0).getMaSP().equals(maSP)
						&& String.valueOf(listHDCT.get(0).getDonGia()).equals(String.valueOf(donGia))
						&& listHDCT.get(0).getSoLuong() == soLuong) {
					kt = true;
				}
			}
		} catch (Exception e) {
			kt = false;
		}
		assertEquals(result, kt);
	}
}
