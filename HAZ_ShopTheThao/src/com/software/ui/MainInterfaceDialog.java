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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainInterfaceDialog extends javax.swing.JFrame {

    public int manHinhHienThi = 0; //Biến dùng để nhận biết đang ở màn hình tương tác nào.
    public int indexSlideShow = 0; //Biến nhận biết hình ảnh slideshow.
    public Timer runSlide, hienAn, time;
    public int kiemTraHienAn = 0;

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
        //        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.ManHinhHienThi();
        this.GioNgayThangNam();
        this.setTitle("Shop Thể Thao BingBong");
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        pnlMenuCon.setVisible(false);
        pnlMenuCon.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.TrieuHoiCard(pnlChinh, "trangChu");
        lblPreSlideShow.setBackground(new java.awt.Color(0, 0, 0, 1));
        lblNextSlideShow.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.RunSlideShow(); 
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

    public void TrangThaiDanhMucCon(JLabel jLabel, JLabel jLabe2, JLabel jLabe3) {
        jLabel.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, new Color(102, 102, 102)));
        jLabe2.setBorder(null);
        jLabe3.setBorder(null);
    }

    public void AnhSlideShow() {
        switch (indexSlideShow) {
            case 0:
                lblSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/NenManHinhChao.png")));
                break;
            case 1: {
                lblSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/theThao1.jpg")));
                break;
            }
            case 2: {
                lblSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/theThao2.jpg")));
                break;
            }
            case 3: {
                lblSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/theThao3.jpg")));
                break;
            }
            default:
                break;
        }
    }

    public void NextSlideShow() {
        indexSlideShow++;
        if (indexSlideShow == 4) {
            indexSlideShow = 0;
        }
        this.AnhSlideShow();
    }

    public void PreSlideShow() {
        indexSlideShow--;
        if (indexSlideShow == -1) {
            indexSlideShow = 3;
        }
        this.AnhSlideShow();
    }

    public void RunSlideShow() {
        runSlide = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NextSlideShow();
                lblNextSlideShow.setVisible(false);
                lblNextSlideShow.setVisible(true);
            }
        });
        runSlide.start();
    }

    public void HienAnMenuCon() {
        hienAn = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblLapHoaDon.setVisible(false);
                lblLapHoaDon.setVisible(true);
                lblLapHoaDonIcon.setVisible(false);
                lblLapHoaDonIcon.setVisible(true);
                pnlMenuCon.setVisible(false);
                pnlMenuCon.setVisible(true);
                lblHoaDonDaThanhToan.setVisible(false);
                lblHoaDonDaThanhToan.setVisible(true);
                lblHoaDonDaThanhToanIcon.setVisible(false);
                lblHoaDonDaThanhToanIcon.setVisible(true);
            }
        });
        hienAn.start();
    }

    public void GioNgayThangNam() {
        time = new Timer(1000, (e) -> {
            Date gio = new Date();
            Date ngay = new Date();
            SimpleDateFormat dinhDangGio = new SimpleDateFormat("hh:mm:ss a");
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("dd-MM-YYYY");
            lblDate.setText("Date: " + dinhDangNgay.format(ngay));
            lblTime.setText("Time: " + dinhDangGio.format(gio));
        });
        time.start();
    }

    /*========================================================================*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
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
        pnlThongShop = new javax.swing.JPanel();
        lblDiaChiTro = new javax.swing.JLabel();
        lblSilogan = new javax.swing.JLabel();
        lblSdtTro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlChinh = new javax.swing.JPanel();
        pnlTrangChu = new javax.swing.JPanel();
        lblNextSlideShow = new javax.swing.JLabel();
        lblPreSlideShow = new javax.swing.JLabel();
        lblSlideShow = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        pnlMenuChucNang = new javax.swing.JPanel();
        lblDanhMucNhanVien = new javax.swing.JLabel();
        lblDanhMucChucVu = new javax.swing.JLabel();
        lblDanhMucTaiKhoan = new javax.swing.JLabel();
        pnlDanhMucConNV = new javax.swing.JPanel();
        pnlDanhMucNV = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        pnlDanhMucChucVu = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jTextField23 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField31 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        pnlDanhMucTaiKhoan = new javax.swing.JPanel();
        jTextField30 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        pnlSanPham = new javax.swing.JPanel();
        pnlMenuChucNangSP = new javax.swing.JPanel();
        lblDanhMucSanPham = new javax.swing.JLabel();
        lblDanhMucLoai = new javax.swing.JLabel();
        lblDanhMucDonVi = new javax.swing.JLabel();
        pnlDanhMucConSP = new javax.swing.JPanel();
        pnlDanhMucSP = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jTextField19 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        pnlDanhMucLoai = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel95 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        pnlDanhMucDonVi = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel96 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
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
        jPanel8 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jTextField46 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        pnlDoanhThu = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel82 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel102 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        pnlSitatus = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTongQuanHeThong = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 874));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenuCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMenuCon.setOpaque(false);
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
        lblLapHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblLapHoaDonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/bill.png"))); // NOI18N
        lblLapHoaDonIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblHoaDonDaThanhToanIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/paid.png"))); // NOI18N
        lblHoaDonDaThanhToanIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblHoaDonDaThanhToan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(pnlMenuConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoaDonDaThanhToanIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoaDonDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMenuCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 300, 90));

        pnlMenu.setBackground(new java.awt.Color(0, 153, 255));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pnlMenu.setForeground(new java.awt.Color(0, 153, 255));

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
                .addContainerGap(211, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        lblDiaChiTro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblDiaChiTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/DiaChi.png"))); // NOI18N
        lblDiaChiTro.setText(" KV-Bình Thường A, P.Long Tuyền, Q.Bình Thủy, TP.Cần Thơ. ");

        lblSilogan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSilogan.setForeground(new java.awt.Color(51, 102, 255));
        lblSilogan.setText("Chất Lượng Là Danh Dự - Tất Cả Vì Khách Hàng");

        lblSdtTro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblSdtTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/Telephone.png"))); // NOI18N
        lblSdtTro.setText(" 090.777.3783 (Anh Nhật).");

        javax.swing.GroupLayout pnlThongShopLayout = new javax.swing.GroupLayout(pnlThongShop);
        pnlThongShop.setLayout(pnlThongShopLayout);
        pnlThongShopLayout.setHorizontalGroup(
            pnlThongShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongShopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSdtTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSilogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiaChiTro, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        pnlThongShopLayout.setVerticalGroup(
            pnlThongShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongShopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSilogan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiaChiTro)
                .addGap(0, 0, 0)
                .addComponent(lblSdtTro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlThongShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 99, 1079, 12));

        pnlChinh.setBackground(new java.awt.Color(255, 0, 51));
        pnlChinh.setName("Chinh"); // NOI18N
        pnlChinh.setLayout(new java.awt.CardLayout());

        pnlTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNextSlideShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNextSlideShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/next.png"))); // NOI18N
        lblNextSlideShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNextSlideShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextSlideShowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNextSlideShowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNextSlideShowMouseExited(evt);
            }
        });
        pnlTrangChu.add(lblNextSlideShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 50, 580));

        lblPreSlideShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreSlideShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/pre.png"))); // NOI18N
        lblPreSlideShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPreSlideShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPreSlideShowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPreSlideShowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPreSlideShowMouseExited(evt);
            }
        });
        pnlTrangChu.add(lblPreSlideShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 580));

        lblSlideShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSlideShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/NenManHinhChao.png"))); // NOI18N
        lblSlideShow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSlideShow.setOpaque(true);
        pnlTrangChu.add(lblSlideShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pnlChinh.add(pnlTrangChu, "trangChu");

        pnlMenuChucNang.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(81, 81, 81)));
        pnlMenuChucNang.setForeground(new java.awt.Color(60, 63, 65));

        lblDanhMucNhanVien.setBackground(new java.awt.Color(0, 153, 255));
        lblDanhMucNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDanhMucNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblDanhMucNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhMucNhanVien.setText("Danh Mục Nhân Viên");
        lblDanhMucNhanVien.setBorder(new javax.swing.border.MatteBorder(null));
        lblDanhMucNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDanhMucNhanVien.setOpaque(true);
        lblDanhMucNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhMucNhanVienMouseClicked(evt);
            }
        });

        lblDanhMucChucVu.setBackground(new java.awt.Color(0, 153, 255));
        lblDanhMucChucVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDanhMucChucVu.setForeground(new java.awt.Color(255, 255, 255));
        lblDanhMucChucVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhMucChucVu.setText("Danh Mục Chức Vụ");
        lblDanhMucChucVu.setBorder(new javax.swing.border.MatteBorder(null));
        lblDanhMucChucVu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDanhMucChucVu.setOpaque(true);
        lblDanhMucChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhMucChucVuMouseClicked(evt);
            }
        });

        lblDanhMucTaiKhoan.setBackground(new java.awt.Color(0, 153, 255));
        lblDanhMucTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDanhMucTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblDanhMucTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhMucTaiKhoan.setText("Danh Mục Tài Khoản");
        lblDanhMucTaiKhoan.setBorder(new javax.swing.border.MatteBorder(null));
        lblDanhMucTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDanhMucTaiKhoan.setOpaque(true);
        lblDanhMucTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhMucTaiKhoanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuChucNangLayout = new javax.swing.GroupLayout(pnlMenuChucNang);
        pnlMenuChucNang.setLayout(pnlMenuChucNangLayout);
        pnlMenuChucNangLayout.setHorizontalGroup(
            pnlMenuChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuChucNangLayout.createSequentialGroup()
                .addComponent(lblDanhMucNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDanhMucChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDanhMucTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuChucNangLayout.setVerticalGroup(
            pnlMenuChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDanhMucNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDanhMucChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblDanhMucTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        pnlDanhMucConNV.setName(""); // NOI18N
        pnlDanhMucConNV.setLayout(new java.awt.CardLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ & Tên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/photo.png"))); // NOI18N
        jLabel23.setText("Chọn Ảnh");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Mã Nhân Viên");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Họ Và Tên Đệm");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Tên Nhân Viên");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Giới Tính");

        btgGioiTinh.add(jRadioButton1);
        jRadioButton1.setText("Nam");

        btgGioiTinh.add(jRadioButton2);
        jRadioButton2.setText("Nữ");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Chức Vụ");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Vui Lòng Chọn Chức Vụ ---" }));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Gmail");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("CMND/CCCD");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Địa Chỉ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Số Điện Thoại");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        jLabel27.setText("Thêm NV");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        jLabel29.setText("Sửa NV");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        jLabel30.setText("Xóa NV");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jRadioButton1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButton2))
                                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextField17.setForeground(new java.awt.Color(204, 204, 204));
        jTextField17.setText("Tìm Kiếm . . .");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlDanhMucNVLayout = new javax.swing.GroupLayout(pnlDanhMucNV);
        pnlDanhMucNV.setLayout(pnlDanhMucNVLayout);
        pnlDanhMucNVLayout.setHorizontalGroup(
            pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDanhMucNVLayout.setVerticalGroup(
            pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );

        pnlDanhMucConNV.add(pnlDanhMucNV, "danhMucNhanVien");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Chức Vụ", "Tên Chức Vụ", "Mô Tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable7);

        jTextField23.setForeground(new java.awt.Color(204, 204, 204));
        jTextField23.setText("Tìm kiếm . . .");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel57.setText("Mã Chức Vụ");
        jPanel4.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 94, 126, 31));
        jPanel4.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 94, 357, 31));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setText("Tên Chức Vụ");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 131, 126, 31));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel59.setText("Mô Tả");
        jPanel4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 168, 126, 31));

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        jLabel62.setText("Xóa TK");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 359, 107, 40));

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        jLabel63.setText("Sửa TK");
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 359, 107, 40));

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add.png"))); // NOI18N
        jLabel64.setText("Thêm TK");
        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 359, 107, 40));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Thông Tin Chức Vụ");
        jPanel4.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 22, 544, 36));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane10.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 168, 357, 110));
        jPanel4.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 131, 357, 31));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        javax.swing.GroupLayout pnlDanhMucChucVuLayout = new javax.swing.GroupLayout(pnlDanhMucChucVu);
        pnlDanhMucChucVu.setLayout(pnlDanhMucChucVuLayout);
        pnlDanhMucChucVuLayout.setHorizontalGroup(
            pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlDanhMucChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDanhMucChucVuLayout.createSequentialGroup()
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhMucChucVuLayout.setVerticalGroup(
            pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucChucVuLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField23)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlDanhMucConNV.add(pnlDanhMucChucVu, "danhMucChucVu");

        jTextField30.setForeground(new java.awt.Color(204, 204, 204));
        jTextField30.setText("Tìm kiếm . . .");

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số Điện Thoại", "Tên Nhân Viên", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable9);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setText("Số Điện Thoại");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 92, 126, 31));
        jPanel3.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 92, 357, 31));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setText("Tên Nhân Viên");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 129, -1, 31));

        jTextField25.setEditable(false);
        jPanel3.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 129, 357, 31));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setText("Chức Vụ");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 166, 126, 31));

        jTextField26.setEditable(false);
        jPanel3.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 166, 357, 31));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setText("Pass");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 203, 126, 31));
        jPanel3.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 203, 357, 31));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setText("Confim Pass");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 240, 126, 31));
        jPanel3.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 240, 357, 31));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        jLabel52.setText("Xóa TK");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 357, 107, 40));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        jLabel53.setText("Sửa TK");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 357, 107, 40));

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add.png"))); // NOI18N
        jLabel54.setText("Thêm TK");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 357, 107, 40));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Thông Tin Tài Khoản");
        jPanel3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 548, 36));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        javax.swing.GroupLayout pnlDanhMucTaiKhoanLayout = new javax.swing.GroupLayout(pnlDanhMucTaiKhoan);
        pnlDanhMucTaiKhoan.setLayout(pnlDanhMucTaiKhoanLayout);
        pnlDanhMucTaiKhoanLayout.setHorizontalGroup(
            pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhMucTaiKhoanLayout.setVerticalGroup(
            pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField30)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlDanhMucConNV.add(pnlDanhMucTaiKhoan, "danhMucTaiKhoan");

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDanhMucConNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlMenuChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                .addComponent(pnlDanhMucConNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMenuChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlChinh.add(pnlNhanVien, "nhanVien");

        pnlMenuChucNangSP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(81, 81, 81)));

        lblDanhMucSanPham.setBackground(new java.awt.Color(0, 153, 255));
        lblDanhMucSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDanhMucSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblDanhMucSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhMucSanPham.setText("Danh Mục Sản Phẩm");
        lblDanhMucSanPham.setBorder(new javax.swing.border.MatteBorder(null));
        lblDanhMucSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDanhMucSanPham.setOpaque(true);
        lblDanhMucSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhMucSanPhamMouseClicked(evt);
            }
        });

        lblDanhMucLoai.setBackground(new java.awt.Color(0, 153, 255));
        lblDanhMucLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDanhMucLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblDanhMucLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhMucLoai.setText("Danh Mục Loại SP");
        lblDanhMucLoai.setBorder(new javax.swing.border.MatteBorder(null));
        lblDanhMucLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDanhMucLoai.setOpaque(true);
        lblDanhMucLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhMucLoaiMouseClicked(evt);
            }
        });

        lblDanhMucDonVi.setBackground(new java.awt.Color(0, 153, 255));
        lblDanhMucDonVi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDanhMucDonVi.setForeground(new java.awt.Color(255, 255, 255));
        lblDanhMucDonVi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhMucDonVi.setText("Danh Mục Đơn Vị Tính");
        lblDanhMucDonVi.setBorder(new javax.swing.border.MatteBorder(null));
        lblDanhMucDonVi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDanhMucDonVi.setOpaque(true);
        lblDanhMucDonVi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhMucDonViMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuChucNangSPLayout = new javax.swing.GroupLayout(pnlMenuChucNangSP);
        pnlMenuChucNangSP.setLayout(pnlMenuChucNangSPLayout);
        pnlMenuChucNangSPLayout.setHorizontalGroup(
            pnlMenuChucNangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuChucNangSPLayout.createSequentialGroup()
                .addComponent(lblDanhMucSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDanhMucLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDanhMucDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuChucNangSPLayout.setVerticalGroup(
            pnlMenuChucNangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuChucNangSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuChucNangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDanhMucSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDanhMucLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblDanhMucDonVi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        pnlDanhMucConSP.setLayout(new java.awt.CardLayout());

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable8);

        jTextField19.setForeground(new java.awt.Color(204, 204, 204));
        jTextField19.setText("Tìm Kiếm . . .");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Tên Sản Phẩm");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Mã Sản Phẩm");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Số Lượng");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setText("Đơn Vị Tính");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setText("Đơn Giá");

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        jLabel70.setText("Thêm SP");
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        jLabel71.setText("Sửa SP");
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        jLabel72.setText("Xóa SP");
        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn Đơn Vị---" }));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Thông Tin Sản Phẩm");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn Loại SP---" }));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setText("Loại");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setText("Trạng Thái");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Kinh Doanh", "Ngừng Kinh Doanh" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel73)
                .addContainerGap())
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField22, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField32, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField34, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout pnlDanhMucSPLayout = new javax.swing.GroupLayout(pnlDanhMucSP);
        pnlDanhMucSP.setLayout(pnlDanhMucSPLayout);
        pnlDanhMucSPLayout.setHorizontalGroup(
            pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucSPLayout.createSequentialGroup()
                        .addComponent(jTextField19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDanhMucSPLayout.setVerticalGroup(
            pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9)))
                .addContainerGap())
        );

        pnlDanhMucConSP.add(pnlDanhMucSP, "danhMucSanPham");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Mã Loại");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("Tên Loại");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel74.setText("Mô Tả");

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        jLabel77.setText("Thêm");
        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel77.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        jLabel78.setText("Sửa");
        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        jLabel79.setText("Xóa");
        jLabel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Thông Tin Loại Sản Phẩm");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane16.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel80))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField36, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane16))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Loại", "Tên Loại", "Mô Tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable10);

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        jLabel95.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField43.setForeground(new java.awt.Color(204, 204, 204));
        jTextField43.setText("Tìm Kiếm . . .");

        javax.swing.GroupLayout pnlDanhMucLoaiLayout = new javax.swing.GroupLayout(pnlDanhMucLoai);
        pnlDanhMucLoai.setLayout(pnlDanhMucLoaiLayout);
        pnlDanhMucLoaiLayout.setHorizontalGroup(
            pnlDanhMucLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(pnlDanhMucLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucLoaiLayout.createSequentialGroup()
                        .addComponent(jTextField43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDanhMucLoaiLayout.setVerticalGroup(
            pnlDanhMucLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDanhMucLoaiLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucLoaiLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        pnlDanhMucConSP.add(pnlDanhMucLoai, "danhMucLoai");

        pnlDanhMucDonVi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel83.setText("Mã Đơn Vị");

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setText("Tên Đơn Vị");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setText("Mô Tả");

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        jLabel88.setText("Thêm ĐV");
        jLabel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel88.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        jLabel89.setText("Sửa ĐV");
        jLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        jLabel90.setText("Xóa ĐV");
        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel91.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Thông Tin Đơn Vị Tính");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane14.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addContainerGap())
            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField39, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane14))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Đơn Vị", "Tên Đơn Vị", "Mô Tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jTable11);

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        jLabel96.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField44.setForeground(new java.awt.Color(204, 204, 204));
        jTextField44.setText("Tìm Kiếm . . .");

        javax.swing.GroupLayout pnlDanhMucDonViLayout = new javax.swing.GroupLayout(pnlDanhMucDonVi);
        pnlDanhMucDonVi.setLayout(pnlDanhMucDonViLayout);
        pnlDanhMucDonViLayout.setHorizontalGroup(
            pnlDanhMucDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucDonViLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(pnlDanhMucDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucDonViLayout.createSequentialGroup()
                        .addComponent(jTextField44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDanhMucDonViLayout.setVerticalGroup(
            pnlDanhMucDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucDonViLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDanhMucDonViLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucDonViLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        pnlDanhMucConSP.add(pnlDanhMucDonVi, "danhMucDonVi");

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDanhMucConSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlMenuChucNangSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addComponent(pnlDanhMucConSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMenuChucNangSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
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
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
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
                        .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(0, 0, 0)
                        .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlChinh.add(pnlXemHoaDon, "xemHoaDon");

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel86.setText("Mã Khách Hàng");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setText("Tên Khách Hàng");

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel93.setText("Số Điện Thoại");

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        jLabel94.setText("Thêm KH");
        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel94.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        jLabel97.setText("Sửa KH");
        jLabel97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel97.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        jLabel98.setText("Xóa KH");
        jLabel98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        jLabel99.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Thông Tin Khách Hàng");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel99)
                .addContainerGap())
            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField41, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField42, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField45, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
        );

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Số Điện Thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(jTable12);

        jTextField46.setForeground(new java.awt.Color(204, 204, 204));
        jTextField46.setText("Tìm Kiếm . . .");

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        jLabel101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangLayout.createSequentialGroup()
                        .addComponent(jTextField46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKhachHangLayout.createSequentialGroup()
                        .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlChinh.add(pnlKhachHang, "khachHang");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Ngày");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Ngày--" }));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Tháng");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Tháng--" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Năm--" }));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Năm");

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL Đã Bán", "Đơn Giá Bán", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(jTable13);

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel76.setText("Doanh Thu: 0 VNĐ");

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17)
                    .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 463, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoanhThuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jComboBox10)
                    .addComponent(jComboBox11)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlChinh.add(pnlDoanhThu, "doanhThu");

        getContentPane().add(pnlChinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 109, 1090, 590));

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
        lblTongQuanHeThong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlSitatusLayout = new javax.swing.GroupLayout(pnlSitatus);
        pnlSitatus.setLayout(pnlSitatusLayout);
        pnlSitatusLayout.setHorizontalGroup(
            pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSitatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTongQuanHeThong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 833, Short.MAX_VALUE)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pnlSitatusLayout.setVerticalGroup(
            pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSitatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSitatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTongQuanHeThong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(pnlSitatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 1370, 40));

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
        if (manHinhHienThi == 0) {
            this.HienAnMenuCon();
            kiemTraHienAn = 1;
        }
    }//GEN-LAST:event_lblBanHangMouseEntered

    private void lblBanHangIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangIconMouseEntered
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 1);
        if (manHinhHienThi == 0) {
            this.HienAnMenuCon();
            kiemTraHienAn = 1;
        }
    }//GEN-LAST:event_lblBanHangIconMouseEntered

    private void lblBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseExited
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        pnlMenuCon.setVisible(false);
        this.ManHinhHienThi();
        if (kiemTraHienAn == 1) {
            hienAn.stop();
            kiemTraHienAn = 0;
        }

    }//GEN-LAST:event_lblBanHangMouseExited

    private void lblBanHangIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangIconMouseExited
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
        if (kiemTraHienAn == 1) {
            hienAn.stop();
            kiemTraHienAn = 0;
        }
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
        lblDanhMucNhanVien.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, new Color(102, 102, 102)));
        lblDanhMucChucVu.setBorder(null);
        lblDanhMucTaiKhoan.setBorder(null);
        this.TrangThaiDanhMucCon(lblDanhMucNhanVien, lblDanhMucChucVu, lblDanhMucTaiKhoan);
    }//GEN-LAST:event_lblNhanVienIconMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        this.TrieuHoiCard(pnlChinh, "nhanVien");
        manHinhHienThi = 1;
        this.ManHinhHienThi();
        this.TrangThaiDanhMucCon(lblDanhMucNhanVien, lblDanhMucChucVu, lblDanhMucTaiKhoan);
        this.TrieuHoiCard(pnlDanhMucConNV, "danhMucNhanVien");
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblSanPhamIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamIconMouseClicked
        this.TrieuHoiCard(pnlChinh, "sanPham");
        manHinhHienThi = 2;
        this.ManHinhHienThi();
        this.TrangThaiDanhMucCon(lblDanhMucSanPham, lblDanhMucLoai, lblDanhMucDonVi);
        this.TrieuHoiCard(pnlDanhMucConSP, "danhMucSanPham");
    }//GEN-LAST:event_lblSanPhamIconMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        this.TrieuHoiCard(pnlChinh, "sanPham");
        manHinhHienThi = 2;
        this.ManHinhHienThi();
        this.TrangThaiDanhMucCon(lblDanhMucSanPham, lblDanhMucLoai, lblDanhMucDonVi);
        this.TrieuHoiCard(pnlDanhMucConSP, "danhMucSanPham");
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
        if (manHinhHienThi == 0) {
            this.HienAnMenuCon();
            kiemTraHienAn = 1;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnlMenuConMouseEntered

    private void pnlMenuConMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuConMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        if (kiemTraHienAn == 1) {
            hienAn.stop();
            kiemTraHienAn = 0;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
        if (manHinhHienThi == 0) {
            this.HienAnMenuCon();
            kiemTraHienAn = 1;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblLapHoaDonMouseEntered

    private void lblLapHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
        if (kiemTraHienAn == 1) {
            hienAn.stop();
            kiemTraHienAn = 0;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
        if (manHinhHienThi == 0) {
            this.HienAnMenuCon();
            kiemTraHienAn = 1;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblLapHoaDonIconMouseEntered

    private void lblLapHoaDonIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLapHoaDonIconMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblLapHoaDonIcon, lblLapHoaDon, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
        if (kiemTraHienAn == 1) {
            hienAn.stop();
            kiemTraHienAn = 0;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
        if (manHinhHienThi == 0) {
            this.HienAnMenuCon();
            kiemTraHienAn = 1;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblHoaDonDaThanhToanIconMouseEntered

    private void lblHoaDonDaThanhToanIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanIconMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
        if (kiemTraHienAn == 1) {
            hienAn.stop();
            kiemTraHienAn = 0;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
        if (manHinhHienThi == 0) {
            this.HienAnMenuCon();
            kiemTraHienAn = 1;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblHoaDonDaThanhToanMouseEntered

    private void lblHoaDonDaThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonDaThanhToanMouseExited
        pnlMenuCon.setVisible(false);
        this.TrangThaiDanhMuc(lblHoaDonDaThanhToanIcon, lblHoaDonDaThanhToan, 2);
        this.TrangThaiDanhMuc(lblBanHangIcon, lblBanHang, 2);
        this.ManHinhHienThi();
        if (kiemTraHienAn == 1) {
            hienAn.stop();
            kiemTraHienAn = 0;
        }
        lblSlideShow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_lblHoaDonDaThanhToanMouseExited

    private void lblDanhMucNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucNhanVienMouseClicked
        this.TrangThaiDanhMucCon(lblDanhMucNhanVien, lblDanhMucChucVu, lblDanhMucTaiKhoan);
        this.TrieuHoiCard(pnlDanhMucConNV, "danhMucNhanVien");
    }//GEN-LAST:event_lblDanhMucNhanVienMouseClicked

    private void lblDanhMucChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucChucVuMouseClicked
        this.TrangThaiDanhMucCon(lblDanhMucChucVu, lblDanhMucNhanVien, lblDanhMucTaiKhoan);
        this.TrieuHoiCard(pnlDanhMucConNV, "danhMucChucVu");
    }//GEN-LAST:event_lblDanhMucChucVuMouseClicked

    private void lblDanhMucTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucTaiKhoanMouseClicked
        this.TrangThaiDanhMucCon(lblDanhMucTaiKhoan, lblDanhMucChucVu, lblDanhMucNhanVien);
        this.TrieuHoiCard(pnlDanhMucConNV, "danhMucTaiKhoan");
    }//GEN-LAST:event_lblDanhMucTaiKhoanMouseClicked

    private void lblDanhMucSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucSanPhamMouseClicked
        this.TrangThaiDanhMucCon(lblDanhMucSanPham, lblDanhMucLoai, lblDanhMucDonVi);
        this.TrieuHoiCard(pnlDanhMucConSP, "danhMucSanPham");
    }//GEN-LAST:event_lblDanhMucSanPhamMouseClicked

    private void lblDanhMucLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucLoaiMouseClicked
        this.TrangThaiDanhMucCon(lblDanhMucLoai, lblDanhMucSanPham, lblDanhMucDonVi);
        this.TrieuHoiCard(pnlDanhMucConSP, "danhMucLoai");
    }//GEN-LAST:event_lblDanhMucLoaiMouseClicked

    private void lblDanhMucDonViMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucDonViMouseClicked
        this.TrangThaiDanhMucCon(lblDanhMucDonVi, lblDanhMucSanPham, lblDanhMucLoai);
        this.TrieuHoiCard(pnlDanhMucConSP, "danhMucDonVi");
    }//GEN-LAST:event_lblDanhMucDonViMouseClicked

    private void lblNextSlideShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextSlideShowMouseClicked
        this.NextSlideShow();
        lblNextSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/nextHower.png")));
        lblNextSlideShow.setVisible(false);
        lblNextSlideShow.setVisible(true);
    }//GEN-LAST:event_lblNextSlideShowMouseClicked

    private void lblNextSlideShowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextSlideShowMouseEntered
        lblNextSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/nextHower.png")));
    }//GEN-LAST:event_lblNextSlideShowMouseEntered

    private void lblNextSlideShowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextSlideShowMouseExited
        lblNextSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/next.png")));
    }//GEN-LAST:event_lblNextSlideShowMouseExited

    private void lblPreSlideShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPreSlideShowMouseClicked
        this.PreSlideShow();
        lblPreSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/preHower.png")));
        lblPreSlideShow.setVisible(false);
        lblPreSlideShow.setVisible(true);
    }//GEN-LAST:event_lblPreSlideShowMouseClicked

    private void lblPreSlideShowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPreSlideShowMouseEntered
        lblPreSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/preHower.png")));
    }//GEN-LAST:event_lblPreSlideShowMouseEntered

    private void lblPreSlideShowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPreSlideShowMouseExited
        lblPreSlideShow.setIcon(new ImageIcon(getClass().getResource("/com/software/icon/pre.png")));
    }//GEN-LAST:event_lblPreSlideShowMouseExited

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
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
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
    private javax.swing.JLabel lblDanhMucChucVu;
    private javax.swing.JLabel lblDanhMucDonVi;
    private javax.swing.JLabel lblDanhMucLoai;
    private javax.swing.JLabel lblDanhMucNhanVien;
    private javax.swing.JLabel lblDanhMucSanPham;
    private javax.swing.JLabel lblDanhMucTaiKhoan;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiaChiTro;
    private javax.swing.JLabel lblHoaDonDaThanhToan;
    private javax.swing.JLabel lblHoaDonDaThanhToanIcon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhachHangIcon;
    private javax.swing.JLabel lblLapHoaDon;
    private javax.swing.JLabel lblLapHoaDonIcon;
    private javax.swing.JLabel lblNextSlideShow;
    private javax.swing.JLabel lblNhaTro;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblNhanVienIcon;
    private javax.swing.JLabel lblPreSlideShow;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblSanPhamIcon;
    private javax.swing.JLabel lblSdtTro;
    private javax.swing.JLabel lblSilogan;
    private javax.swing.JLabel lblSlideShow;
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
    private javax.swing.JPanel pnlDanhMucChucVu;
    private javax.swing.JPanel pnlDanhMucConNV;
    private javax.swing.JPanel pnlDanhMucConSP;
    private javax.swing.JPanel pnlDanhMucDonVi;
    private javax.swing.JPanel pnlDanhMucLoai;
    private javax.swing.JPanel pnlDanhMucNV;
    private javax.swing.JPanel pnlDanhMucSP;
    private javax.swing.JPanel pnlDanhMucTaiKhoan;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlLapHoaDon;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuChucNang;
    private javax.swing.JPanel pnlMenuChucNangSP;
    private javax.swing.JPanel pnlMenuCon;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlSitatus;
    private javax.swing.JPanel pnlThongShop;
    private javax.swing.JPanel pnlTrangChu;
    private javax.swing.JPanel pnlXemHoaDon;
    // End of variables declaration//GEN-END:variables
/*///////////////////////////////////////////////////////
||                       _oo0oo_                       ||
||                      o8888888o                      ||
||                      88" . "88                      ||
||                      (| -_- |)                      ||
||                      0\  =  /0                      ||
||                    ___/`---'\___                    ||
||                  .' \\|     |// '.                  ||
||                 / \\|||  :  |||// \                 ||
||                / _||||| -:- |||||- \                ||
||               |   | \\\  -  /// |   |               ||
||               | \_|  ''\---/''  |_/ |               ||
||               \  .-\__  '-'  ___/-. /               ||
||             ___'. .'  /--.--\  `. .'___             ||
||          ."" '<  `.___\_<|>_/___.' >' "".           ||
||         | | :  `- \`.;`\ _ /`;.`/ - ` : | |         ||
||         \  \ `_.   \_ __\ /__ _/   .-` /  /         ||
||     =====`-.____`.___ \_____/___.-`___.-'=====      ||
||                       `=---='                       ||
||                                                     ||
||        Đức Phật Phù Hộ - Không Bao Giờ Có Bug       ||
||                                                     ||
///////////////////////////////////////////////////////*/
}
