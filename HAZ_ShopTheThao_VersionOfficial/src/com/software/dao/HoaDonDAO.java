//* Coder: NGUYEN DOAN CHI THUC
//* Date of writing code: 29/11/2021
//* MSSV: PC01573
//* Class: IT16301
package com.software.dao;

import com.software.entity.HoaDon;
import com.software.jdbcHelper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO extends SoftwareDAO<HoaDon, Integer> {

    String INSERT_SQL = "INSERT INTO HDBan (MaHD, MaNV, MaKH, PhanTramGiam, NgayLapHD, TrangThai, GiaGiam, ThanhTien) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE HDBan SET MaNV = ?, MaKH = ?,  PhanTramGiam = ?, NgayLapHD = ?, TrangThai = ?, GiaGiam = ?, ThanhTien = ? WHERE MaHD = ?";
    String DELETE_SQL = "DELETE FROM HDBan WHERE MaHD = ? WHERE MaHD NOT IN (SELECT MaHD FROM ChiTietHoaDon)";
    String SELECT_ALL_SQL = "SELECT * FROM HDBan";
    String SELECT_BY_ID_SQL = "SELECT * FROM HDBan WHERE MaHD = ?";

    @Override
    public void insert(HoaDon entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getMaHD(),
                    entity.getMaNV(),
                    entity.getMaKH(),
                    entity.getPhanTramGiam(),
                    entity.getNgayLapHD(),
                    entity.getTrangThai(),
                    entity.getGiaGiam(),
                    entity.getThanhTien());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(HoaDon entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getMaNV(),
                    entity.getMaKH(),
                    entity.getPhanTramGiam(),
                    entity.getNgayLapHD(),
                    entity.getTrangThai(),
                    entity.getGiaGiam(),
                    entity.getThanhTien(),
                    entity.getMaHD());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void delete(Integer ID) {
        try {
            XJdbc.update(DELETE_SQL, ID);
        } catch (SQLException ex) {
        }
    }

    @Override
    public HoaDon SelectByID(Integer ID) {
        List<HoaDon> list = this.SelectBySQL(SELECT_BY_ID_SQL, ID);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> SelectAll() {
        return this.SelectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public List<HoaDon> SelectBySQL(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setMaNV(rs.getString("MaNV"));
                hd.setMaKH(rs.getInt("MaKH"));
                hd.setPhanTramGiam(rs.getInt("PhanTramGiam"));
                hd.setNgayLapHD(rs.getString("NgaylapHD"));
                hd.setTrangThai(rs.getString("TrangThai"));
                hd.setGiaGiam(rs.getDouble("GiaGiam"));
                hd.setThanhTien(rs.getDouble("ThanhTien"));
                list.add(hd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
