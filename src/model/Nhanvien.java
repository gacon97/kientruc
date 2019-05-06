package model;

public class Nhanvien extends Nguoi {

	private int maNV;
	private String thamNien;

	public int getMaNV() {
		return this.maNV;
	}

	/**
	 * 
	 * @param maNV
	 */
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getThamNien() {
		return this.thamNien;
	}

	/**
	 * 
	 * @param thamNien
	 */
	public void setThamNien(String thamNien) {
		this.thamNien = thamNien;
	}

	public void dangNhap() {
		// TODO - implement Nhanvien.dangNhap
		throw new UnsupportedOperationException();
	}

	public void timKiem() {
		// TODO - implement Nhanvien.timKiem
		throw new UnsupportedOperationException();
	}

}