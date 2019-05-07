/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachvstimkiemsach;

import java.util.ArrayList;

/**
 *
 * @author ducanh
 */
public class TimSach implements commandtimsach{
String name;

    public TimSach(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Sach> execute() {
        SachDao sachdao=new SachDao();
       return sachdao.TimSach(name);
    }
    
}
