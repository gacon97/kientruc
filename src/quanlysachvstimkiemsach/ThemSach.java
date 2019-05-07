/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachvstimkiemsach;

/**
 *
 * @author ducanh
 */
public class ThemSach implements Command{

   private Sach sach;

    public ThemSach(Sach sach) {
        this.sach = sach;
    }

   
    @Override
    public void execute() {
        sach.themSach(sach);
    }
    
}
