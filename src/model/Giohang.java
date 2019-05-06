package model;

import java.util.ArrayList;
import java.util.List;

public class Giohang {

	private ArrayList<Sach> listSach;
	private int soLuong;

    public Giohang(List<Sach> listSach, int soLuong) {
        this.listSach = new ArrayList<Sach>();
        this.soLuong = 0;
    }

    public List<Sach> getListSach() {
        return listSach;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
    public String addSach(Sach sach) {
        try{
            this.listSach.add(sach);
            this.soLuong += 1;
            return "Success";
        } catch(Exception ex) {
            return "fail";
        }
    }

  
}