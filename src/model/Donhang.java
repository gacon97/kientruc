package model;

public class Donhang {

	private int id;
	private Giohang gioHang;
	private float tongTien;
	private NhanVienBanhang nhanVien;
	private Khachhang khachHang;
        private float phiVanChuyen;
        private float tienChietKhau;
        private float tienHang;

    public float getTienHang() {
        return tienHang;
    }

    public void setTienHang(float tienHang) {
        this.tienHang = tienHang;
    }

    public float getPhiVanChuyen() {
        return phiVanChuyen;
    }

    public void setPhiVanChuyen(float phiVanChuyen) {
        this.phiVanChuyen = phiVanChuyen;
    }

    public float getTienChietKhau() {
        return tienChietKhau;
    }

    public void setTienChietKhau(float tienChietKhau) {
        this.tienChietKhau = tienChietKhau;
    }

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
		return this.tienHang + this.phiVanChuyen - this.tienChietKhau;
	}

	/**
	 * 
	 * @param tongTien
	 */
	

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