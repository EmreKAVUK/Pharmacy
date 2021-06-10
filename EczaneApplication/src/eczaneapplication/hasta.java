
package eczaneapplication;



public class hasta {
    private int Patient_SSN;
    private String Patient_Name;
    private String Patient_Surname;
    private String Patient_Address;
    private int Telephone_number;
    private String Birth_day;

    public hasta(int Patient_SSN, String Patient_Name, String Patient_Surname, String Patient_Address, int Telephone_number, String Birth_day) {
        this.Patient_SSN = Patient_SSN;
        this.Patient_Name = Patient_Name;
        this.Patient_Surname = Patient_Surname;
        this.Patient_Address = Patient_Address;
        this.Telephone_number = Telephone_number;
        this.Birth_day = Birth_day;
    }



    public int getPatient_SSN() {
        return Patient_SSN;
    }


    public void setPatient_SSN(int Patient_SSN) {
        this.Patient_SSN = Patient_SSN;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    /**
     * @param Patient_Name the Patient_Name to set
     */
    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }


    public String getPatient_Surname() {
        return Patient_Surname;
    }

    public void setPatient_Surname(String Patient_Surname) {
        this.Patient_Surname = Patient_Surname;
    }

    public String getPatient_Address() {
        return Patient_Address;
    }

    public void setPatient_Address(String Patient_Address) {
        this.Patient_Address = Patient_Address;
    }

    public int getTelephone_number() {
        return Telephone_number;
    }


    public void setTelephone_number(int Telephone_number) {
        this.Telephone_number = Telephone_number;
    }

    public String getBirth_day() {
        return Birth_day;
    }

    public void setBirth_day(String Birth_day) {
        this.Birth_day = Birth_day;
    }
}
