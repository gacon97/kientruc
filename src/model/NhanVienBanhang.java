package model;

public class NhanVienBanhang extends Nhanvien {

	private Donhang[] donHang;

	public Donhang[] getDonHang() {
		return this.donHang;
	}

	/**
	 * 
	 * @param donHang
	 */
	public void setDonHang(Donhang[] donHang) {
		this.donHang = donHang;
	}

	public void nhapDonHang() {
		// TODO - implement NhanVienBanhang.nhapDonHang
		throw new UnsupportedOperationException();
	}

}