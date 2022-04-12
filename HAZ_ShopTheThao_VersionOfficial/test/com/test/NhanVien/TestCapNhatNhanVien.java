package com.test.NhanVien;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.software.dao.NhanVienDAO;
import com.software.entity.NhanVien;

public class TestCapNhatNhanVien {
	private NhanVienDAO dao;

	@BeforeClass
	public void initialize() {
		dao = new NhanVienDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { 
				{ getForm1().getMaNV(),getForm1().getSoDienThoai(),getForm1(),"Cập nhật thất bại!"}, 
				{ getForm1().getMaNV(),getForm1().getSoDienThoai(),getForm1(),"Cập nhật thất bại!"},
				{ getForm1().getMaNV(),getForm1().getSoDienThoai(),getForm1(),"Cập nhật thành công!"}, };
	}
	public NhanVien getForm1() {
        NhanVien nv = new NhanVien();
        nv.setMaNV("1");
        nv.setTenNV("Lê Văn Thành 2");
        nv.setGioiTinh(true);
        nv.setSoDienThoai("0973438765");
        nv.setGmail("levanthanh039@gmail.com");
        nv.setCmnd("337647645");
        nv.setDiaChi("Cần Thơ");
        nv.setMaChucVu("1");
        nv.setPath("src\\com\\software\\images\\CHOPPER.jpg");
        return nv;
    }
	
	@Test(dataProvider = "db")
	public void testThemNhanVien(String manv,String sdt,NhanVien nv, String result) {
		Assert.assertEquals(result, dao.checkCapNhatNhanVien(manv,sdt,nv));
	}
  
}
