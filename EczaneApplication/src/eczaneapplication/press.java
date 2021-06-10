
package eczaneapplication;

public class press {
    private int Hasta_SSN;
    private String Serial_number;
    private int Doktor_SSN;
    private String Date;
    private int Protocol_no;
    private int Medicine_quantity;

    public press(int Hasta_SSN, String Serial_number, int Doktor_SSN, String Date, int Protocol_no, int Medicine_quantity) {
        this.Hasta_SSN = Hasta_SSN;
        this.Serial_number = Serial_number;
        this.Doktor_SSN = Doktor_SSN;
        this.Date = Date;
        this.Protocol_no = Protocol_no;
        this.Medicine_quantity = Medicine_quantity;
    }

    public int getHasta_SSN() {
        return Hasta_SSN;
    }

    public void setHasta_SSN(int Hasta_SSN) {
        this.Hasta_SSN = Hasta_SSN;
    }

    public String getSerial_number() {
        return Serial_number;
    }

    public void setSerial_number(String Serial_number) {
        this.Serial_number = Serial_number;
    }

    public int getDoktor_SSN() {
        return Doktor_SSN;
    }

    public void setDoktor_SSN(int Doktor_SSN) {
        this.Doktor_SSN = Doktor_SSN;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getProtocol_no() {
        return Protocol_no;
    }

    public void setProtocol_no(int Protocol_no) {
        this.Protocol_no = Protocol_no;
    }

    public int getMedicine_quantity() {
        return Medicine_quantity;
    }

    public void setMedicine_quantity(int Medicine_quantity) {
        this.Medicine_quantity = Medicine_quantity;
    }
}
