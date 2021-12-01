GO
CREATE DATABASE QuanLyShopTheThaoPingPong;
GO
USE QuanLyShopTheThaoPingPong;
GO
CREATE TABLE NhanVien (
    MaNV nvarchar(20) NOT NULL,
    TenNV nvarchar(500) NOT NULL,
    SoDienThoai varchar(10) NOT NULL UNIQUE,
    DiaChi nvarchar(500) NOT NULL,
    CMND nvarchar(12) NOT NULL UNIQUE,
    GioiTinh bit NOT NULL,
    MaChucVu nvarchar(20) NOT NULL,
    Gmail nvarchar(100) NOT NULL UNIQUE,
	PathAnh nvarchar(max) NULL,
    PRIMARY KEY (MaNV)
);
GO
CREATE TABLE SanPham (
    MaSP nvarchar(20) NOT NULL,
    TenSP nvarchar(255) NOT NULL,
    DonViTinh nvarchar(20) NOT NULL,
	SoLuong int NOT NULL,
    Gia float NOT NULL,
    TrangThai nvarchar(100) NOT NULL,
    Loai nvarchar(20) NOT NULL,
    PRIMARY KEY (MaSP)
);
GO
CREATE TABLE HDBan (
    MaHD int NOT NULL,
    MaNV nvarchar(20) NOT NULL,
    MaKH int NOT NULL,
    PhanTramGiam  float NOT NULL,
    NgayLapHD date NOT NULL,
    TrangThai nvarchar(100) NOT NULL,
    GiaGiam  float NOT NULL,
    ThanhTien  float NOT NULL,
    PRIMARY KEY (MaHD)
);
GO
CREATE TABLE ChiTietHoaDon (
    MaHDCT int NOT NULL,
    MaHD int NOT NULL,
    MaSP nvarchar(20) NOT NULL,
    SoLuong int NOT NULL,
    DonGia float NOT NULL,
    PRIMARY KEY (MaHDCT,MaHD,MaSP)
);
GO
CREATE TABLE LoaiSP (
    MaLoai nvarchar(20) NOT NULL,
    TenLoai nvarchar(255) NOT NULL,
    MoTa nvarchar(500) NULL,
    PRIMARY KEY (MaLoai)
);
GO
CREATE TABLE DonViTinh (
    MaDonVi nvarchar(20) NOT NULL,
    TenDonVi nvarchar(255) NOT NULL,
    MoTa nvarchar(500) NULL,
    PRIMARY KEY (MaDonVi)
);
GO
CREATE TABLE ChucVu (
    MaChucVu nvarchar(20) NOT NULL,
    TenChucVu nvarchar(255) NOT NULL,
    MoTa nvarchar(500) NULL,
    PRIMARY KEY (MaChucVu)
);
GO
CREATE TABLE TaiKhoan (
    SoDienThoai varchar(10) NOT NULL,
    Pass nvarchar(255) NOT NULL,
    PRIMARY KEY (SoDienThoai)
);
GO
CREATE TABLE KhachHang (
    MaKH int NOT NULL,
    TenKH nvarchar(255) NOT NULL,
    SoDT varchar(10) NOT NULL UNIQUE,
    PRIMARY KEY (MaKH)
);
GO
--TÀI KHOẢN CÓ 1 KHÓA NGOẠI LÀ SỐ ĐIỆN THOẠI LẤY TỪ BẢNG NHÂN VIÊN
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan] FOREIGN KEY([SoDienThoai])
REFERENCES [dbo].[NhanVien] ([SoDienThoai])--Bị ngược
GO
--NHÂN VIÊN CÓ 1 KHÓA NGOẠI LÀ MÃ CHỨC VỤ LẤY TỪ BẢNG CHỨC VỤ 
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_ChucVu_NhanVien] FOREIGN KEY([MaChucVu])
REFERENCES [dbo].[ChucVu] ([MaChucVu])--đúng
GO
--SẢN PHẨM CÓ 2 KHÓA NGOẠI:
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_LoaiSanPham_SanPham] FOREIGN KEY([Loai])
REFERENCES [dbo].[LoaiSP] ([MaLoai])--1. MÃ LOẠI LẤY TỪ BẢNG LOẠI SP
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_DonVi] FOREIGN KEY([DonViTinh])
REFERENCES [dbo].[DonViTinh] ([maDonVi])--2. MÃ ĐƠN VỊ LẤY TỪ BẢNG ĐƠN VỊ
GO
--BẢNG HÓA ĐƠN CÓ 2 KHÓA NGOẠI:
ALTER TABLE [dbo].[HDBan]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([MaNV])--1. MÃ NHÂN VIÊN LẤY TỪ BẢNG NHÂN VIÊN
GO
ALTER TABLE [dbo].[HDBan]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])--2. MÃ KHÁCH HÀNG LẤY TỪ BẢNG KHÁCH HÀNG
GO
--BẢNG HDCT CÓ 2 KHÓA NGOẠI:
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_chiTietHoaDon] FOREIGN KEY([maHD])
REFERENCES [dbo].[HDBan] ([maHD])--1. MÃ HD LẤY TỪ BẢNG HD
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_HoaDonChiTiet] FOREIGN KEY([maSP])
REFERENCES [dbo].[SanPham] ([maSP])--2. MÃ SP LẤY TỪ BẢNG SP
