//* Responsible: HAZ TEAM
//* First coder: NGUYEN DOAN CHI THUC - PC01573
//* Second coder: BUI TRONG NHAN - PC01721
//* Third coder: HUYNH VAN DAT - PC01684
//* Date of writing code: 15/11/2021
//* Last edited:. . .
//* Class: IT16301
//* Version: 1.0.0
package com.software.ui;

import com.software.jdbc.Helper.XImage;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainInterfaceDialog extends javax.swing.JFrame {

    public int manHinhHienThi = 0; //Biến dùng để nhận biết đang ở màn hình tương tác nào.

    public MainInterfaceDialog() {
        initComponents();
        this.Init();
    }

    /*1. Các hàm sử dụng chung cho menu chức năng:
        Init();
        TrieuHoiCard(); - Chịu trách nhiệm: NGUYEN DOAN CHI THUC
        TrangThaiDanhMuc(); - Chịu trách nhiệm: NGUYEN DOAN CHI THUC
        ManHinhHienThi(); - Chịu trách nhiệm: NGUYEN DOAN CHI THUC*/
    @SuppressWarnings("static-access")
    public void Init() {
        this.ManHinhHienThi();
        this.setTitle("Shop Thể Thao BingBong");
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(XImage.getAppIcon());
        pnlMenuCon.setVisible(false);
        pnlMenuCon.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    public void TrieuHoiCard(JPanel pnlJPanel, String cardName) {
        CardLayout layout = (CardLayout) pnlJPanel.getLayout();
        layout.show(pnlJPanel, cardName);
    }

    public void TrangThaiDanhMuc(JLabel icon, JLabel name, int chonKieu) {
        if (chonKieu == 1) {
            icon.setBackground(new Color(255, 255, 255));
            icon.setCursor(new Cursor(Cursor.HAND_CURSOR));
            name.setBackground(new Color(255, 255, 255));
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

    public void ManHinhHienThi() {
        if (manHinhHienThi == 0) {
            TrangThaiDanhMuc(lblTrangChuIcon, lblTrangChu, 1);
        } else {
            TrangThaiDanhMuc(lblTrangChuIcon, lblTrangChu, 2);
        }
        if (manHinhHienThi == 1) {
            TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 1);
        } else {
            TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 2);
        }
        if (manHinhHienThi == 2) {
            TrangThaiDanhMuc(lblSanPhamIcon, lblSanPham, 1);
        } else {
            TrangThaiDanhMuc(lblSanPhamIcon, lblSanPham, 2);
        }
        if (manHinhHienThi == 3) {
            TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
            TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 1);
        } else {
            TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 2);
        }
        if (manHinhHienThi == 4) {
            TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
            TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 1);
        } else {
            TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 2);
        }
        if (manHinhHienThi == 3 || manHinhHienThi == 4) {
            TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
        } else {
            TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        }
        if (manHinhHienThi == 5) {
            TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 1);
        } else {
            TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 2);
        }
        if (manHinhHienThi == 6) {
            TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 1);
        } else {
            TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 2);
        }

    }

    /*========================================================================*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenuCon = new javax.swing.JPanel();
        lblLapHoaDon = new javax.swing.JLabel();
        lblLapHoaDonIcon = new javax.swing.JLabel();
        lblHoaDonDaThanhToanIcon = new javax.swing.JLabel();
        lblHoaDonDaThanhToan = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        lblTrangChuIcon = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblNhanVienIcon = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        lblSanPhamIcon = new javax.swing.JLabel();
        lblBanHang = new javax.swing.JLabel();
        lblBanHangIcon = new javax.swing.JLabel();
        lblKhachHangIcon = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        lblNhaTro = new javax.swing.JLabel();
        lblTenNhaTro = new javax.swing.JLabel();
        lblChao = new javax.swing.JLabel();
        lblThongKeIcon = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblDangXuatIcon = new javax.swing.JLabel();
        lblThoat = new javax.swing.JLabel();
        lblThoatIcon = new javax.swing.JLabel();
        pnlThongTinTro = new javax.swing.JPanel();
        lblDiaChiTro = new javax.swing.JLabel();
        lblSilogan = new javax.swing.JLabel();
        lblSdtTro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlChinh = new javax.swing.JPanel();
        pnlTrangChu = new javax.swing.JPanel();
        pnlNhanVien = new javax.swing.JPanel();
        pnlSanPham = new javax.swing.JPanel();
        pnlLapHoaDon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlXemHoaDon = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        pnlDoanhThu = new javax.swing.JPanel();
        pnlSitatus = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTongQuanHeThong = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenuCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMenuConMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMenuConMouseExited(evt);
            }
        });

        lblLapHoaDon.setBackground(new java.awt.Color(0, 153, 255));
        lblLapHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLapHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblLapHoaDon.setText("Lập Hóa Đơn");
        lblLapHoaDon.setOpaque(true);
        lblLapHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLapHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLapHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLapHoaDonMouseExited(evt);
            }
        });

        lblLapHoaDonIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblLapHoaDonIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLapHoaDonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/tools.png"))); // NOI18N
        lblLapHoaDonIcon.setOpaque(true);
        lblLapHoaDonIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLapHoaDonIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLapHoaDonIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLapHoaDonIconMouseExited(evt);
            }
        });

        lblHoaDonDaThanhToanIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblHoaDonDaThanhToanIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDonDaThanhToanIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/tools.png"))); // NOI18N
        lblHoaDonDaThanhToanIcon.setOpaque(true);
        lblHoaDonDaThanhToanIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonDaThanhToanIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoaDonDaThanhToanIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoaDonDaThanhToanIconMouseExited(evt);
            }
        });

        lblHoaDonDaThanhToan.setBackground(new java.awt.Color(0, 153, 255));
        lblHoaDonDaThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHoaDonDaThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDonDaThanhToan.setText("Hóa Đơn Đã Thanh Toán");
        lblHoaDonDaThanhToan.setOpaque(true);
        lblHoaDonDaThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonDaThanhToanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoaDonDaThanhToanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoaDonDaThanhToanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuConLayout = new javax.swing.GroupLayout(pnlMenuCon);
        pnlMenuCon.setLayout(pnlMenuConLayout);
        pnlMenuConLayout.setHorizontalGroup(
            pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuConLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuConLayout.createSequentialGroup()
                        .addComponent(lblLapHoaDonIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblLapHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuConLayout.createSequentialGroup()
                        .addComponent(lblHoaDonDaThanhToanIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lblHoaDonDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        pnlMenuConLayout.setVerticalGroup(
            pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuConLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLapHoaDonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLapHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoaDonDaThanhToanIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoaDonDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMenuCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 300, 90));

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

        lblSanPham.setBackground(new java.awt.Color(0, 153, 255));
        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setText("Quản Lý Sản Phẩm");
        lblSanPham.setOpaque(true);
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseExited(evt);
            }
        });

        lblSanPhamIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblSanPhamIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPhamIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/tools.png"))); // NOI18N
        lblSanPhamIcon.setOpaque(true);
        lblSanPhamIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSanPhamIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSanPhamIconMouseExited(evt);
            }
        });

        lblBanHang.setBackground(new java.awt.Color(0, 153, 255));
        lblBanHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setText("Bán Hàng");
        lblBanHang.setOpaque(true);
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBanHangMouseExited(evt);
            }
        });

        lblBanHangIcon.setBackground(new java.awt.Color(0, 153, 255));
        lblBanHangIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHangIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/room.png"))); // NOI18N
        lblBanHangIcon.setOpaque(true);
        lblBanHangIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBanHangIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBanHangIconMouseExited(evt);
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

        lblNhaTro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNhaTro.setForeground(new java.awt.Color(255, 255, 255));
        lblNhaTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhaTro.setText("SHOP THỂ THAO");

        lblTenNhaTro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTenNhaTro.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNhaTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenNhaTro.setText("BING BONG");

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
        lblThongKe.setText("Xem Doanh Thu");
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
                            .addComponent(lblSanPhamIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(lblBanHangIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKhachHangIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThongKeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDangXuatIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThoatIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDangXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBanHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrangChuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNhanVienIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                    .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSanPhamIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBanHangIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHangIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(179, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDiaChiTro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblDiaChiTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/DiaChi.png"))); // NOI18N
        lblDiaChiTro.setText(" KV-Bình Thường A, P.Long Tuyền, Q.Bình Thủy, TP.Cần Thơ. ");

        lblSilogan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSilogan.setForeground(new java.awt.Color(51, 102, 255));
        lblSilogan.setText("Chất Lượng Là Danh Dự - Tất Cả Vì Khách Hàng");

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

        pnlChinh.setBackground(new java.awt.Color(255, 0, 51));
        pnlChinh.setName("Chinh"); // NOI18N
        pnlChinh.setLayout(new java.awt.CardLayout());

        pnlTrangChu.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlTrangChuLayout = new javax.swing.GroupLayout(pnlTrangChu);
        pnlTrangChu.setLayout(pnlTrangChuLayout);
        pnlTrangChuLayout.setHorizontalGroup(
            pnlTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        pnlTrangChuLayout.setVerticalGroup(
            pnlTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        pnlChinh.add(pnlTrangChu, "trangChu");

        pnlNhanVien.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        pnlChinh.add(pnlNhanVien, "nhanVien");

        pnlSanPham.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        pnlChinh.add(pnlSanPham, "sanPham");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên KH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "SL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Nhập SĐT KH. . .");
        jTextField1.setToolTipText("Tìm Khách Hàng");

        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Nhập Mã hoặc Tên SP. . .");
        jTextField2.setToolTipText("Tìm SP");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Tên KH");

        jTextField3.setEditable(false);

        jLabel5.setText("SĐT KH");

        jTextField5.setEditable(false);

        jLabel6.setText("Ngày Lập HD");

        jTextField6.setEditable(false);

        jLabel7.setText("Phần Trăm Giảm Giá");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "SL", "Đơn Giá", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel10.setText("Mã KH");

        jTextField8.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tiền Cần Thanh Toán: 0 VND");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" }));

        jLabel1.setText("Số Tiền Giảm: 0 VND");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel2.setToolTipText("Reset Hóa Đơn");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/pay.png"))); // NOI18N
        jLabel8.setText("THANH TOÁN");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/printbill.png"))); // NOI18N
        jLabel9.setText("IN HÓA ĐƠN");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(136, 136, 136)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlLapHoaDonLayout = new javax.swing.GroupLayout(pnlLapHoaDon);
        pnlLapHoaDon.setLayout(pnlLapHoaDonLayout);
        pnlLapHoaDonLayout.setHorizontalGroup(
            pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLapHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlLapHoaDonLayout.setVerticalGroup(
            pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLapHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLapHoaDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlChinh.add(pnlLapHoaDon, "lapHoaDon");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HDCT", "Tên KH", "Ngày Lập HD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel11.setText("Mã KH");

        jTextField9.setEditable(false);

        jTextField4.setEditable(false);

        jLabel12.setText("Tên KH");

        jLabel13.setText("SĐT KH");

        jTextField7.setEditable(false);

        jLabel14.setText("Ngày Lập HD");

        jTextField10.setEditable(false);

        jLabel15.setText("Phần Trăm Giảm Giá");

        jComboBox2.setEditable(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" }));

        jLabel16.setText("Số Tiền Giảm: 0 VND");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "SL", "Đơn Giá", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Tiền Cần Thanh Toán: 0 VND");

        jTextField11.setForeground(new java.awt.Color(204, 204, 204));
        jTextField11.setText("Nhập SĐT KH hoặc Mã HDCT để tìm HD. . .");

        jLabel19.setText("Mã Thu Ngân");

        jTextField12.setEditable(false);

        jLabel20.setText("Tên Thu Ngân");

        jTextField13.setEditable(false);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/printbill.png"))); // NOI18N
        jLabel18.setText("IN HÓA ĐƠN");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/paper-bin.png"))); // NOI18N
        jLabel21.setText("XÓA HÓA ĐƠN");
        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlXemHoaDonLayout = new javax.swing.GroupLayout(pnlXemHoaDon);
        pnlXemHoaDon.setLayout(pnlXemHoaDonLayout);
        pnlXemHoaDonLayout.setHorizontalGroup(
            pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField11)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlXemHoaDonLayout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        pnlXemHoaDonLayout.setVerticalGroup(
            pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );

        pnlChinh.add(pnlXemHoaDon, "xemHoaDon");

        pnlKhachHang.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        pnlChinh.add(pnlKhachHang, "khachHang");

        pnlDoanhThu.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        pnlChinh.add(pnlDoanhThu, "doanhThu");

        getContentPane().add(pnlChinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 109, 1079, 560));

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
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblTrangChuMouseExited

    private void lblTrangChuIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuIconMouseExited
        this.TrangThaiDanhMuc(lblTrangChuIcon, lblTrangChu, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblTrangChuIconMouseExited

    private void lblNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseEntered
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 1);
    }//GEN-LAST:event_lblNhanVienMouseEntered

    private void lblNhanVienIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienIconMouseEntered
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 1);
    }//GEN-LAST:event_lblNhanVienIconMouseEntered

    private void lblNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseExited
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblNhanVienMouseExited

    private void lblNhanVienIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienIconMouseExited
        this.TrangThaiDanhMuc(lblNhanVienIcon, lblNhanVien, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblNhanVienIconMouseExited

    private void lblSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseEntered
        this.TrangThaiDanhMuc(lblSanPhamIcon, lblSanPham, 1);
    }//GEN-LAST:event_lblSanPhamMouseEntered

    private void lblSanPhamIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamIconMouseEntered
        this.TrangThaiDanhMuc(lblSanPhamIcon, lblSanPham, 1);
    }//GEN-LAST:event_lblSanPhamIconMouseEntered

    private void lblSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseExited
        this.TrangThaiDanhMuc(lblSanPhamIcon, lblSanPham, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblSanPhamMouseExited

    private void lblSanPhamIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamIconMouseExited
        this.TrangThaiDanhMuc(lblSanPhamIcon, lblSanPham, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblSanPhamIconMouseExited

    private void lblBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseEntered
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
        pnlMenuCon.setVisible(true);
    }//GEN-LAST:event_lblBanHangMouseEntered

    private void lblBanHangIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangIconMouseEntered
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
    }//GEN-LAST:event_lblBanHangIconMouseEntered

    private void lblBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseExited
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        pnlMenuCon.setVisible(false);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblBanHangMouseExited

    private void lblBanHangIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangIconMouseExited
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblBanHangIconMouseExited

    private void lblKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseEntered
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 1);
    }//GEN-LAST:event_lblKhachHangMouseEntered

    private void lblKhachHangIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIconMouseEntered
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 1);
    }//GEN-LAST:event_lblKhachHangIconMouseEntered

    private void lblKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseExited
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblKhachHangMouseExited

    private void lblKhachHangIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIconMouseExited
        this.TrangThaiDanhMuc(lblKhachHangIcon, lblKhachHang, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblKhachHangIconMouseExited

    private void lblThongKeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeIconMouseEntered
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 1);
    }//GEN-LAST:event_lblThongKeIconMouseEntered

    private void lblThongKeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeIconMouseExited
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblThongKeIconMouseExited

    private void lblDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseEntered
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 1);
    }//GEN-LAST:event_lblDangXuatMouseEntered

    private void lblDangXuatIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatIconMouseEntered
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 1);
    }//GEN-LAST:event_lblDangXuatIconMouseEntered

    private void lblDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseExited
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblDangXuatMouseExited

    private void lblDangXuatIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatIconMouseExited
        this.TrangThaiDanhMuc(lblDangXuatIcon, lblDangXuat, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblDangXuatIconMouseExited

    private void lblThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseEntered
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 1);
    }//GEN-LAST:event_lblThoatMouseEntered

    private void lblThoatIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatIconMouseEntered
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 1);
    }//GEN-LAST:event_lblThoatIconMouseEntered

    private void lblThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseExited
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblThoatMouseExited

    private void lblThoatIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatIconMouseExited
        this.TrangThaiDanhMuc(lblThoatIcon, lblThoat, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblThoatIconMouseExited

    private void lblTrangChuIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "trangChu");
        manHinhHienThi = 0;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblTrangChuIconMouseClicked

    private void lblTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseClicked
        this.TrieuHoiCard(pnlChinh, "trangChu");
        manHinhHienThi = 0;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblTrangChuMouseClicked

    private void lblNhanVienIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "nhanVien");
        manHinhHienThi = 1;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblNhanVienIconMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        this.TrieuHoiCard(pnlChinh, "nhanVien");
        manHinhHienThi = 1;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblSanPhamIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "sanPham");
        manHinhHienThi = 2;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblSanPhamIconMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        this.TrieuHoiCard(pnlChinh, "sanPham");
        manHinhHienThi = 2;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblKhachHangIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "khachHang");
        manHinhHienThi = 5;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblKhachHangIconMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        this.TrieuHoiCard(pnlChinh, "khachHang");
        manHinhHienThi = 5;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblThongKeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "doanhThu");
        manHinhHienThi = 6;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblThongKeIconMouseClicked

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
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
    }//GEN-LAST:event_pnlMenuConMouseEntered

    private void pnlMenuConMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuConMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
    }//GEN-LAST:event_pnlMenuConMouseExited

    private void lblLapHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonMouseClicked
        this.TrieuHoiCard(pnlChinh, "lapHoaDon");
        pnlMenuCon.setVisible(false);
        pnlMenuCon.setVisible(true);
        manHinhHienThi = 3;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblLapHoaDonMouseClicked

    private void lblLapHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonMouseEntered
        pnlMenuCon.setVisible(true);
        this.TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 1);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
    }//GEN-LAST:event_lblLapHoaDonMouseEntered

    private void lblLapHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblLapHoaDonMouseExited

    private void lblThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseExited
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblThongKeMouseExited

    private void lblThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseEntered
        this.TrangThaiDanhMuc(lblThongKeIcon, lblThongKe, 1);
    }//GEN-LAST:event_lblThongKeMouseEntered

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        this.TrieuHoiCard(pnlChinh, "doanhThu");
        manHinhHienThi = 6;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblLapHoaDonIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "lapHoaDon");
        pnlMenuCon.setVisible(false);
        pnlMenuCon.setVisible(true);
        manHinhHienThi = 3;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblLapHoaDonIconMouseClicked

    private void lblLapHoaDonIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonIconMouseEntered
        pnlMenuCon.setVisible(true);
        this.TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 1);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
    }//GEN-LAST:event_lblLapHoaDonIconMouseEntered

    private void lblLapHoaDonIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonIconMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblLapHoaDonIconMouseExited

    private void lblHoaDonDaThanhToanIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "xemHoaDon");
        pnlMenuCon.setVisible(false);
        pnlMenuCon.setVisible(true);
        manHinhHienThi = 4;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblHoaDonDaThanhToanIconMouseClicked

    private void lblHoaDonDaThanhToanIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanIconMouseEntered
        pnlMenuCon.setVisible(true);
        this.TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 1);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
    }//GEN-LAST:event_lblHoaDonDaThanhToanIconMouseEntered

    private void lblHoaDonDaThanhToanIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanIconMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblHoaDonDaThanhToanIconMouseExited

    private void lblHoaDonDaThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanMouseClicked
        this.TrieuHoiCard(pnlChinh, "xemHoaDon");
        pnlMenuCon.setVisible(false);
        pnlMenuCon.setVisible(true);
        manHinhHienThi = 4;
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblHoaDonDaThanhToanMouseClicked

    private void lblHoaDonDaThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanMouseEntered
        pnlMenuCon.setVisible(true);
        this.TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 1);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
    }//GEN-LAST:event_lblHoaDonDaThanhToanMouseEntered

    private void lblHoaDonDaThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
    }//GEN-LAST:event_lblHoaDonDaThanhToanMouseExited

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
            java.util.logging.Logger.getLogger(MainInterfaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainInterfaceDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblBanHangIcon;
    private javax.swing.JLabel lblChao;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDangXuatIcon;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiaChiTro;
    private javax.swing.JLabel lblHoaDonDaThanhToan;
    private javax.swing.JLabel lblHoaDonDaThanhToanIcon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhachHangIcon;
    private javax.swing.JLabel lblLapHoaDon;
    private javax.swing.JLabel lblLapHoaDonIcon;
    private javax.swing.JLabel lblNhaTro;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblNhanVienIcon;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblSanPhamIcon;
    private javax.swing.JLabel lblSdtTro;
    private javax.swing.JLabel lblSilogan;
    private javax.swing.JLabel lblTenNhaTro;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblThoatIcon;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblThongKeIcon;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTongQuanHeThong;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel lblTrangChuIcon;
    private javax.swing.JPanel pnlChinh;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlLapHoaDon;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuCon;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlSitatus;
    private javax.swing.JPanel pnlThongTinTro;
    private javax.swing.JPanel pnlTrangChu;
    private javax.swing.JPanel pnlXemHoaDon;
    // End of variables declaration//GEN-END:variables
}
