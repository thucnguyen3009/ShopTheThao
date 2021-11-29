//* Coder: BUI TRONG NHAN
//* Date of writing code: 29/11/2021
//* MSSV: PC01721
//* Class: IT16301
package com.software.dao;

import com.software.entity.NhanVien;
import com.software.jdbcHelper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {

    String INSERT_SQL = "INSERT INTO NHANVIEN(MANV, HONV, TENNV, ,GIOITINH, CHUCVU, SDT, GMAIL, CMND, DIACHI) VALUES ( ?, ?, ?, ?, ?, ?, ? , ? , ?)";
    String UPDATE_SQL = "UPDATE NHANVIEN SET  HONV =?, TENNV =?, GIOITINH = ?, CHUCVU = ?, SDT = ?, GMAIL = ?, CMND = ?, DIACHI = ? WHERE MANV =?";
    String DELETE_SQL = "DELETE FROM NHANVIEN WHERE MANV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN";
    String SELECT_BY_ID_SQL = "SELECT * FROM NHANVIEN WHERE MANV = ?";

    public void insert(NhanVien entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getMANV(), entity.getHONV(), entity.getTENNV(), entity.isGIOITINH(),
                    entity.getCHUCVU(), entity.getSDT(), entity.getGMAIL(), entity.getCMND(), entity.getDIACHI());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void update(NhanVien entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getMANV(), entity.getHONV(), entity.getTENNV(), entity.isGIOITINH(),
                    entity.getCHUCVU(), entity.getSDT(), entity.getGMAIL(), entity.getCMND(), entity.getDIACHI());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void delete(String id) {
        try {
            XJdbc.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet result = XJdbc.query(sql, args);
            while (result.next()) {
                NhanVien entity = new NhanVien();
                entity.setMANV(result.getString("MANV"));
                entity.setHONV(result.getString("HONV"));
                entity.setTENNV(result.getString("TENNV"));
                entity.setGIOITINH(result.getBoolean("GIOITINH"));
                entity.setCHUCVU(result.getString("CHUCVU"));
                entity.setSDT(result.getString("SDT"));
                entity.setGMAIL(result.getString("GMAIL"));
                entity.setCMND(result.getString("CMND"));
                entity.setDIACHI(result.getString("DIACHI"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<NhanVien> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM NHANVIEN WHERE HOTEN LIKE ?";
        return selectBySql(sql, "%" + keyword + "%");
    }
}
