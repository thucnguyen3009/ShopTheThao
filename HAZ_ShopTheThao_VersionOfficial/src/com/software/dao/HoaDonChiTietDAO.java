//* Coder: NGUYEN DOAN CHI THUC
//* Date of writing code: 29/11/2021
//* MSSV: PC01573
//* Class: IT16301
package com.software.dao;

import com.software.entity.HoaDonChiTiet;
import com.software.jdbcHelper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoaDonChiTietDAO extends SoftwareDAO<HoaDonChiTiet, Integer> {

    String INSERT_SQL = "INSERT INTO ChiTietHoaDon (MaHDCT, MaHD, MaSP, SoLuong, DonGia) VALUES (?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE ChiTietHoaDon SET MaSP = ?, SoLuong = ? WHERE MaHDCT = ? AND MaSP = ?";
    String DELETE_SQL = "DELETE FROM ChiTietHoaDon WHERE MaHDCT = ? AND MaSP = ? AND MaHD= ?";
    String SELECT_ALL_SQL = "SELECT * FROM ChiTietHoaDon";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietHoaDon WHERE MaHDCT = ?";

    @Override
    public void insert(HoaDonChiTiet entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getMaHDCT(),
                    entity.getMaHD(),
                    entity.getMaSP(),
                    entity.getSoLuong(),
                    entity.getDonGia());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getMaSP(),
                    entity.getSoLuong(),
                    entity.getMaHDCT(),
                    entity.getMaSP());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void delete(Integer ID) {
    }

    public void delete(HoaDonChiTiet E) {
        try {
            XJdbc.update(DELETE_SQL, E.getMaHDCT(), E.getMaSP(), E.getMaHD());
        } catch (SQLException ex) {
        }
    }

    @Override
    public HoaDonChiTiet SelectByID(Integer ID) {
        List<HoaDonChiTiet> list = this.SelectBySQL(SELECT_BY_ID_SQL, ID);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDonChiTiet> SelectAll() {
        return this.SelectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public List<HoaDonChiTiet> SelectBySQL(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setMaHDCT(rs.getInt("MaHDCT"));
                hdct.setMaHD(rs.getInt("MaHD"));
                hdct.setMaSP(rs.getString("MaSP"));
                hdct.setSoLuong(rs.getInt("SoLuong"));
                hdct.setDonGia(rs.getDouble("DonGia"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
