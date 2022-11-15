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
public class GioHang {
private String idGioHang;
private String idKhachHang;
private String idNhanVien;
private String maGioHang;
private Date ngayTao;
private Date ngayThanhToan;
private int tinhTrang;
private String tenNguoiNhan;
private String diaChi;
private String sdt;

    public GioHang() {
    }

    public GioHang(String idGioHang, String idKhachHang, String idNhanVien, String maGioHang, Date ngayTao, Date ngayThanhToan, int tinhTrang, String tenNguoiNhan, String diaChi, String sdt) {
        this.idGioHang = idGioHang;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.maGioHang = maGioHang;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }


}
