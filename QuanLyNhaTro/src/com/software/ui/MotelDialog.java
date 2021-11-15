/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.ui;

import com.software.jdbc.Helper.XImage;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MotelDialog extends javax.swing.JFrame {

    /**
     * Creates new form CardLayout2
     */
    public MotelDialog() {
        initComponents();
        this.Init();
    }

    @SuppressWarnings("static-access")
    public void Init() {
        this.setTitle("Quản Lý Nhà Trọ Thiện Phong");
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(XImage.getAppIcon());
        pnlMenuCon.setVisible(false);
        pnlMenuCon.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    public void TrangThaiDanhMuc(JLabel icon, JLabel name, int chonKieu) {
        if (chonKieu == 1) {
            icon.setBackground(new Color(204, 204, 255));
            icon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            name.setBackground(new Color(204, 204, 255));
            name.setCursor(new Cursor(Cursor.HAND_CURSOR));
            name.setForeground(new Color(51, 153, 255));
            icon.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(102, 102, 102)));
        }
        if (chonKieu == 2) {
            icon.setBackground(new Color(0, 153, 255));
            name.setBackground(new Color(0, 153, 255));
            name.setForeground(new Color(255, 255, 255));
            icon.setBorder(null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        lblTrangChuIcon = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblNhanVienIcon = new javax.swing.JLabel();
        lblThietBi = new javax.swing.JLabel();
        lblThietBiIcon = new javax.swing.JLabel();
        lblPhong = new javax.swing.JLabel();
        lblPhongIcon = new javax.swing.JLabel();
        lblKhachHangIcon = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        lblTienNuoc = new javax.swing.JLabel();
        lblTienNuocIcon = new javax.swing.JLabel();
        lblTienDienIcon = new javax.swing.JLabel();
        lblTienDien = new javax.swing.JLabel();
        lblNhaTro = new javax.swing.JLabel();
        lblTenNhaTro = new javax.swing.JLabel();
        lblChao = new javax.swing.JLabel();
        lblThongKeIcon = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblHoaDonIcon = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblDangXuatIcon = new javax.swing.JLabel();
        lblThoat = new javax.swing.JLabel();
        lblThoatIcon = new javax.swing.JLabel();
        pnlThongTinTro = new javax.swing.JPanel();
        lblDiaChiTro = new javax.swing.JLabel();
        lblSilogan = new javax.swing.JLabel();
        lblSdtTro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlTrangChu = new javax.swing.JPanel();
        pnlSitatus = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTongQuanHeThong = new javax.swing.JLabel();
        pnlMenuCon = new javax.swing.JPanel();
        lblKhachHang2 = new javax.swing.JLabel();
        lblKhachHangIcon2 = new javax.swing.JLabel();
        lblKhachHang3 = new javax.swing.JLabel();
        lblKhachHangIcon3 = new javax.swing.JLabel();
        lblKhachHang4 = new javax.swing.JLabel();
        lblKhachHangIcon4 = new javax.swing.JLabel();
        lblKhachHang5 = new javax.swing.JLabel();
        lblKhachHangIcon5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(0, 153, 255));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        lblTrangChu.setBackground(new java.awt.Color(0, 153, 255));
        lblTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setText("Trang Chủ");
        lblTrangChu.setOpaque(true);
        lblTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseExited(evt);
            }
        });

        lblTrangChuIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblTrangChuIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/HomePage.png"))); // NOI18N
        lblTrangChuIcon.setOpaque(true);
        lblTrangChuIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrangChuIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTrangChuIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTrangChuIconMouseExited(evt);
            }
        });

        lblNhanVien.setBackground(new java.awt.Color(0, 153, 255));
        lblNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setText("Quản Lí Nhân Viên");
        lblNhanVien.setOpaque(true);
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseExited(evt);
            }
        });

        lblNhanVienIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblNhanVienIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVienIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/staff.png"))); // NOI18N
        lblNhanVienIcon.setOpaque(true);
        lblNhanVienIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNhanVienIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNhanVienIconMouseExited(evt);
            }
        });

        lblThietBi.setBackground(new java.awt.Color(0, 153, 255));
        lblThietBi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThietBi.setForeground(new java.awt.Color(255, 255, 255));
        lblThietBi.setText("Quản Lí Thiết Bị");
        lblThietBi.setOpaque(true);
        lblThietBi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThietBiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThietBiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThietBiMouseExited(evt);
            }
        });

        lblThietBiIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblThietBiIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThietBiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/tools.png"))); // NOI18N
        lblThietBiIcon.setOpaque(true);
        lblThietBiIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThietBiIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThietBiIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThietBiIconMouseExited(evt);
            }
        });

        lblPhong.setBackground(new java.awt.Color(0, 153, 255));
        lblPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhong.setForeground(new java.awt.Color(255, 255, 255));
        lblPhong.setText("Quản Lí Phòng");
        lblPhong.setOpaque(true);
        lblPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPhongMouseExited(evt);
            }
        });

        lblPhongIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblPhongIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhongIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/room.png"))); // NOI18N
        lblPhongIcon.setOpaque(true);
        lblPhongIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPhongIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPhongIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPhongIconMouseExited(evt);
            }
        });

        lblKhachHangIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHangIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHangIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/KhachHang.png"))); // NOI18N
        lblKhachHangIcon.setOpaque(true);
        lblKhachHangIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHangIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHangIconMouseExited(evt);
            }
        });

        lblKhachHang.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setText("Danh Mục Khách Hàng");
        lblKhachHang.setOpaque(true);
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseExited(evt);
            }
        });

        lblTienNuoc.setBackground(new java.awt.Color(0, 153, 255));
        lblTienNuoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTienNuoc.setForeground(new java.awt.Color(255, 255, 255));
        lblTienNuoc.setText("Tiền Nước");
        lblTienNuoc.setOpaque(true);
        lblTienNuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTienNuocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTienNuocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTienNuocMouseExited(evt);
            }
        });

        lblTienNuocIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblTienNuocIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienNuocIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/TienNuoc.png"))); // NOI18N
        lblTienNuocIcon.setOpaque(true);
        lblTienNuocIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTienNuocIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTienNuocIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTienNuocIconMouseExited(evt);
            }
        });

        lblTienDienIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblTienDienIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienDienIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/TienDien.png"))); // NOI18N
        lblTienDienIcon.setOpaque(true);
        lblTienDienIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTienDienIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTienDienIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTienDienIconMouseExited(evt);
            }
        });

        lblTienDien.setBackground(new java.awt.Color(0, 153, 255));
        lblTienDien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTienDien.setForeground(new java.awt.Color(255, 255, 255));
        lblTienDien.setText("Tiền Điện");
        lblTienDien.setOpaque(true);
        lblTienDien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTienDienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTienDienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTienDienMouseExited(evt);
            }
        });

        lblNhaTro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNhaTro.setForeground(new java.awt.Color(255, 255, 255));
        lblNhaTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhaTro.setText("NHÀ TRỌ");

        lblTenNhaTro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTenNhaTro.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNhaTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenNhaTro.setText("THIỆN PHONG");

        lblChao.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblChao.setForeground(new java.awt.Color(255, 255, 255));
        lblChao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChao.setText("Xin Chào, Nguyễn Đoàn Chí Thức!!!");

        lblThongKeIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblThongKeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/trend.png"))); // NOI18N
        lblThongKeIcon.setOpaque(true);
        lblThongKeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThongKeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongKeIconMouseExited(evt);
            }
        });

        lblThongKe.setBackground(new java.awt.Color(0, 153, 255));
        lblThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setText("Thống Kê");
        lblThongKe.setOpaque(true);
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongKeMouseExited(evt);
            }
        });

        lblHoaDon.setBackground(new java.awt.Color(0, 153, 255));
        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setText("Hóa Đơn");
        lblHoaDon.setOpaque(true);
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseExited(evt);
            }
        });

        lblHoaDonIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblHoaDonIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/bill.png"))); // NOI18N
        lblHoaDonIcon.setOpaque(true);
        lblHoaDonIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoaDonIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoaDonIconMouseExited(evt);
            }
        });

        lblDangXuat.setBackground(new java.awt.Color(0, 153, 255));
        lblDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setText("Đăng Xuất");
        lblDangXuat.setOpaque(true);
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseExited(evt);
            }
        });

        lblDangXuatIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblDangXuatIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuatIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/logout.png"))); // NOI18N
        lblDangXuatIcon.setOpaque(true);
        lblDangXuatIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatIconMouseExited(evt);
            }
        });

        lblThoat.setBackground(new java.awt.Color(0, 153, 255));
        lblThoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(255, 255, 255));
        lblThoat.setText("Thoát");
        lblThoat.setOpaque(true);
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThoatMouseExited(evt);
            }
        });

        lblThoatIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblThoatIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoatIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/PowerOff.png"))); // NOI18N
        lblThoatIcon.setOpaque(true);
        lblThoatIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThoatIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThoatIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhaTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTenNhaTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblChao, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblThietBiIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(lblPhongIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKhachHangIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTienNuocIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTienDienIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHoaDonIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThongKeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDangXuatIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThoatIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDangXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTienDien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTienNuoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThietBi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrangChuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNhanVienIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNhaTro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTenNhaTro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrangChuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhanVienIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThietBiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhongIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHangIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTienNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTienNuocIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTienDien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTienDienIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoaDonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThongKeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDangXuatIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThoatIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDiaChiTro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblDiaChiTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/DiaChi.png"))); // NOI18N
        lblDiaChiTro.setText(" KV-Bình Thường A, P.Long Tuyền, Q.Bình Thủy, TP.Cần Thơ. ");

        lblSilogan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSilogan.setForeground(new java.awt.Color(51, 102, 255));
        lblSilogan.setText("NHÀ TRỌ VĂN MINH - THÂN THIỆN");

        lblSdtTro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblSdtTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/Telephone.png"))); // NOI18N
        lblSdtTro.setText(" 090.777.3783 (Anh Nhật).");

        javax.swing.GroupLayout pnlThongTinTroLayout = new javax.swing.GroupLayout(pnlThongTinTro);
        pnlThongTinTro.setLayout(pnlThongTinTroLayout);
        pnlThongTinTroLayout.setHorizontalGroup(
            pnlThongTinTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinTroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSdtTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSilogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiaChiTro, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        pnlThongTinTroLayout.setVerticalGroup(
            pnlThongTinTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinTroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSilogan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiaChiTro)
                .addGap(0, 0, 0)
                .addComponent(lblSdtTro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlThongTinTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 99, 1079, 12));

        pnlTrangChu.setBackground(new java.awt.Color(255, 0, 51));
        pnlTrangChu.setName("TrangChu"); // NOI18N
        pnlTrangChu.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 109, 1079, 560));

        pnlSitatus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(102, 102, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/hourglass.png"))); // NOI18N
        lblTime.setText("10:00 AM");

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(102, 102, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/calendar.png"))); // NOI18N
        lblDate.setText("25/10/2021");

        lblTongQuanHeThong.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTongQuanHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/info.png"))); // NOI18N
        lblTongQuanHeThong.setText("Tổng quan về hệ thống");

        javax.swing.GroupLayout pnlSitatusLayout = new javax.swing.GroupLayout(pnlSitatus);
        pnlSitatus.setLayout(pnlSitatusLayout);
        pnlSitatusLayout.setHorizontalGroup(
            pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSitatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTongQuanHeThong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnlSitatusLayout.setVerticalGroup(
            pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSitatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTongQuanHeThong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(pnlSitatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 674, 1370, -1));

        pnlMenuCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMenuConMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMenuConMouseExited(evt);
            }
        });

        lblKhachHang2.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHang2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhachHang2.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang2.setText("Danh Mục Khách Hàng");
        lblKhachHang2.setOpaque(true);
        lblKhachHang2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHang2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHang2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHang2MouseExited(evt);
            }
        });

        lblKhachHangIcon2.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHangIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHangIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/KhachHang.png"))); // NOI18N
        lblKhachHangIcon2.setOpaque(true);
        lblKhachHangIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon2MouseExited(evt);
            }
        });

        lblKhachHang3.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHang3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhachHang3.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang3.setText("Danh Mục Khách Hàng");
        lblKhachHang3.setOpaque(true);
        lblKhachHang3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHang3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHang3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHang3MouseExited(evt);
            }
        });

        lblKhachHangIcon3.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHangIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHangIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/KhachHang.png"))); // NOI18N
        lblKhachHangIcon3.setOpaque(true);
        lblKhachHangIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon3MouseExited(evt);
            }
        });

        lblKhachHang4.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHang4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhachHang4.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang4.setText("Danh Mục Khách Hàng");
        lblKhachHang4.setOpaque(true);
        lblKhachHang4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHang4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHang4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHang4MouseExited(evt);
            }
        });

        lblKhachHangIcon4.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHangIcon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHangIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/KhachHang.png"))); // NOI18N
        lblKhachHangIcon4.setOpaque(true);
        lblKhachHangIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon4MouseExited(evt);
            }
        });

        lblKhachHang5.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHang5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhachHang5.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang5.setText("Danh Mục Khách Hàng");
        lblKhachHang5.setOpaque(true);
        lblKhachHang5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHang5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHang5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHang5MouseExited(evt);
            }
        });

        lblKhachHangIcon5.setBackground(new java.awt.Color(0, 153, 255));
        lblKhachHangIcon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHangIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/KhachHang.png"))); // NOI18N
        lblKhachHangIcon5.setOpaque(true);
        lblKhachHangIcon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHangIcon5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuConLayout = new javax.swing.GroupLayout(pnlMenuCon);
        pnlMenuCon.setLayout(pnlMenuConLayout);
        pnlMenuConLayout.setHorizontalGroup(
            pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuConLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuConLayout.createSequentialGroup()
                        .addComponent(lblKhachHangIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblKhachHang3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addGroup(pnlMenuConLayout.createSequentialGroup()
                        .addComponent(lblKhachHangIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblKhachHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuConLayout.createSequentialGroup()
                        .addComponent(lblKhachHangIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblKhachHang4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuConLayout.createSequentialGroup()
                        .addComponent(lblKhachHangIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblKhachHang5, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
        );
        pnlMenuConLayout.setVerticalGroup(
            pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuConLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhachHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHangIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhachHang3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHangIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhachHang4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHangIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhachHang5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHangIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        getContentPane().add(pnlMenuCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 310, 180));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 30));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseEntered
        this.TrangThaiDanhMuc(lblTrangChuIcon, lblTrangChu, 1);
    }//GEN-LAST:event_lblTrangChuMouseEntered

    private void lblTrangChuIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuIconMouseEntered
        this.TrangThaiDanhMuc(lblTrangChuIcon, lblTrangChu, 1);
    }//GEN-LAST:event_lblTrangChuIconMouseEntered

    private void lblTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseExited
        this.TrangThaiDanhMuc(lblTrangChuIcon, lblTrangChu, 2);
    }//GEN-LAST:event_lblTrangChuMouseExited

    private void lblTrangChuIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuIconMouseExited
        this.TrangThaiDanhMuc(lblTrangChuIcon, lblTrangChu, 2);
    }//GEN-LAST:event_lblTrangChuIconMouseExited

    private void lblNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseEntered
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 1);
    }//GEN-LAST:event_lblNhanVienMouseEntered

    private void lblNhanVienIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienIconMouseEntered
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 1);
    }//GEN-LAST:event_lblNhanVienIconMouseEntered

    private void lblNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseExited
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 2);
    }//GEN-LAST:event_lblNhanVienMouseExited

    private void lblNhanVienIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienIconMouseExited
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 2);
    }//GEN-LAST:event_lblNhanVienIconMouseExited

    private void lblThietBiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThietBiMouseEntered
        this.TrangThaiDanhMuc(lblThietBiIcon, lblThietBi, 1);
    }//GEN-LAST:event_lblThietBiMouseEntered

    private void lblThietBiIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThietBiIconMouseEntered
        this.TrangThaiDanhMuc(lblThietBiIcon, lblThietBi, 1);
    }//GEN-LAST:event_lblThietBiIconMouseEntered

    private void lblThietBiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThietBiMouseExited
        this.TrangThaiDanhMuc(lblThietBiIcon, lblThietBi, 2);
    }//GEN-LAST:event_lblThietBiMouseExited

    private void lblThietBiIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThietBiIconMouseExited
        this.TrangThaiDanhMuc(lblThietBiIcon, lblThietBi, 2);
    }//GEN-LAST:event_lblThietBiIconMouseExited

    private void lblPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhongMouseEntered
        this.TrangThaiDanhMuc(lblPhongIcon, lblPhong, 1);
        pnlMenuCon.setVisible(true);
    }//GEN-LAST:event_lblPhongMouseEntered

    private void lblPhongIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhongIconMouseEntered
        this.TrangThaiDanhMuc(lblPhongIcon, lblPhong, 1);
    }//GEN-LAST:event_lblPhongIconMouseEntered

    private void lblPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhongMouseExited
        this.TrangThaiDanhMuc(lblPhongIcon, lblPhong, 2);
        pnlMenuCon.setVisible(false);
    }//GEN-LAST:event_lblPhongMouseExited

    private void lblPhongIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhongIconMouseExited
        this.TrangThaiDanhMuc(lblPhongIcon, lblPhong, 2);
    }//GEN-LAST:event_lblPhongIconMouseExited

    private void lblKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseEntered
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 1);
    }//GEN-LAST:event_lblKhachHangMouseEntered

    private void lblKhachHangIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIconMouseEntered
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 1);
    }//GEN-LAST:event_lblKhachHangIconMouseEntered

    private void lblKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseExited
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 2);
    }//GEN-LAST:event_lblKhachHangMouseExited

    private void lblKhachHangIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIconMouseExited
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 2);
    }//GEN-LAST:event_lblKhachHangIconMouseExited

    private void lblTienNuocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienNuocMouseEntered
        this.TrangThaiDanhMuc(lblTienNuocIcon, lblTienNuoc, 1);
    }//GEN-LAST:event_lblTienNuocMouseEntered

    private void lblTienNuocIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienNuocIconMouseEntered
        this.TrangThaiDanhMuc(lblTienNuocIcon, lblTienNuoc, 1);
    }//GEN-LAST:event_lblTienNuocIconMouseEntered

    private void lblTienNuocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienNuocMouseExited
        this.TrangThaiDanhMuc(lblTienNuocIcon, lblTienNuoc, 2);
    }//GEN-LAST:event_lblTienNuocMouseExited

    private void lblTienNuocIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienNuocIconMouseExited
        this.TrangThaiDanhMuc(lblTienNuocIcon, lblTienNuoc, 2);
    }//GEN-LAST:event_lblTienNuocIconMouseExited

    private void lblTienDienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienDienMouseEntered
        this.TrangThaiDanhMuc(lblTienDienIcon, lblTienDien, 1);
    }//GEN-LAST:event_lblTienDienMouseEntered

    private void lblTienDienIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienDienIconMouseEntered
        this.TrangThaiDanhMuc(lblTienDienIcon, lblTienDien, 1);
    }//GEN-LAST:event_lblTienDienIconMouseEntered

    private void lblTienDienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienDienMouseExited
        this.TrangThaiDanhMuc(lblTienDienIcon, lblTienDien, 2);
    }//GEN-LAST:event_lblTienDienMouseExited

    private void lblTienDienIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienDienIconMouseExited
        this.TrangThaiDanhMuc(lblTienDienIcon, lblTienDien, 2);
    }//GEN-LAST:event_lblTienDienIconMouseExited

    private void lblHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseEntered
        this.TrangThaiDanhMuc(lblHoaDonIcon, lblHoaDon, 1);
    }//GEN-LAST:event_lblHoaDonMouseEntered

    private void lblHoaDonIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonIconMouseEntered
        this.TrangThaiDanhMuc(lblHoaDonIcon, lblHoaDon, 1);
    }//GEN-LAST:event_lblHoaDonIconMouseEntered

    private void lblHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseExited
        this.TrangThaiDanhMuc(lblHoaDonIcon, lblHoaDon, 2);
    }//GEN-LAST:event_lblHoaDonMouseExited

    private void lblHoaDonIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonIconMouseExited
        this.TrangThaiDanhMuc(lblHoaDonIcon, lblHoaDon, 2);
    }//GEN-LAST:event_lblHoaDonIconMouseExited

    private void lblThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseEntered
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 1);
    }//GEN-LAST:event_lblThongKeMouseEntered

    private void lblThongKeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeIconMouseEntered
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 1);
    }//GEN-LAST:event_lblThongKeIconMouseEntered

    private void lblThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseExited
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 2);
    }//GEN-LAST:event_lblThongKeMouseExited

    private void lblThongKeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeIconMouseExited
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 2);
    }//GEN-LAST:event_lblThongKeIconMouseExited

    private void lblDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseEntered
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 1);
    }//GEN-LAST:event_lblDangXuatMouseEntered

    private void lblDangXuatIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatIconMouseEntered
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 1);
    }//GEN-LAST:event_lblDangXuatIconMouseEntered

    private void lblDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseExited
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 2);
    }//GEN-LAST:event_lblDangXuatMouseExited

    private void lblDangXuatIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatIconMouseExited
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 2);
    }//GEN-LAST:event_lblDangXuatIconMouseExited

    private void lblThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseEntered
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 1);
    }//GEN-LAST:event_lblThoatMouseEntered

    private void lblThoatIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatIconMouseEntered
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 1);
    }//GEN-LAST:event_lblThoatIconMouseEntered

    private void lblThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseExited
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 2);
    }//GEN-LAST:event_lblThoatMouseExited

    private void lblThoatIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatIconMouseExited
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 2);
    }//GEN-LAST:event_lblThoatIconMouseExited

    private void lblTrangChuIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTrangChuIconMouseClicked

    private void lblTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTrangChuMouseClicked

    private void lblNhanVienIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNhanVienIconMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblThietBiIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThietBiIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThietBiIconMouseClicked

    private void lblThietBiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThietBiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThietBiMouseClicked

    private void lblPhongIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhongIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPhongIconMouseClicked

    private void lblPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhongMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPhongMouseClicked

    private void lblKhachHangIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIconMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblTienNuocIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienNuocIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTienNuocIconMouseClicked

    private void lblTienNuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienNuocMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTienNuocMouseClicked

    private void lblTienDienIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienDienIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTienDienIconMouseClicked

    private void lblTienDienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTienDienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTienDienMouseClicked

    private void lblHoaDonIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHoaDonIconMouseClicked

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void lblThongKeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongKeIconMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblDangXuatIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDangXuatIconMouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblThoatIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblThoatIconMouseClicked

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblThoatMouseClicked

    private void pnlMenuConMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuConMouseEntered
        pnlMenuCon.setVisible(true);
    }//GEN-LAST:event_pnlMenuConMouseEntered

    private void pnlMenuConMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuConMouseExited
        pnlMenuCon.setVisible(false);
    }//GEN-LAST:event_pnlMenuConMouseExited

    private void lblKhachHang2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang2MouseClicked

    private void lblKhachHang2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang2MouseEntered

    private void lblKhachHang2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang2MouseExited

    private void lblKhachHangIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon2MouseClicked

    private void lblKhachHangIcon2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon2MouseEntered

    private void lblKhachHangIcon2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon2MouseExited

    private void lblKhachHang3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang3MouseClicked

    private void lblKhachHang3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang3MouseEntered

    private void lblKhachHang3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang3MouseExited

    private void lblKhachHangIcon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon3MouseClicked

    private void lblKhachHangIcon3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon3MouseEntered

    private void lblKhachHangIcon3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon3MouseExited

    private void lblKhachHang4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang4MouseClicked

    private void lblKhachHang4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang4MouseEntered

    private void lblKhachHang4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang4MouseExited

    private void lblKhachHangIcon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon4MouseClicked

    private void lblKhachHangIcon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon4MouseEntered

    private void lblKhachHangIcon4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon4MouseExited

    private void lblKhachHang5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang5MouseClicked

    private void lblKhachHang5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang5MouseEntered

    private void lblKhachHang5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHang5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHang5MouseExited

    private void lblKhachHangIcon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon5MouseClicked

    private void lblKhachHangIcon5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon5MouseEntered

    private void lblKhachHangIcon5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIcon5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblKhachHangIcon5MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MotelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MotelDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblChao;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDangXuatIcon;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiaChiTro;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblHoaDonIcon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhachHang2;
    private javax.swing.JLabel lblKhachHang3;
    private javax.swing.JLabel lblKhachHang4;
    private javax.swing.JLabel lblKhachHang5;
    private javax.swing.JLabel lblKhachHangIcon;
    private javax.swing.JLabel lblKhachHangIcon2;
    private javax.swing.JLabel lblKhachHangIcon3;
    private javax.swing.JLabel lblKhachHangIcon4;
    private javax.swing.JLabel lblKhachHangIcon5;
    private javax.swing.JLabel lblNhaTro;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblNhanVienIcon;
    private javax.swing.JLabel lblPhong;
    private javax.swing.JLabel lblPhongIcon;
    private javax.swing.JLabel lblSdtTro;
    private javax.swing.JLabel lblSilogan;
    private javax.swing.JLabel lblTenNhaTro;
    private javax.swing.JLabel lblThietBi;
    private javax.swing.JLabel lblThietBiIcon;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblThoatIcon;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblThongKeIcon;
    private javax.swing.JLabel lblTienDien;
    private javax.swing.JLabel lblTienDienIcon;
    private javax.swing.JLabel lblTienNuoc;
    private javax.swing.JLabel lblTienNuocIcon;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTongQuanHeThong;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel lblTrangChuIcon;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuCon;
    private javax.swing.JPanel pnlSitatus;
    private javax.swing.JPanel pnlThongTinTro;
    private javax.swing.JPanel pnlTrangChu;
    // End of variables declaration//GEN-END:variables
}
