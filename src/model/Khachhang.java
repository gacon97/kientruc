package model;

public class Khachhang extends Nguoi {

	private int maKH;
	private Giohang gioHang;

	public int getMaKH() {
		return this.maKH;
	}

	/**
	 * 
	 * @param maKH
	 */
	public void setMaKH(int maKH) {
		this.maKH = maKH;
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

	public void getAttribute() {
		// TODO - implement Khachhang.getAttribute
		throw new UnsupportedOperationException();
	}

}