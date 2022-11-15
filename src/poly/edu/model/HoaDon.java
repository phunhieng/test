/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDon {
private String idHoaDon;
private String idKhachHang;
private String idNhanVien;
private String maHoaDon;
private Date ngayTao;
private Date ngayThanhToan;
private Date ngayShip;
private Date ngayNhan;
private int tinhTrang;
private String tenNguoiNhan;
private String diaChi;
private String sdt;

    public HoaDon() {
    }

    public HoaDon(String idHoaDon, String idKhachHang, String idNhanVien, String maHoaDon, Date ngayTao, Date ngayThanhToan, Date ngayShip, Date ngayNhan, int tinhTrang, String tenNguoiNhan, String diaChi, String sdt) {
        this.idHoaDon = idHoaDon;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }


}
