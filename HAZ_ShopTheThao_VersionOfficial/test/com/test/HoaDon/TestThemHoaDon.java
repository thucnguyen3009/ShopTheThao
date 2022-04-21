package com.test.HoaDon;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.testng.annotations.*;
import com.software.dao.HoaDonChiTietDAO;
import com.software.dao.HoaDonDAO;
import com.software.entity.HoaDon;
import com.software.entity.HoaDonChiTiet;

public class TestThemHoaDon {

	private HoaDonDAO hoaDonDAO;
	private HoaDonChiTietDAO chiTietDAO;

	private List<HoaDon> listHD;
	private List<HoaDonChiTiet> listHDCT;

	private Integer listSizeHD1;
	private Integer listSizeHD2;

	private Integer listSizeHDCT1;
	private Integer listSizeHDCT2;

	@BeforeClass
	public void initialize() {
		hoaDonDAO = new HoaDonDAO();
		chiTietDAO = new HoaDonChiTietDAO();
		listHD = null;
		listHDCT = null;
	}

	@BeforeMethod
	public void setListSize1() {
		listHD = hoaDonDAO.SelectAll();
		listSizeHD1 = listHD.size();

		listHDCT = chiTietDAO.SelectAll();
		listSizeHDCT1 = listHDCT.size();
	}

	@DataProvider(name = "dbhd")
	private Object[][] dataHD() {
		// Result = 1 tức là 1 bản ghi được thêm vào database ==> Thêm thành công!!!
		// Result = 0 tức là 0 bản ghi được thêm vào database ==> Thêm thất bại!!!
		return new Object[][] { 
				{ 6, "3", 1, 0, 0.0, "2021-12-15", "Đã thanh toán", 1030000.0, 1 },
				{ 6, "3", 1, 0, 0.0, "2021-12-15", "Đã thanh toán", 1030000.0, 0 },
				{ 7, "3", 1, 0, 0.0, "2021-12-15", "Đã thanh toán", 1030000.0, 1 } };
	}

	@Test(dataProvider = "dbhd", priority = 1)
	public void insertHD(Integer maHD, String maNV, Integer maKH, Integer phanTramGiam, Double giaGiam,
			String ngayLapHD, String trangThai, Double thanhTien, Integer result) {
		HoaDon hoaDon = new HoaDon(maHD, maNV, maKH, phanTramGiam, giaGiam, ngayLapHD, trangThai, thanhTien);
		hoaDonDAO.insert(hoaDon);
		listHD = hoaDonDAO.SelectAll();
		listSizeHD2 = listHD.size();
		result = listSizeHD1 + result;
		assertEquals(result, listSizeHD2);
	}

	@DataProvider(name = "dbct")
	private Object[][] dataHDCT() {
		// Result = 1 tức là 1 bản ghi được thêm vào database ==> Thêm thành công!!!
		// Result = 0 tức là 0 bản ghi được thêm vào database ==> Thêm thất bại!!!
		return new Object[][] { 
				{ 7, 13, "1", 1, 15000.0, 1 }, 
				{ 7, 14, "2", 1, 15000.0, 1 },
				{ 7, 15, "3", 1, 15000.0, 1 }, 
				{ 7, 16, "4", 1, 15000.0, 1 }, 
				{ 7, 17, "5", 1, 15000.0, 1 },
				{ 7, 17, "5", 1, 15000.0, 0 },
				{ 7, 17, "10", 1, 15000.0, 0 }
		};
	}

	@Test(dataProvider = "dbct", priority = 2)
	public void insertHDCT(Integer maHD, Integer maHDCT, String maSP, Integer soLuong, Double donGia, Integer result) {
		HoaDonChiTiet hoaDonCT = new HoaDonChiTiet(maHD, maHDCT, maSP, soLuong, donGia);
		chiTietDAO.insert(hoaDonCT);
		listHDCT = chiTietDAO.SelectAll();
		listSizeHDCT2 = listHDCT.size();
		result = listSizeHDCT1 + result;
		assertEquals(result, listSizeHDCT2);
	}
}
