package model;


import model.Diachi;

public class Nguoi {

	private Hoten hoTen;
	private Diachi diaChi;
	private String ngaySinh;
	private Taikhoan taiKhoan;

	public Hoten getHoTen() {
		return this.hoTen;
	}

	/**
	 * 
	 * @param hoTen
	 */
	public void setHoTen(Hoten hoTen) {
		this.hoTen = hoTen;
	}

	public Diachi getDiaChi() {
		return this.diaChi;
	}

	/**
	 * 
	 * @param diaChi
	 */
	public void setDiaChi(Diachi diaChi) {
		this.diaChi = diaChi;
	}

	public String getNgaySinh() {
		return this.ngaySinh;
	}

	/**
	 * 
	 * @param ngaySinh
	 */
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Taikhoan getTaiKhoan() {
		return this.taiKhoan;
	}

	/**
	 * 
	 * @param taiKhoan
	 */
	public void setTaiKhoan(Taikhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

}