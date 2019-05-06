package model;


import model.NhanVienBanhang;

public class Donhang {

	private int id;
	private Giohang gioHang;
	private float tongTien;
	private NhanVienBanhang nhanVien;
	private Khachhang khachHang;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public Giohang getGioHang() {
		return this.gioHang;
	}

	/**
	 * 
	 * @param gioHang
	 */
	public void setGioHang(Giohang gioHang) {
		this.gioHang = gioHang;
	}

	public float getTongTien() {
		return this.tongTien;
	}

	/**
	 * 
	 * @param tongTien
	 */
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public NhanVienBanhang getNhanVien() {
		return this.nhanVien;
	}

	/**
	 * 
	 * @param nhanVien
	 */
	public void setNhanVien(NhanVienBanhang nhanVien) {
		this.nhanVien = nhanVien;
	}

	public Khachhang getKhachHang() {
		return this.khachHang;
	}

	/**
	 * 
	 * @param khachHang
	 */
	public void setKhachHang(Khachhang khachHang) {
		this.khachHang = khachHang;
	}

}