package model;

public class Sach {

	private int maSach;
	private String tenSach;
	private String tacGia;
	private Theloai theLoai;
	private NhaXuatban nhaXuatBan;

	public int getMaSach() {
		return this.maSach;
	}

	/**
	 * 
	 * @param maSach
	 */
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return this.tenSach;
	}

	/**
	 * 
	 * @param tenSach
	 */
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTacGia() {
		return this.tacGia;
	}

	/**
	 * 
	 * @param tacGia
	 */
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public Theloai getTheLoai() {
		return this.theLoai;
	}

	/**
	 * 
	 * @param theLoai
	 */
	public void setTheLoai(Theloai theLoai) {
		this.theLoai = theLoai;
	}

	public NhaXuatban getNhaXuatBan() {
		return this.nhaXuatBan;
	}

	/**
	 * 
	 * @param nhaXuatBan
	 */
	public void setNhaXuatBan(NhaXuatban nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

}