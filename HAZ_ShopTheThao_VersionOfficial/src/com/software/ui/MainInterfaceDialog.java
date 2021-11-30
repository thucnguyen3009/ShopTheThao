//* Responsible: HAZ TEAM
//* First coder: NGUYEN DOAN CHI THUC - PC01573
//* Second coder: BUI TRONG NHAN - PC01721
//* Third coder: HUYNH VAN DAT - PC01684
//* Date of writing code: 15/11/2021
//* Last edited:. . .
//* Class: IT16301
//* Version: 1.0.0
package com.software.ui;

import com.software.jdbcHelper.XImage;
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
        lblTenShop = new javax.swing.JLabel();
        lblShop = new javax.swing.JLabel();
        lblChao = new javax.swing.JLabel();
        lblThongKeIcon = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblDangXuatIcon = new javax.swing.JLabel();
        lblThoat = new javax.swing.JLabel();
        lblThoatIcon = new javax.swing.JLabel();
        pnlThongTinShop = new javax.swing.JPanel();
        lblDiaChiShop = new javax.swing.JLabel();
        lblSilogan = new javax.swing.JLabel();
        lblSdtShop = new javax.swing.JLabel();
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
        tblNhanVienNV = new javax.swing.JTable();
        pnlThongTinNhanVien = new javax.swing.JPanel();
        lblAvatarNV = new javax.swing.JLabel();
        lblChonAvatarNV = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtHoVaTenDemNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        lblTenNV = new javax.swing.JLabel();
        lblGioiTinhNV = new javax.swing.JLabel();
        rdoNamNV = new javax.swing.JRadioButton();
        rdoNuNV = new javax.swing.JRadioButton();
        lblChucVuNV = new javax.swing.JLabel();
        cboChucVuNV = new javax.swing.JComboBox<>();
        lblGmailNV = new javax.swing.JLabel();
        txtGmailNV = new javax.swing.JTextField();
        lblCmndNV = new javax.swing.JLabel();
        lblDiaChiNV = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        lblSoDienThoaiNV = new javax.swing.JLabel();
        txtSoDienThoaiNV = new javax.swing.JTextField();
        txtCmndNV = new javax.swing.JTextField();
        lblThemNV = new javax.swing.JLabel();
        lblSuaNV = new javax.swing.JLabel();
        lblXoaNV = new javax.swing.JLabel();
        lblResetNV = new javax.swing.JLabel();
        txtTimNV = new javax.swing.JTextField();
        lblTimNV = new javax.swing.JLabel();
        pnlDanhMucChucVu = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblChucVuCV = new javax.swing.JTable();
        txtTimCV = new javax.swing.JTextField();
        lblTimCV = new javax.swing.JLabel();
        pnlThongTinChucVu = new javax.swing.JPanel();
        lblMaChucVuCV = new javax.swing.JLabel();
        txtMaChucVuCV = new javax.swing.JTextField();
        lblTenChucVuCV = new javax.swing.JLabel();
        lblMoTaCV = new javax.swing.JLabel();
        lblXoaCV = new javax.swing.JLabel();
        lblSuaCV = new javax.swing.JLabel();
        lblThemCV = new javax.swing.JLabel();
        lblTitleThongTinChucVu = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtMoTaCV = new javax.swing.JTextArea();
        txtTenChucVuCV = new javax.swing.JTextField();
        lblResetCV = new javax.swing.JLabel();
        pnlDanhMucTaiKhoan = new javax.swing.JPanel();
        txtTimKiemTK = new javax.swing.JTextField();
        lblTimKiemTK = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblTaiKhoan = new javax.swing.JTable();
        pnlThongTinTaiKhoan = new javax.swing.JPanel();
        lblSdtTK = new javax.swing.JLabel();
        txtSdtTK = new javax.swing.JTextField();
        lblTenNhanVienTK = new javax.swing.JLabel();
        txtTenNhanVienTK = new javax.swing.JTextField();
        lblChucVuTK = new javax.swing.JLabel();
        txtChucVuTK = new javax.swing.JTextField();
        lblPassTK = new javax.swing.JLabel();
        txtPassTK = new javax.swing.JTextField();
        lblConfirmPassTK = new javax.swing.JLabel();
        txtConfirmPassTK = new javax.swing.JTextField();
        lblXoaTK = new javax.swing.JLabel();
        lblSuaTK = new javax.swing.JLabel();
        lblThemTK = new javax.swing.JLabel();
        lblTitleThongTinTaiKhoan = new javax.swing.JLabel();
        lblResetTK = new javax.swing.JLabel();
        pnlSanPham = new javax.swing.JPanel();
        pnlMenuChucNangSP = new javax.swing.JPanel();
        lblDanhMucSanPham = new javax.swing.JLabel();
        lblDanhMucLoai = new javax.swing.JLabel();
        lblDanhMucDonVi = new javax.swing.JLabel();
        pnlDanhMucConSP = new javax.swing.JPanel();
        pnlDanhMucSP = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblSanPhamSP = new javax.swing.JTable();
        txtTimKiemSanPhamSP = new javax.swing.JTextField();
        lblTimKiemSanPhamSP = new javax.swing.JLabel();
        pnlThongTinSanPham = new javax.swing.JPanel();
        lblTenSanPhamSP = new javax.swing.JLabel();
        txtTenSanPhamSP = new javax.swing.JTextField();
        lblMaSanPhamSP = new javax.swing.JLabel();
        txtMaSanPhamSP = new javax.swing.JTextField();
        txtSoLuongSP = new javax.swing.JTextField();
        lblSoLuongSP = new javax.swing.JLabel();
        lblDonViTinhSP = new javax.swing.JLabel();
        txtDonGiaSP = new javax.swing.JTextField();
        lblDonGiaSP = new javax.swing.JLabel();
        lblThemSP = new javax.swing.JLabel();
        lblSuaSP = new javax.swing.JLabel();
        lblXoaSP = new javax.swing.JLabel();
        lblResetSP = new javax.swing.JLabel();
        cboDonViTinhSP = new javax.swing.JComboBox<>();
        lblTitleThongTinSP = new javax.swing.JLabel();
        cboLoaiSP = new javax.swing.JComboBox<>();
        lblLoaiSP = new javax.swing.JLabel();
        lblTrangThaiSP = new javax.swing.JLabel();
        cboTrangThaiSP = new javax.swing.JComboBox<>();
        pnlDanhMucLoai = new javax.swing.JPanel();
        pnlThongTinLoaiSanPham = new javax.swing.JPanel();
        lblMaLoai = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        lblTenLoai = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        lblMoTa = new javax.swing.JLabel();
        lblThemLoai = new javax.swing.JLabel();
        lblSuaLoai = new javax.swing.JLabel();
        lblXoaLoai = new javax.swing.JLabel();
        lblResetLoai = new javax.swing.JLabel();
        lblTitleThongTinLoai = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtMoTaLoai = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblLoaiSanPham = new javax.swing.JTable();
        lblTimLoaiSP = new javax.swing.JLabel();
        txtTimLoaiSP = new javax.swing.JTextField();
        pnlDanhMucDonVi = new javax.swing.JPanel();
        pnlThongTinDonViTinhDV = new javax.swing.JPanel();
        lblMaDonViDV = new javax.swing.JLabel();
        txtMaDonViDV = new javax.swing.JTextField();
        lblTenDonViDV = new javax.swing.JLabel();
        txtTenDonViDV = new javax.swing.JTextField();
        lblMoTaDV = new javax.swing.JLabel();
        lblThemDV = new javax.swing.JLabel();
        lblSuaDV = new javax.swing.JLabel();
        lblXoaDV = new javax.swing.JLabel();
        lblResetDV = new javax.swing.JLabel();
        lblTitleThongTinDonVi = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtMoTaDV = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblDonViTinh = new javax.swing.JTable();
        lblTimKiemDV = new javax.swing.JLabel();
        txtTimKiemDV = new javax.swing.JTextField();
        pnlLapHoaDon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChonKH = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChonSP = new javax.swing.JTable();
        txtTimKhachHangHD = new javax.swing.JTextField();
        txtTimSanPhamHD = new javax.swing.JTextField();
        pnlThongTinHoaDonTam = new javax.swing.JPanel();
        lblTenKhachHangHD = new javax.swing.JLabel();
        txtTenKhachHangHD = new javax.swing.JTextField();
        lblSdtKhachHangHD = new javax.swing.JLabel();
        txtSdtKhachHangHD = new javax.swing.JTextField();
        lblNgayLapHD = new javax.swing.JLabel();
        txtNgayLapHD = new javax.swing.JTextField();
        lblPhanTramGiamHD = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        lblMaKhachHangHD = new javax.swing.JLabel();
        txtMaKhachHangHD = new javax.swing.JTextField();
        lblTongTienHD = new javax.swing.JLabel();
        cboPhanTramGiamHD = new javax.swing.JComboBox<>();
        lblThanhTienGiamHD = new javax.swing.JLabel();
        lblResetHD = new javax.swing.JLabel();
        lblThanhToan = new javax.swing.JLabel();
        lblInHD = new javax.swing.JLabel();
        pnlXemHoaDon = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDanhSachHDCT = new javax.swing.JTable();
        lblMaKhachHangHDCT = new javax.swing.JLabel();
        txtMaKhachHangHDCT = new javax.swing.JTextField();
        txtTenKhachHangHDCT = new javax.swing.JTextField();
        lblTenKhachHangHDCT = new javax.swing.JLabel();
        lblSdtKhachHangHDCT = new javax.swing.JLabel();
        txtSdtKhachHangHDCT = new javax.swing.JTextField();
        lblNgayLapHDCT = new javax.swing.JLabel();
        txtNgayLapHDCT = new javax.swing.JTextField();
        lblPhanTramGiamHDCT = new javax.swing.JLabel();
        cboPhanTramGiamHDCT = new javax.swing.JComboBox<>();
        lblSoTienGiamHDCT = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblThongTinHDCT = new javax.swing.JTable();
        lblTongTienHDCT = new javax.swing.JLabel();
        txtTimKiemHDCT = new javax.swing.JTextField();
        lblMaThuNganHDCT = new javax.swing.JLabel();
        txtMaThuNganHDCT = new javax.swing.JTextField();
        lblTenThuNganHDCT = new javax.swing.JLabel();
        txtTenThuNganHDCT = new javax.swing.JTextField();
        lblInHDCT = new javax.swing.JLabel();
        lblXoaHDCT = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        pnlThongTinKH = new javax.swing.JPanel();
        lblMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblTenKhachHangKH = new javax.swing.JLabel();
        txtTenKhachHangKH = new javax.swing.JTextField();
        lblSdtKH = new javax.swing.JLabel();
        txtSdtKH = new javax.swing.JTextField();
        lblThemKH = new javax.swing.JLabel();
        lblSuaKH = new javax.swing.JLabel();
        lblXoaKH = new javax.swing.JLabel();
        lblResetKH = new javax.swing.JLabel();
        lblTitleThongTinKH = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblThongTinKH = new javax.swing.JTable();
        txtTimKiemKH = new javax.swing.JTextField();
        lblTimKiemKH = new javax.swing.JLabel();
        pnlDoanhThu = new javax.swing.JPanel();
        lblNgayDT = new javax.swing.JLabel();
        cboNgayDT = new javax.swing.JComboBox<>();
        lblThangDT = new javax.swing.JLabel();
        cboThangDT = new javax.swing.JComboBox<>();
        lblNamDT = new javax.swing.JLabel();
        cboNamDT = new javax.swing.JComboBox<>();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        lblTongDoanhThu = new javax.swing.JLabel();
        pnlSitatus = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTongQuanHeThong = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

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

        lblTenShop.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTenShop.setForeground(new java.awt.Color(255, 255, 255));
        lblTenShop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenShop.setText("SHOP THỂ THAO");

        lblShop.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblShop.setForeground(new java.awt.Color(255, 255, 255));
        lblShop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShop.setText("BING BONG");

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
            .addComponent(lblTenShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lblTenShop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblShop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lblDiaChiShop.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblDiaChiShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/DiaChi.png"))); // NOI18N
        lblDiaChiShop.setText(" KV-Bình Thường A, P.Long Tuyền, Q.Bình Thủy, TP.Cần Thơ. ");

        lblSilogan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSilogan.setForeground(new java.awt.Color(51, 102, 255));
        lblSilogan.setText("Chất Lượng Là Danh Dự - Tất Cả Vì Khách Hàng");

        lblSdtShop.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblSdtShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/Telephone.png"))); // NOI18N
        lblSdtShop.setText(" 090.777.3783 (Anh Nhật).");

        javax.swing.GroupLayout pnlThongTinShopLayout = new javax.swing.GroupLayout(pnlThongTinShop);
        pnlThongTinShop.setLayout(pnlThongTinShopLayout);
        pnlThongTinShopLayout.setHorizontalGroup(
            pnlThongTinShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinShopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSdtShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSilogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiaChiShop, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        pnlThongTinShopLayout.setVerticalGroup(
            pnlThongTinShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinShopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSilogan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiaChiShop)
                .addGap(0, 0, 0)
                .addComponent(lblSdtShop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlThongTinShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 6, -1, -1));
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

        tblNhanVienNV.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblNhanVienNV);

        pnlThongTinNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongTinNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblAvatarNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblChonAvatarNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblChonAvatarNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChonAvatarNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/photo.png"))); // NOI18N
        lblChonAvatarNV.setText("Chọn Ảnh");
        lblChonAvatarNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV.setText("Mã Nhân Viên");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Họ Và Tên Đệm");

        lblTenNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenNV.setText("Tên Nhân Viên");

        lblGioiTinhNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGioiTinhNV.setText("Giới Tính");

        btgGioiTinh.add(rdoNamNV);
        rdoNamNV.setText("Nam");

        btgGioiTinh.add(rdoNuNV);
        rdoNuNV.setText("Nữ");

        lblChucVuNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblChucVuNV.setText("Chức Vụ");

        cboChucVuNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Vui Lòng Chọn Chức Vụ ---" }));

        lblGmailNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGmailNV.setText("Gmail");

        lblCmndNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCmndNV.setText("CMND/CCCD");

        lblDiaChiNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDiaChiNV.setText("Địa Chỉ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane7.setViewportView(txtDiaChi);

        lblSoDienThoaiNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoDienThoaiNV.setText("Số Điện Thoại");

        lblThemNV.setBackground(new java.awt.Color(0, 153, 255));
        lblThemNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThemNV.setForeground(new java.awt.Color(255, 255, 255));
        lblThemNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        lblThemNV.setText("Thêm NV");
        lblThemNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblThemNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemNV.setOpaque(true);
        lblThemNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemNVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemNVMouseExited(evt);
            }
        });

        lblSuaNV.setBackground(new java.awt.Color(0, 153, 255));
        lblSuaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuaNV.setForeground(new java.awt.Color(255, 255, 255));
        lblSuaNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        lblSuaNV.setText("Sửa NV");
        lblSuaNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSuaNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuaNV.setOpaque(true);
        lblSuaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaNVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaNVMouseExited(evt);
            }
        });

        lblXoaNV.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaNV.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        lblXoaNV.setText("Xóa NV");
        lblXoaNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblXoaNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaNV.setOpaque(true);
        lblXoaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaNVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaNVMouseExited(evt);
            }
        });

        lblResetNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlThongTinNhanVienLayout = new javax.swing.GroupLayout(pnlThongTinNhanVien);
        pnlThongTinNhanVien.setLayout(pnlThongTinNhanVienLayout);
        pnlThongTinNhanVienLayout.setHorizontalGroup(
            pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAvatarNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChonAvatarNV, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiaChiNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGioiTinhNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChucVuNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoDienThoaiNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGmailNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCmndNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlThongTinNhanVienLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGmailNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSoDienThoaiNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCmndNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                                                        .addComponent(rdoNamNV)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rdoNuNV))
                                                    .addComponent(cboChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(txtTenNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHoVaTenDemNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResetNV)))))
                .addContainerGap())
        );
        pnlThongTinNhanVienLayout.setVerticalGroup(
            pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAvatarNV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblChonAvatarNV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                        .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblResetNV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoVaTenDemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                                .addComponent(lblGioiTinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSoDienThoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoDienThoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCmndNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCmndNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rdoNuNV, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(rdoNamNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(lblDiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtTimNV.setForeground(new java.awt.Color(204, 204, 204));
        txtTimNV.setText("Tìm Kiếm . . .");

        lblTimNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        lblTimNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlDanhMucNVLayout = new javax.swing.GroupLayout(pnlDanhMucNV);
        pnlDanhMucNV.setLayout(pnlDanhMucNVLayout);
        pnlDanhMucNVLayout.setHorizontalGroup(
            pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                        .addComponent(txtTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTimNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDanhMucNVLayout.setVerticalGroup(
            pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThongTinNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucNVLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );

        pnlDanhMucConNV.add(pnlDanhMucNV, "danhMucNhanVien");

        tblChucVuCV.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tblChucVuCV);

        txtTimCV.setForeground(new java.awt.Color(204, 204, 204));
        txtTimCV.setText("Tìm kiếm . . .");

        lblTimCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        lblTimCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pnlThongTinChucVu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongTinChucVu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaChucVuCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaChucVuCV.setText("Mã Chức Vụ");
        pnlThongTinChucVu.add(lblMaChucVuCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 94, 126, 31));
        pnlThongTinChucVu.add(txtMaChucVuCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 94, 357, 31));

        lblTenChucVuCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenChucVuCV.setText("Tên Chức Vụ");
        pnlThongTinChucVu.add(lblTenChucVuCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 131, 126, 31));

        lblMoTaCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMoTaCV.setText("Mô Tả");
        pnlThongTinChucVu.add(lblMoTaCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 168, 126, 31));

        lblXoaCV.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaCV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaCV.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        lblXoaCV.setText("Xóa CV");
        lblXoaCV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblXoaCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaCV.setOpaque(true);
        lblXoaCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaCVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaCVMouseExited(evt);
            }
        });
        pnlThongTinChucVu.add(lblXoaCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 359, 107, 40));

        lblSuaCV.setBackground(new java.awt.Color(0, 153, 255));
        lblSuaCV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuaCV.setForeground(new java.awt.Color(255, 255, 255));
        lblSuaCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuaCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        lblSuaCV.setText("Sửa CV");
        lblSuaCV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSuaCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuaCV.setOpaque(true);
        lblSuaCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaCVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaCVMouseExited(evt);
            }
        });
        pnlThongTinChucVu.add(lblSuaCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 359, 107, 40));

        lblThemCV.setBackground(new java.awt.Color(0, 153, 255));
        lblThemCV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThemCV.setForeground(new java.awt.Color(255, 255, 255));
        lblThemCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add.png"))); // NOI18N
        lblThemCV.setText("Thêm CV");
        lblThemCV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblThemCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemCV.setOpaque(true);
        lblThemCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemCVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemCVMouseExited(evt);
            }
        });
        pnlThongTinChucVu.add(lblThemCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 359, 107, 40));

        lblTitleThongTinChucVu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleThongTinChucVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleThongTinChucVu.setText("Thông Tin Chức Vụ");
        pnlThongTinChucVu.add(lblTitleThongTinChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 22, 544, 36));

        txtMoTaCV.setColumns(20);
        txtMoTaCV.setRows(5);
        jScrollPane10.setViewportView(txtMoTaCV);

        pnlThongTinChucVu.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 168, 357, 110));
        pnlThongTinChucVu.add(txtTenChucVuCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 131, 357, 31));

        lblResetCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlThongTinChucVu.add(lblResetCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        javax.swing.GroupLayout pnlDanhMucChucVuLayout = new javax.swing.GroupLayout(pnlDanhMucChucVu);
        pnlDanhMucChucVu.setLayout(pnlDanhMucChucVuLayout);
        pnlDanhMucChucVuLayout.setHorizontalGroup(
            pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlDanhMucChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDanhMucChucVuLayout.createSequentialGroup()
                        .addComponent(txtTimCV, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTimCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThongTinChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhMucChucVuLayout.setVerticalGroup(
            pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlThongTinChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucChucVuLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTimCV)
                            .addComponent(lblTimCV, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlDanhMucConNV.add(pnlDanhMucChucVu, "danhMucChucVu");

        txtTimKiemTK.setForeground(new java.awt.Color(204, 204, 204));
        txtTimKiemTK.setText("Tìm kiếm . . .");

        lblTimKiemTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimKiemTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        lblTimKiemTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tblTaiKhoan);

        pnlThongTinTaiKhoan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongTinTaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSdtTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSdtTK.setText("Số Điện Thoại");
        pnlThongTinTaiKhoan.add(lblSdtTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 92, 126, 31));
        pnlThongTinTaiKhoan.add(txtSdtTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 92, 357, 31));

        lblTenNhanVienTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenNhanVienTK.setText("Tên Nhân Viên");
        pnlThongTinTaiKhoan.add(lblTenNhanVienTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 129, -1, 31));

        txtTenNhanVienTK.setEditable(false);
        pnlThongTinTaiKhoan.add(txtTenNhanVienTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 129, 357, 31));

        lblChucVuTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblChucVuTK.setText("Chức Vụ");
        pnlThongTinTaiKhoan.add(lblChucVuTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 166, 126, 31));

        txtChucVuTK.setEditable(false);
        pnlThongTinTaiKhoan.add(txtChucVuTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 166, 357, 31));

        lblPassTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassTK.setText("Pass");
        pnlThongTinTaiKhoan.add(lblPassTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 203, 126, 31));
        pnlThongTinTaiKhoan.add(txtPassTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 203, 357, 31));

        lblConfirmPassTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblConfirmPassTK.setText("Confim Pass");
        pnlThongTinTaiKhoan.add(lblConfirmPassTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 240, 126, 31));
        pnlThongTinTaiKhoan.add(txtConfirmPassTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 240, 357, 31));

        lblXoaTK.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaTK.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        lblXoaTK.setText("Xóa TK");
        lblXoaTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblXoaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaTK.setOpaque(true);
        lblXoaTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaTKMouseExited(evt);
            }
        });
        pnlThongTinTaiKhoan.add(lblXoaTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 357, 107, 40));

        lblSuaTK.setBackground(new java.awt.Color(0, 153, 255));
        lblSuaTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuaTK.setForeground(new java.awt.Color(255, 255, 255));
        lblSuaTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuaTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        lblSuaTK.setText("Sửa TK");
        lblSuaTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSuaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuaTK.setOpaque(true);
        lblSuaTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaTKMouseExited(evt);
            }
        });
        pnlThongTinTaiKhoan.add(lblSuaTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 357, 107, 40));

        lblThemTK.setBackground(new java.awt.Color(0, 153, 255));
        lblThemTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThemTK.setForeground(new java.awt.Color(255, 255, 255));
        lblThemTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add.png"))); // NOI18N
        lblThemTK.setText("Thêm TK");
        lblThemTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblThemTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemTK.setOpaque(true);
        lblThemTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemTKMouseExited(evt);
            }
        });
        pnlThongTinTaiKhoan.add(lblThemTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 357, 107, 40));

        lblTitleThongTinTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleThongTinTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleThongTinTaiKhoan.setText("Thông Tin Tài Khoản");
        pnlThongTinTaiKhoan.add(lblTitleThongTinTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 548, 36));

        lblResetTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlThongTinTaiKhoan.add(lblResetTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        javax.swing.GroupLayout pnlDanhMucTaiKhoanLayout = new javax.swing.GroupLayout(pnlDanhMucTaiKhoan);
        pnlDanhMucTaiKhoan.setLayout(pnlDanhMucTaiKhoanLayout);
        pnlDanhMucTaiKhoanLayout.setHorizontalGroup(
            pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                        .addComponent(txtTimKiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTimKiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhMucTaiKhoanLayout.setVerticalGroup(
            pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucTaiKhoanLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTimKiemTK)
                            .addComponent(lblTimKiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        tblSanPhamSP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tblSanPhamSP);

        txtTimKiemSanPhamSP.setForeground(new java.awt.Color(204, 204, 204));
        txtTimKiemSanPhamSP.setText("Tìm Kiếm . . .");

        lblTimKiemSanPhamSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimKiemSanPhamSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        lblTimKiemSanPhamSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pnlThongTinSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongTinSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTenSanPhamSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenSanPhamSP.setText("Tên Sản Phẩm");

        lblMaSanPhamSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaSanPhamSP.setText("Mã Sản Phẩm");

        lblSoLuongSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoLuongSP.setText("Số Lượng");

        lblDonViTinhSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDonViTinhSP.setText("Đơn Vị Tính");

        lblDonGiaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDonGiaSP.setText("Đơn Giá");

        lblThemSP.setBackground(new java.awt.Color(0, 153, 255));
        lblThemSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThemSP.setForeground(new java.awt.Color(255, 255, 255));
        lblThemSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        lblThemSP.setText("Thêm SP");
        lblThemSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblThemSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemSP.setOpaque(true);
        lblThemSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemSPMouseExited(evt);
            }
        });

        lblSuaSP.setBackground(new java.awt.Color(0, 153, 255));
        lblSuaSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuaSP.setForeground(new java.awt.Color(255, 255, 255));
        lblSuaSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        lblSuaSP.setText("Sửa SP");
        lblSuaSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSuaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuaSP.setOpaque(true);
        lblSuaSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaSPMouseExited(evt);
            }
        });

        lblXoaSP.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaSP.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        lblXoaSP.setText("Xóa SP");
        lblXoaSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblXoaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaSP.setOpaque(true);
        lblXoaSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaSPMouseExited(evt);
            }
        });

        lblResetSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cboDonViTinhSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn Đơn Vị---" }));

        lblTitleThongTinSP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleThongTinSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleThongTinSP.setText("Thông Tin Sản Phẩm");

        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn Loại SP---" }));

        lblLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLoaiSP.setText("Loại");

        lblTrangThaiSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTrangThaiSP.setText("Trạng Thái");

        cboTrangThaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Kinh Doanh", "Ngừng Kinh Doanh" }));

        javax.swing.GroupLayout pnlThongTinSanPhamLayout = new javax.swing.GroupLayout(pnlThongTinSanPham);
        pnlThongTinSanPham.setLayout(pnlThongTinSanPhamLayout);
        pnlThongTinSanPhamLayout.setHorizontalGroup(
            pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinSanPhamLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResetSP)
                .addContainerGap())
            .addComponent(lblTitleThongTinSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlThongTinSanPhamLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblDonGiaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenSanPhamSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaSanPhamSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoLuongSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDonViTinhSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTrangThaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboTrangThaiSP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboDonViTinhSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTenSanPhamSP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMaSanPhamSP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSoLuongSP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDonGiaSP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlThongTinSanPhamLayout.createSequentialGroup()
                            .addComponent(lblXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlThongTinSanPhamLayout.setVerticalGroup(
            pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinSanPhamLayout.createSequentialGroup()
                .addComponent(lblResetSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitleThongTinSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenSanPhamSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSanPhamSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSanPhamSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSanPhamSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonViTinhSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDonViTinhSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTrangThaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(pnlThongTinSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout pnlDanhMucSPLayout = new javax.swing.GroupLayout(pnlDanhMucSP);
        pnlDanhMucSP.setLayout(pnlDanhMucSPLayout);
        pnlDanhMucSPLayout.setHorizontalGroup(
            pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucSPLayout.createSequentialGroup()
                        .addComponent(txtTimKiemSanPhamSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTimKiemSanPhamSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDanhMucSPLayout.setVerticalGroup(
            pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThongTinSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                        .addGroup(pnlDanhMucSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKiemSanPhamSP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucSPLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblTimKiemSanPhamSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9)))
                .addContainerGap())
        );

        pnlDanhMucConSP.add(pnlDanhMucSP, "danhMucSanPham");

        pnlThongTinLoaiSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongTinLoaiSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblMaLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaLoai.setText("Mã Loại");

        lblTenLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenLoai.setText("Tên Loại");

        lblMoTa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMoTa.setText("Mô Tả");

        lblThemLoai.setBackground(new java.awt.Color(0, 153, 255));
        lblThemLoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThemLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblThemLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        lblThemLoai.setText("Thêm");
        lblThemLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblThemLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemLoai.setOpaque(true);
        lblThemLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemLoaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemLoaiMouseExited(evt);
            }
        });

        lblSuaLoai.setBackground(new java.awt.Color(0, 153, 255));
        lblSuaLoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuaLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblSuaLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuaLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        lblSuaLoai.setText("Sửa");
        lblSuaLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSuaLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuaLoai.setOpaque(true);
        lblSuaLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaLoaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaLoaiMouseExited(evt);
            }
        });

        lblXoaLoai.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaLoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        lblXoaLoai.setText("Xóa");
        lblXoaLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblXoaLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaLoai.setOpaque(true);
        lblXoaLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaLoaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaLoaiMouseExited(evt);
            }
        });

        lblResetLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTitleThongTinLoai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleThongTinLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleThongTinLoai.setText("Thông Tin Loại Sản Phẩm");

        txtMoTaLoai.setColumns(20);
        txtMoTaLoai.setRows(5);
        jScrollPane16.setViewportView(txtMoTaLoai);

        javax.swing.GroupLayout pnlThongTinLoaiSanPhamLayout = new javax.swing.GroupLayout(pnlThongTinLoaiSanPham);
        pnlThongTinLoaiSanPham.setLayout(pnlThongTinLoaiSanPhamLayout);
        pnlThongTinLoaiSanPhamLayout.setHorizontalGroup(
            pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleThongTinLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlThongTinLoaiSanPhamLayout.createSequentialGroup()
                .addGroup(pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinLoaiSanPhamLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblResetLoai))
                    .addGroup(pnlThongTinLoaiSanPhamLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMaLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(lblTenLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMoTa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaLoai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenLoai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongTinLoaiSanPhamLayout.createSequentialGroup()
                                .addComponent(lblXoaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSuaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblThemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane16))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlThongTinLoaiSanPhamLayout.setVerticalGroup(
            pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinLoaiSanPhamLayout.createSequentialGroup()
                .addComponent(lblResetLoai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitleThongTinLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinLoaiSanPhamLayout.createSequentialGroup()
                        .addComponent(lblMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addGroup(pnlThongTinLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSuaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblXoaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblThemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        tblLoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(tblLoaiSanPham);

        lblTimLoaiSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimLoaiSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        lblTimLoaiSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtTimLoaiSP.setForeground(new java.awt.Color(204, 204, 204));
        txtTimLoaiSP.setText("Tìm Kiếm . . .");

        javax.swing.GroupLayout pnlDanhMucLoaiLayout = new javax.swing.GroupLayout(pnlDanhMucLoai);
        pnlDanhMucLoai.setLayout(pnlDanhMucLoaiLayout);
        pnlDanhMucLoaiLayout.setHorizontalGroup(
            pnlDanhMucLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(pnlDanhMucLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucLoaiLayout.createSequentialGroup()
                        .addComponent(txtTimLoaiSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTimLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtTimLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucLoaiLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblTimLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12))
                    .addComponent(pnlThongTinLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        pnlDanhMucConSP.add(pnlDanhMucLoai, "danhMucLoai");

        pnlDanhMucDonVi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlThongTinDonViTinhDV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongTinDonViTinhDV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblMaDonViDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaDonViDV.setText("Mã Đơn Vị");

        lblTenDonViDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenDonViDV.setText("Tên Đơn Vị");

        lblMoTaDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMoTaDV.setText("Mô Tả");

        lblThemDV.setBackground(new java.awt.Color(0, 153, 255));
        lblThemDV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThemDV.setForeground(new java.awt.Color(255, 255, 255));
        lblThemDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        lblThemDV.setText("Thêm ĐV");
        lblThemDV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblThemDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemDV.setOpaque(true);
        lblThemDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemDVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemDVMouseExited(evt);
            }
        });

        lblSuaDV.setBackground(new java.awt.Color(0, 153, 255));
        lblSuaDV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuaDV.setForeground(new java.awt.Color(255, 255, 255));
        lblSuaDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuaDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        lblSuaDV.setText("Sửa ĐV");
        lblSuaDV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSuaDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuaDV.setOpaque(true);
        lblSuaDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaDVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaDVMouseExited(evt);
            }
        });

        lblXoaDV.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaDV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaDV.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        lblXoaDV.setText("Xóa ĐV");
        lblXoaDV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblXoaDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaDV.setOpaque(true);
        lblXoaDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaDVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaDVMouseExited(evt);
            }
        });

        lblResetDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTitleThongTinDonVi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleThongTinDonVi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleThongTinDonVi.setText("Thông Tin Đơn Vị Tính");

        txtMoTaDV.setColumns(20);
        txtMoTaDV.setRows(5);
        jScrollPane14.setViewportView(txtMoTaDV);

        javax.swing.GroupLayout pnlThongTinDonViTinhDVLayout = new javax.swing.GroupLayout(pnlThongTinDonViTinhDV);
        pnlThongTinDonViTinhDV.setLayout(pnlThongTinDonViTinhDVLayout);
        pnlThongTinDonViTinhDVLayout.setHorizontalGroup(
            pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinDonViTinhDVLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResetDV)
                .addContainerGap())
            .addComponent(lblTitleThongTinDonVi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlThongTinDonViTinhDVLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMaDonViDV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenDonViDV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(lblMoTaDV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMaDonViDV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenDonViDV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinDonViTinhDVLayout.createSequentialGroup()
                        .addComponent(lblXoaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSuaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane14))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlThongTinDonViTinhDVLayout.setVerticalGroup(
            pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinDonViTinhDVLayout.createSequentialGroup()
                .addComponent(lblResetDV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitleThongTinDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaDonViDV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaDonViDV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenDonViDV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDonViDV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoTaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(pnlThongTinDonViTinhDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXoaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        tblDonViTinh.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane13.setViewportView(tblDonViTinh);

        lblTimKiemDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimKiemDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        lblTimKiemDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtTimKiemDV.setForeground(new java.awt.Color(204, 204, 204));
        txtTimKiemDV.setText("Tìm Kiếm . . .");

        javax.swing.GroupLayout pnlDanhMucDonViLayout = new javax.swing.GroupLayout(pnlDanhMucDonVi);
        pnlDanhMucDonVi.setLayout(pnlDanhMucDonViLayout);
        pnlDanhMucDonViLayout.setHorizontalGroup(
            pnlDanhMucDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucDonViLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinDonViTinhDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(pnlDanhMucDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucDonViLayout.createSequentialGroup()
                        .addComponent(txtTimKiemDV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTimKiemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtTimKiemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDanhMucDonViLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblTimKiemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13))
                    .addComponent(pnlThongTinDonViTinhDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tblChonKH.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblChonKH);

        tblChonSP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblChonSP);

        txtTimKhachHangHD.setForeground(new java.awt.Color(204, 204, 204));
        txtTimKhachHangHD.setText("Nhập SĐT KH. . .");
        txtTimKhachHangHD.setToolTipText("Tìm Khách Hàng");

        txtTimSanPhamHD.setForeground(new java.awt.Color(204, 204, 204));
        txtTimSanPhamHD.setText("Nhập Mã hoặc Tên SP. . .");
        txtTimSanPhamHD.setToolTipText("Tìm SP");

        pnlThongTinHoaDonTam.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTenKhachHangHD.setText("Tên KH");

        txtTenKhachHangHD.setEditable(false);

        lblSdtKhachHangHD.setText("SĐT KH");

        txtSdtKhachHangHD.setEditable(false);

        lblNgayLapHD.setText("Ngày Lập HD");

        txtNgayLapHD.setEditable(false);

        lblPhanTramGiamHD.setText("Phần Trăm Giảm Giá");

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

        lblMaKhachHangHD.setText("Mã KH");

        txtMaKhachHangHD.setEditable(false);

        lblTongTienHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTongTienHD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongTienHD.setText("Tiền Cần Thanh Toán: 0 VND");

        cboPhanTramGiamHD.setEditable(true);
        cboPhanTramGiamHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" }));

        lblThanhTienGiamHD.setText("Số Tiền Giảm: 0 VND");

        lblResetHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetHD.setToolTipText("Reset Hóa Đơn");
        lblResetHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblThanhToan.setBackground(new java.awt.Color(0, 153, 255));
        lblThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        lblThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/pay.png"))); // NOI18N
        lblThanhToan.setText("THANH TOÁN");
        lblThanhToan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        lblThanhToan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThanhToan.setOpaque(true);
        lblThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThanhToanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThanhToanMouseExited(evt);
            }
        });

        lblInHD.setBackground(new java.awt.Color(0, 153, 255));
        lblInHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInHD.setForeground(new java.awt.Color(255, 255, 255));
        lblInHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/printbill.png"))); // NOI18N
        lblInHD.setText("IN HÓA ĐƠN");
        lblInHD.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        lblInHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInHD.setOpaque(true);
        lblInHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInHDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInHDMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlThongTinHoaDonTamLayout = new javax.swing.GroupLayout(pnlThongTinHoaDonTam);
        pnlThongTinHoaDonTam.setLayout(pnlThongTinHoaDonTamLayout);
        pnlThongTinHoaDonTamLayout.setHorizontalGroup(
            pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinHoaDonTamLayout.createSequentialGroup()
                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinHoaDonTamLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(pnlThongTinHoaDonTamLayout.createSequentialGroup()
                                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNgayLapHD, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(lblMaKhachHangHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTenKhachHangHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSdtKhachHangHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdtKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResetHD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlThongTinHoaDonTamLayout.createSequentialGroup()
                                .addComponent(lblPhanTramGiamHD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboPhanTramGiamHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblThanhTienGiamHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinHoaDonTamLayout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(lblTongTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinHoaDonTamLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlThongTinHoaDonTamLayout.setVerticalGroup(
            pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinHoaDonTamLayout.createSequentialGroup()
                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinHoaDonTamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblResetHD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSdtKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdtKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhanTramGiamHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPhanTramGiamHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThanhTienGiamHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTongTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(pnlThongTinHoaDonTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtTimKhachHangHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtTimSanPhamHD, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThongTinHoaDonTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlLapHoaDonLayout.setVerticalGroup(
            pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLapHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLapHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTimKhachHangHD, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(txtTimSanPhamHD))
                        .addGap(0, 0, 0)
                        .addGroup(pnlLapHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addComponent(pnlThongTinHoaDonTam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlChinh.add(pnlLapHoaDon, "lapHoaDon");

        tblDanhSachHDCT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblDanhSachHDCT);

        lblMaKhachHangHDCT.setText("Mã KH");

        txtMaKhachHangHDCT.setEditable(false);

        txtTenKhachHangHDCT.setEditable(false);

        lblTenKhachHangHDCT.setText("Tên KH");

        lblSdtKhachHangHDCT.setText("SĐT KH");

        txtSdtKhachHangHDCT.setEditable(false);

        lblNgayLapHDCT.setText("Ngày Lập HD");

        txtNgayLapHDCT.setEditable(false);

        lblPhanTramGiamHDCT.setText("Phần Trăm Giảm Giá");

        cboPhanTramGiamHDCT.setEditable(true);
        cboPhanTramGiamHDCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" }));

        lblSoTienGiamHDCT.setText("Số Tiền Giảm: 0 VND");

        tblThongTinHDCT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblThongTinHDCT);

        lblTongTienHDCT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTongTienHDCT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongTienHDCT.setText("Tiền Cần Thanh Toán: 0 VND");

        txtTimKiemHDCT.setForeground(new java.awt.Color(204, 204, 204));
        txtTimKiemHDCT.setText("Nhập SĐT KH hoặc Mã HDCT để tìm HD. . .");

        lblMaThuNganHDCT.setText("Mã Thu Ngân");

        txtMaThuNganHDCT.setEditable(false);

        lblTenThuNganHDCT.setText("Tên Thu Ngân");

        txtTenThuNganHDCT.setEditable(false);

        lblInHDCT.setBackground(new java.awt.Color(0, 153, 255));
        lblInHDCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInHDCT.setForeground(new java.awt.Color(255, 255, 255));
        lblInHDCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInHDCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/printbill.png"))); // NOI18N
        lblInHDCT.setText("IN HÓA ĐƠN");
        lblInHDCT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        lblInHDCT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInHDCT.setOpaque(true);
        lblInHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInHDCTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInHDCTMouseExited(evt);
            }
        });

        lblXoaHDCT.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaHDCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaHDCT.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaHDCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaHDCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/paper-bin.png"))); // NOI18N
        lblXoaHDCT.setText("XÓA HÓA ĐƠN");
        lblXoaHDCT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        lblXoaHDCT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaHDCT.setOpaque(true);
        lblXoaHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaHDCTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaHDCTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlXemHoaDonLayout = new javax.swing.GroupLayout(pnlXemHoaDon);
        pnlXemHoaDon.setLayout(pnlXemHoaDonLayout);
        pnlXemHoaDonLayout.setHorizontalGroup(
            pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTimKiemHDCT)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNgayLapHDCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaKhachHangHDCT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTenKhachHangHDCT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSdtKhachHangHDCT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSdtKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayLapHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                .addComponent(lblXoaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlXemHoaDonLayout.createSequentialGroup()
                                    .addComponent(lblPhanTramGiamHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(cboPhanTramGiamHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSoTienGiamHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                    .addComponent(lblMaThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(txtMaThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(lblTenThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTenThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblTongTienHDCT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(lblMaThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenThuNganHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSdtKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSdtKhachHangHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayLapHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayLapHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhanTramGiamHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPhanTramGiamHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoTienGiamHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTongTienHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addGroup(pnlXemHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblXoaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlXemHoaDonLayout.createSequentialGroup()
                        .addComponent(txtTimKiemHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlChinh.add(pnlXemHoaDon, "xemHoaDon");

        pnlThongTinKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlThongTinKH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblMaKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaKH.setText("Mã Khách Hàng");

        lblTenKhachHangKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenKhachHangKH.setText("Tên Khách Hàng");

        lblSdtKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSdtKH.setText("Số Điện Thoại");

        lblThemKH.setBackground(new java.awt.Color(0, 153, 255));
        lblThemKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThemKH.setForeground(new java.awt.Color(255, 255, 255));
        lblThemKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/add-user.png"))); // NOI18N
        lblThemKH.setText("Thêm KH");
        lblThemKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblThemKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemKH.setOpaque(true);
        lblThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemKHMouseExited(evt);
            }
        });

        lblSuaKH.setBackground(new java.awt.Color(0, 153, 255));
        lblSuaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuaKH.setForeground(new java.awt.Color(255, 255, 255));
        lblSuaKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/update.png"))); // NOI18N
        lblSuaKH.setText("Sửa KH");
        lblSuaKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSuaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuaKH.setOpaque(true);
        lblSuaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaKHMouseExited(evt);
            }
        });

        lblXoaKH.setBackground(new java.awt.Color(0, 153, 255));
        lblXoaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXoaKH.setForeground(new java.awt.Color(255, 255, 255));
        lblXoaKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/delete.png"))); // NOI18N
        lblXoaKH.setText("Xóa KH");
        lblXoaKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblXoaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblXoaKH.setOpaque(true);
        lblXoaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaKHMouseExited(evt);
            }
        });

        lblResetKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/refresh.png"))); // NOI18N
        lblResetKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTitleThongTinKH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleThongTinKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleThongTinKH.setText("Thông Tin Khách Hàng");

        javax.swing.GroupLayout pnlThongTinKHLayout = new javax.swing.GroupLayout(pnlThongTinKH);
        pnlThongTinKH.setLayout(pnlThongTinKHLayout);
        pnlThongTinKHLayout.setHorizontalGroup(
            pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResetKH)
                .addContainerGap())
            .addComponent(lblTitleThongTinKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlThongTinKHLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenKhachHangKH, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(lblSdtKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKhachHangKH, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinKHLayout.createSequentialGroup()
                        .addComponent(lblXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSdtKH, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnlThongTinKHLayout.setVerticalGroup(
            pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKHLayout.createSequentialGroup()
                .addComponent(lblResetKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitleThongTinKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKhachHangKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhachHangKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSdtKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdtKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
        );

        tblThongTinKH.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane15.setViewportView(tblThongTinKH);

        txtTimKiemKH.setForeground(new java.awt.Color(204, 204, 204));
        txtTimKiemKH.setText("Tìm Kiếm . . .");

        lblTimKiemKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimKiemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/searching.png"))); // NOI18N
        lblTimKiemKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangLayout.createSequentialGroup()
                        .addComponent(txtTimKiemKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTimKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtTimKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblTimKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15))
                    .addComponent(pnlThongTinKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlChinh.add(pnlKhachHang, "khachHang");

        lblNgayDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNgayDT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgayDT.setText("Ngày");

        cboNgayDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Ngày--" }));

        lblThangDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThangDT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThangDT.setText("Tháng");

        cboThangDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Tháng--" }));

        lblNamDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNamDT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNamDT.setText("Năm");

        cboNamDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn Năm--" }));

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane17.setViewportView(tblDoanhThu);

        lblTongDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTongDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTongDoanhThu.setText("Doanh Thu: 0 VNĐ");

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17)
                    .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                        .addComponent(lblNgayDT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNgayDT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblThangDT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboThangDT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNamDT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNamDT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 463, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoanhThuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNgayDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNgayDT)
                    .addComponent(lblThangDT, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(cboThangDT)
                    .addComponent(cboNamDT)
                    .addComponent(lblNamDT, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTongDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
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

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/fitness.png"))); // NOI18N
        jMenu1.setText("QuanLyShopTheThaoBingBong");
        jMenu1.setEnabled(false);
        jMenuBar1.add(jMenu1);

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
        this.dispose();
        new LoginDialog().setVisible(true);
    }//GEN-LAST:event_lblDangXuatIconMouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        this.dispose();
        new LoginDialog().setVisible(true);
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

    private void lblXoaNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaNVMouseEntered
        lblXoaNV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaNVMouseEntered

    private void lblSuaNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaNVMouseEntered
        lblSuaNV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblSuaNVMouseEntered

    private void lblThemNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemNVMouseEntered
        lblThemNV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThemNVMouseEntered

    private void lblXoaNVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaNVMouseExited
        lblXoaNV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblXoaNVMouseExited

    private void lblSuaNVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaNVMouseExited
        lblSuaNV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblSuaNVMouseExited

    private void lblThemNVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemNVMouseExited
        lblThemNV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblThemNVMouseExited

    private void lblXoaCVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaCVMouseEntered
        lblXoaCV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaCVMouseEntered

    private void lblSuaCVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaCVMouseEntered
        lblSuaCV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblSuaCVMouseEntered

    private void lblThemCVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemCVMouseEntered
        lblThemCV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThemCVMouseEntered

    private void lblXoaCVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaCVMouseExited
        lblXoaCV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblXoaCVMouseExited

    private void lblSuaCVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaCVMouseExited
        lblSuaCV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblSuaCVMouseExited

    private void lblThemCVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemCVMouseExited
        lblThemCV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblThemCVMouseExited

    private void lblXoaTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaTKMouseEntered
         lblXoaTK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaTKMouseEntered

    private void lblSuaTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaTKMouseEntered
        lblSuaTK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblSuaTKMouseEntered

    private void lblThemTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemTKMouseEntered
        lblThemTK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThemTKMouseEntered

    private void lblXoaTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaTKMouseExited
        lblXoaTK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblXoaTKMouseExited

    private void lblSuaTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaTKMouseExited
        lblSuaTK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblSuaTKMouseExited

    private void lblThemTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemTKMouseExited
        lblThemTK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblThemTKMouseExited

    private void lblXoaSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaSPMouseEntered
        lblXoaSP.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaSPMouseEntered

    private void lblSuaSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaSPMouseEntered
        lblSuaSP.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblSuaSPMouseEntered

    private void lblThemSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemSPMouseEntered
        lblThemSP.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThemSPMouseEntered

    private void lblXoaSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaSPMouseExited
        lblXoaSP.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblXoaSPMouseExited

    private void lblSuaSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaSPMouseExited
        lblSuaSP.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblSuaSPMouseExited

    private void lblThemSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemSPMouseExited
        lblThemSP.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblThemSPMouseExited

    private void lblXoaLoaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaLoaiMouseEntered
        lblXoaLoai.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaLoaiMouseEntered

    private void lblSuaLoaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaLoaiMouseEntered
        lblSuaLoai.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblSuaLoaiMouseEntered

    private void lblThemLoaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemLoaiMouseEntered
        lblThemLoai.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThemLoaiMouseEntered

    private void lblXoaLoaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaLoaiMouseExited
        lblXoaLoai.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblXoaLoaiMouseExited

    private void lblSuaLoaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaLoaiMouseExited
        lblSuaLoai.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblSuaLoaiMouseExited

    private void lblThemLoaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemLoaiMouseExited
        lblThemLoai.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblThemLoaiMouseExited

    private void lblXoaDVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaDVMouseEntered
        lblXoaDV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaDVMouseEntered

    private void lblSuaDVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaDVMouseEntered
        lblSuaDV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblSuaDVMouseEntered

    private void lblThemDVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemDVMouseEntered
        lblThemDV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThemDVMouseEntered

    private void lblXoaDVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaDVMouseExited
        lblXoaDV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblXoaDVMouseExited

    private void lblSuaDVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaDVMouseExited
        lblSuaDV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblSuaDVMouseExited

    private void lblThemDVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemDVMouseExited
        lblThemDV.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblThemDVMouseExited

    private void lblThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThanhToanMouseEntered
        lblThanhToan.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThanhToanMouseEntered

    private void lblInHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInHDMouseEntered
        lblInHD.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblInHDMouseEntered

    private void lblThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThanhToanMouseExited
        lblThanhToan.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153)));
    }//GEN-LAST:event_lblThanhToanMouseExited

    private void lblInHDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInHDMouseExited
        lblInHD.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153)));
    }//GEN-LAST:event_lblInHDMouseExited

    private void lblInHDCTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInHDCTMouseEntered
        lblInHDCT.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblInHDCTMouseEntered

    private void lblXoaHDCTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaHDCTMouseEntered
        lblXoaHDCT.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaHDCTMouseEntered

    private void lblInHDCTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInHDCTMouseExited
        lblInHDCT.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153)));
    }//GEN-LAST:event_lblInHDCTMouseExited

    private void lblXoaHDCTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaHDCTMouseExited
        lblXoaHDCT.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153)));
    }//GEN-LAST:event_lblXoaHDCTMouseExited

    private void lblThemKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemKHMouseEntered
        lblThemKH.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblThemKHMouseEntered

    private void lblSuaKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaKHMouseEntered
        lblSuaKH.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblSuaKHMouseEntered

    private void lblXoaKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaKHMouseEntered
        lblXoaKH.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 255, 51)));
    }//GEN-LAST:event_lblXoaKHMouseEntered

    private void lblThemKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemKHMouseExited
        lblThemKH.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblThemKHMouseExited

    private void lblSuaKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaKHMouseExited
        lblSuaKH.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblSuaKHMouseExited

    private void lblXoaKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaKHMouseExited
        lblXoaKH.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
    }//GEN-LAST:event_lblXoaKHMouseExited

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
    private javax.swing.JComboBox<String> cboChucVuNV;
    private javax.swing.JComboBox<String> cboDonViTinhSP;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JComboBox<String> cboNamDT;
    private javax.swing.JComboBox<String> cboNgayDT;
    private javax.swing.JComboBox<String> cboPhanTramGiamHD;
    private javax.swing.JComboBox<String> cboPhanTramGiamHDCT;
    private javax.swing.JComboBox<String> cboThangDT;
    private javax.swing.JComboBox<String> cboTrangThaiSP;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblAvatarNV;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblBanHangIcon;
    private javax.swing.JLabel lblChao;
    private javax.swing.JLabel lblChonAvatarNV;
    private javax.swing.JLabel lblChucVuNV;
    private javax.swing.JLabel lblChucVuTK;
    private javax.swing.JLabel lblCmndNV;
    private javax.swing.JLabel lblConfirmPassTK;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDangXuatIcon;
    private javax.swing.JLabel lblDanhMucChucVu;
    private javax.swing.JLabel lblDanhMucDonVi;
    private javax.swing.JLabel lblDanhMucLoai;
    private javax.swing.JLabel lblDanhMucNhanVien;
    private javax.swing.JLabel lblDanhMucSanPham;
    private javax.swing.JLabel lblDanhMucTaiKhoan;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiaChiNV;
    private javax.swing.JLabel lblDiaChiShop;
    private javax.swing.JLabel lblDonGiaSP;
    private javax.swing.JLabel lblDonViTinhSP;
    private javax.swing.JLabel lblGioiTinhNV;
    private javax.swing.JLabel lblGmailNV;
    private javax.swing.JLabel lblHoaDonDaThanhToan;
    private javax.swing.JLabel lblHoaDonDaThanhToanIcon;
    private javax.swing.JLabel lblInHD;
    private javax.swing.JLabel lblInHDCT;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhachHangIcon;
    private javax.swing.JLabel lblLapHoaDon;
    private javax.swing.JLabel lblLapHoaDonIcon;
    private javax.swing.JLabel lblLoaiSP;
    private javax.swing.JLabel lblMaChucVuCV;
    private javax.swing.JLabel lblMaDonViDV;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMaKhachHangHD;
    private javax.swing.JLabel lblMaKhachHangHDCT;
    private javax.swing.JLabel lblMaLoai;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaSanPhamSP;
    private javax.swing.JLabel lblMaThuNganHDCT;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblMoTaCV;
    private javax.swing.JLabel lblMoTaDV;
    private javax.swing.JLabel lblNamDT;
    private javax.swing.JLabel lblNextSlideShow;
    private javax.swing.JLabel lblNgayDT;
    private javax.swing.JLabel lblNgayLapHD;
    private javax.swing.JLabel lblNgayLapHDCT;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblNhanVienIcon;
    private javax.swing.JLabel lblPassTK;
    private javax.swing.JLabel lblPhanTramGiamHD;
    private javax.swing.JLabel lblPhanTramGiamHDCT;
    private javax.swing.JLabel lblPreSlideShow;
    private javax.swing.JLabel lblResetCV;
    private javax.swing.JLabel lblResetDV;
    private javax.swing.JLabel lblResetHD;
    private javax.swing.JLabel lblResetKH;
    private javax.swing.JLabel lblResetLoai;
    private javax.swing.JLabel lblResetNV;
    private javax.swing.JLabel lblResetSP;
    private javax.swing.JLabel lblResetTK;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblSanPhamIcon;
    private javax.swing.JLabel lblSdtKH;
    private javax.swing.JLabel lblSdtKhachHangHD;
    private javax.swing.JLabel lblSdtKhachHangHDCT;
    private javax.swing.JLabel lblSdtShop;
    private javax.swing.JLabel lblSdtTK;
    private javax.swing.JLabel lblShop;
    private javax.swing.JLabel lblSilogan;
    private javax.swing.JLabel lblSlideShow;
    private javax.swing.JLabel lblSoDienThoaiNV;
    private javax.swing.JLabel lblSoLuongSP;
    private javax.swing.JLabel lblSoTienGiamHDCT;
    private javax.swing.JLabel lblSuaCV;
    private javax.swing.JLabel lblSuaDV;
    private javax.swing.JLabel lblSuaKH;
    private javax.swing.JLabel lblSuaLoai;
    private javax.swing.JLabel lblSuaNV;
    private javax.swing.JLabel lblSuaSP;
    private javax.swing.JLabel lblSuaTK;
    private javax.swing.JLabel lblTenChucVuCV;
    private javax.swing.JLabel lblTenDonViDV;
    private javax.swing.JLabel lblTenKhachHangHD;
    private javax.swing.JLabel lblTenKhachHangHDCT;
    private javax.swing.JLabel lblTenKhachHangKH;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTenNhanVienTK;
    private javax.swing.JLabel lblTenSanPhamSP;
    private javax.swing.JLabel lblTenShop;
    private javax.swing.JLabel lblTenThuNganHDCT;
    private javax.swing.JLabel lblThangDT;
    private javax.swing.JLabel lblThanhTienGiamHD;
    private javax.swing.JLabel lblThanhToan;
    private javax.swing.JLabel lblThemCV;
    private javax.swing.JLabel lblThemDV;
    private javax.swing.JLabel lblThemKH;
    private javax.swing.JLabel lblThemLoai;
    private javax.swing.JLabel lblThemNV;
    private javax.swing.JLabel lblThemSP;
    private javax.swing.JLabel lblThemTK;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblThoatIcon;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblThongKeIcon;
    private javax.swing.JLabel lblTimCV;
    private javax.swing.JLabel lblTimKiemDV;
    private javax.swing.JLabel lblTimKiemKH;
    private javax.swing.JLabel lblTimKiemSanPhamSP;
    private javax.swing.JLabel lblTimKiemTK;
    private javax.swing.JLabel lblTimLoaiSP;
    private javax.swing.JLabel lblTimNV;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitleThongTinChucVu;
    private javax.swing.JLabel lblTitleThongTinDonVi;
    private javax.swing.JLabel lblTitleThongTinKH;
    private javax.swing.JLabel lblTitleThongTinLoai;
    private javax.swing.JLabel lblTitleThongTinSP;
    private javax.swing.JLabel lblTitleThongTinTaiKhoan;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JLabel lblTongQuanHeThong;
    private javax.swing.JLabel lblTongTienHD;
    private javax.swing.JLabel lblTongTienHDCT;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel lblTrangChuIcon;
    private javax.swing.JLabel lblTrangThaiSP;
    private javax.swing.JLabel lblXoaCV;
    private javax.swing.JLabel lblXoaDV;
    private javax.swing.JLabel lblXoaHDCT;
    private javax.swing.JLabel lblXoaKH;
    private javax.swing.JLabel lblXoaLoai;
    private javax.swing.JLabel lblXoaNV;
    private javax.swing.JLabel lblXoaSP;
    private javax.swing.JLabel lblXoaTK;
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
    private javax.swing.JPanel pnlThongTinChucVu;
    private javax.swing.JPanel pnlThongTinDonViTinhDV;
    private javax.swing.JPanel pnlThongTinHoaDonTam;
    private javax.swing.JPanel pnlThongTinKH;
    private javax.swing.JPanel pnlThongTinLoaiSanPham;
    private javax.swing.JPanel pnlThongTinNhanVien;
    private javax.swing.JPanel pnlThongTinSanPham;
    private javax.swing.JPanel pnlThongTinShop;
    private javax.swing.JPanel pnlThongTinTaiKhoan;
    private javax.swing.JPanel pnlTrangChu;
    private javax.swing.JPanel pnlXemHoaDon;
    private javax.swing.JRadioButton rdoNamNV;
    private javax.swing.JRadioButton rdoNuNV;
    private javax.swing.JTable tblChonKH;
    private javax.swing.JTable tblChonSP;
    private javax.swing.JTable tblChucVuCV;
    private javax.swing.JTable tblDanhSachHDCT;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblDonViTinh;
    private javax.swing.JTable tblLoaiSanPham;
    private javax.swing.JTable tblNhanVienNV;
    private javax.swing.JTable tblSanPhamSP;
    private javax.swing.JTable tblTaiKhoan;
    private javax.swing.JTable tblThongTinHDCT;
    private javax.swing.JTable tblThongTinKH;
    private javax.swing.JTextField txtChucVuTK;
    private javax.swing.JTextField txtCmndNV;
    private javax.swing.JTextField txtConfirmPassTK;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtDonGiaSP;
    private javax.swing.JTextField txtGmailNV;
    private javax.swing.JTextField txtHoVaTenDemNV;
    private javax.swing.JTextField txtMaChucVuCV;
    private javax.swing.JTextField txtMaDonViDV;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaKhachHangHD;
    private javax.swing.JTextField txtMaKhachHangHDCT;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaSanPhamSP;
    private javax.swing.JTextField txtMaThuNganHDCT;
    private javax.swing.JTextArea txtMoTaCV;
    private javax.swing.JTextArea txtMoTaDV;
    private javax.swing.JTextArea txtMoTaLoai;
    private javax.swing.JTextField txtNgayLapHD;
    private javax.swing.JTextField txtNgayLapHDCT;
    private javax.swing.JTextField txtPassTK;
    private javax.swing.JTextField txtSdtKH;
    private javax.swing.JTextField txtSdtKhachHangHD;
    private javax.swing.JTextField txtSdtKhachHangHDCT;
    private javax.swing.JTextField txtSdtTK;
    private javax.swing.JTextField txtSoDienThoaiNV;
    private javax.swing.JTextField txtSoLuongSP;
    private javax.swing.JTextField txtTenChucVuCV;
    private javax.swing.JTextField txtTenDonViDV;
    private javax.swing.JTextField txtTenKhachHangHD;
    private javax.swing.JTextField txtTenKhachHangHDCT;
    private javax.swing.JTextField txtTenKhachHangKH;
    private javax.swing.JTextField txtTenLoai;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenNhanVienTK;
    private javax.swing.JTextField txtTenSanPhamSP;
    private javax.swing.JTextField txtTenThuNganHDCT;
    private javax.swing.JTextField txtTimCV;
    private javax.swing.JTextField txtTimKhachHangHD;
    private javax.swing.JTextField txtTimKiemDV;
    private javax.swing.JTextField txtTimKiemHDCT;
    private javax.swing.JTextField txtTimKiemKH;
    private javax.swing.JTextField txtTimKiemSanPhamSP;
    private javax.swing.JTextField txtTimKiemTK;
    private javax.swing.JTextField txtTimLoaiSP;
    private javax.swing.JTextField txtTimNV;
    private javax.swing.JTextField txtTimSanPhamHD;
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