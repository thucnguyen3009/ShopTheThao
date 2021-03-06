//* Coder: NGUYEN DOAN CHI THUC
//* Date of writing code: 29/11/2021
//* MSSV: PC01573
//* Class: IT16301
package com.software.dao;

import com.software.entity.NhanVien;
import com.software.entity.TaiKhoan;
import com.software.jdbcHelper.MsgBox;
import com.software.jdbcHelper.XJdbc;
import com.software.ui.MainInterfaceDialog;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDAO extends SoftwareDAO<TaiKhoan, String> {

	String INSERT_SQL = "INSERT INTO TaiKhoan (SoDienThoai, Pass) VALUES (?, ?)";
	String UPDATE_SQL = "UPDATE TaiKhoan SET Pass = ? WHERE SoDienThoai = ?";
	String DELETE_SQL = "DELETE FROM TaiKhoan WHERE SoDienThoai = ?";
	String SELECT_ALL_SQL = "SELECT * FROM TaiKhoan";
	String SELECT_BY_ID_SQL = "SELECT * FROM TaiKhoan WHERE SoDienThoai = ?";

	@Override
	public void insert(TaiKhoan entity) {
		try {
			XJdbc.update(INSERT_SQL, entity.getSoDienThoai(), entity.getMatKhau());
		} catch (SQLException ex) {
		}
	}

	@Override
	public void update(TaiKhoan entity) {
		try {
			XJdbc.update(UPDATE_SQL, entity.getMatKhau(), entity.getSoDienThoai());
		} catch (SQLException ex) {
		}
	}

	@Override
	public void delete(String ID) {
		try {
			XJdbc.update(DELETE_SQL, ID);
		} catch (SQLException ex) {
		}
	}

	@Override
	public TaiKhoan SelectByID(String ID) {
		List<TaiKhoan> list = this.SelectBySQL(SELECT_BY_ID_SQL, ID);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public List<TaiKhoan> SelectAll() {
		return this.SelectBySQL(SELECT_ALL_SQL);
	}

	@Override
	public List<TaiKhoan> SelectBySQL(String sql, Object... args) {
		List<TaiKhoan> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				TaiKhoan taiKhoan = new TaiKhoan();
				taiKhoan.setSoDienThoai(rs.getString("SoDienThoai"));
				taiKhoan.setMatKhau(rs.getString("Pass"));
				list.add(taiKhoan);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void updatePass(String pass, String soDienThoai) {
		try {
			XJdbc.update(UPDATE_SQL, pass, soDienThoai);
		} catch (SQLException ex) {
		}
	}

	// Check Login
	public String CheckLogin(String username, String password) {
		TaiKhoan ac = SelectByID(username);
		if (!username.isEmpty() && !password.isEmpty()) {
			if (ac != null) {
				if (ac.getSoDienThoai().equalsIgnoreCase(username) && ac.getMatKhau().equals(password)) {
					return "????ng nh???p th??nh c??ng";
				}
			}
		}
		return "????ng nh???p th???t b???i";
	}

	// Check DangKy
	public String checkDangKy(String username, String password) {
		TaiKhoan tk = new TaiKhoan(username, password);
		TaiKhoan timKiem = SelectByID(username);

		NhanVienDAO dao = new NhanVienDAO();
		List<NhanVien> nv = dao.SelectBySDT(username);

		if (!username.isEmpty() && !password.isEmpty()) {
			if (nv != null) {
				if (timKiem == null) {
					insert(tk);
					timKiem = SelectByID(username);
					if (timKiem != null) {
						return "????ng k?? th??nh c??ng!";
					}
				}
			} else {
				return "SDT Nh??n Vi??n n??y kh??ng t???n t???i";
			}
		}
		return "????ng k?? th???t b???i!";
	}

	// Check update account
	public String checkCapNhatTaiKhoan(String username, String password, String confirmPass,
			boolean confirmChangePass) {
		TaiKhoan timKiem = SelectByID(username);
		String isPassWord = "^.{8,}";
		if (timKiem != null) {
			if (confirmChangePass == true) {
				if (confirmPass.equals(password) && password.matches(isPassWord)) {
					update(timKiem);
					return "C???p nh???t th??nh c??ng!";
				}
			} else {
				return "T??i kho???n ch??a c???p nh???t!";
			}
		}
		return "C???p nh???t th???t b???i!";

	}

	// check Xoa Tai Khoan
	public String checkXoaTaiKhoan(String username, boolean cofirmRemove) {
		TaiKhoan timKiem = SelectByID(username);
		if (!username.isEmpty()) {
			if (timKiem != null) {
				if (cofirmRemove == true) {
					delete(username);
					return "X??a th??nh c??ng!";
				}else {
					return "T??i kho???n ch??a ???????c x??a!";
				}
			}else {
				return "T??i kho???n kh??ng t???n t???i!";
			}
		}
		return "X??a th???t b???i!";

	}

	// Check Tim ki???m User
	public String checkTimKiemTK(String username) {
		TaiKhoan timKiem = SelectByID(username);

		if (!username.isEmpty()) {
			if (timKiem != null) {
				return "T??m th???y!";
			}
		} else {
			return "Vui l??ng nh???p Username";
		}
		return "T??i kho???n kh??ng t???n t???i!";
	}
	// Check
}
