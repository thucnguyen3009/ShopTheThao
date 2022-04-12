//* Coder: NGUYEN DOAN CHI THUC
//* Date of writing code: 29/11/2021
//* MSSV: PC01573
//* Class: IT16301
package com.software.dao;

import com.software.jdbcHelper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DoanhThuDAO {

	String sql;

	private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
		List<Object[]> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				Object[] vals = new Object[cols.length];
				for (int i = 0; i < cols.length; i++) {
					vals[i] = rs.getObject(cols[i]);

				}
				list.add(vals);
			}
			rs.getStatement().getConnection().close();

		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
		return list;
	}

	public List<Object[]> getDoanhThu(String ngayBatDau, String ngayKetThuc) {
		sql = "{CALL sp_thongke(?,?)}";
		String[] cols = { "Tổng Tiền Bán Được", "Tổng Giá Giảm", "Doanh Thu" };
		return this.getListOfArray(sql, cols, ngayBatDau, ngayKetThuc);
	}

	// checkDT
	public String checkDoanhThua(String ngayBatDau, String ngayKetThuc) {
		List<Object[]> list = getDoanhThu(ngayBatDau, ngayKetThuc);

		if (!ngayBatDau.equals("") && !ngayKetThuc.equals("")) {
			if (list != null) {
				return "Thống kê thành công";
			}
		}
		return "Thống kê thất bại";
	}
}
