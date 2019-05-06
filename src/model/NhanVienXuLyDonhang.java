package model;


import model.Nhanvien;

public class NhanVienXuLyDonhang extends Nhanvien {

	private Donhang donHang;

	public void xuLyDonHang() {
		// TODO - implement NhanVienXuLyDonhang.xuLyDonHang
		throw new UnsupportedOperationException();
	}

	public Donhang getDonHang() {
		return this.donHang;
	}

	/**
	 * 
	 * @param donHang
	 */
	public void setDonHang(Donhang donHang) {
		this.donHang = donHang;
	}

}