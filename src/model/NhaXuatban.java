package model;

public class NhaXuatban {

	private int maNXB;
	private String tenNXB;
	private Diachi diaChi;

	public int getMaNXB() {
		return this.maNXB;
	}

	/**
	 * 
	 * @param maNXB
	 */
	public void setMaNXB(int maNXB) {
		this.maNXB = maNXB;
	}

	public String getTenNXB() {
		return this.tenNXB;
	}

	/**
	 * 
	 * @param tenNXB
	 */
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
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

}