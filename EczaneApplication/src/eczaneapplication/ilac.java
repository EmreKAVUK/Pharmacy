/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eczaneapplication;

/**
 *
 * @author Enes_sur
 */
public class ilac {
    
    
    
    private int Barcode;
    private String Medicine_Name;
    private int Protocol_no;
    private String Formula;
    private int Stock;
    
    
    public ilac(int Barcode, String Medicine_Name, int Protocol_no, String Formula, int Stock) {
        this.Barcode = Barcode;
        this.Medicine_Name = Medicine_Name;
        this.Protocol_no = Protocol_no;
        this.Formula = Formula;
        this.Stock = Stock;
    }
    public int getBarcode() {
        return Barcode;
    }

    public void setBarcode(int Barcode) {
        this.Barcode = Barcode;
    }

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public int getProtocol_no() {
        return Protocol_no;
    }

    public void setProtocol_no(int Protocol_no) {
        this.Protocol_no = Protocol_no;
    }

    public String getFormula() {
        return Formula;
    }

    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
 
    
   
    
    
    
    
    
    
    
}
