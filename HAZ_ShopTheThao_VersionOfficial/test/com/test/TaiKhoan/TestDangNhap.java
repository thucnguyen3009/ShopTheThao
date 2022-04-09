package com.test.TaiKhoan;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.NhanVienDAO;
import com.software.dao.TaiKhoanDAO;
import com.software.entity.NhanVien;
import com.software.entity.TaiKhoan;

public class TestDangNhap {

	private String sql = "";
	private TaiKhoanDAO taiKhoanDAO;
	
	@BeforeClass
	public void initialize() {
		taiKhoanDAO = new TaiKhoanDAO();
	}
	
	@DataProvider(name="db")
	private Object[][]data(){
		return new Object[][] {
			{"0769331203","admin@123",true},
			{"0946492294","admin@123",true},
			{"0978215902","admin@123",true}
		};
	}
	
	@Test(dataProvider = "db")
	public void f(String username,String password,boolean result) {
		Assert.assertEquals(result, taiKhoanDAO.CheckLogin(username, password));
	}
	
	
	

}
