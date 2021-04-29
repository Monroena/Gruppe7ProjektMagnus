package org.example;

public class Maalinger {

    String id, temp, puls, spo2, CPR;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPuls() {
        return puls;
    }

    public void setPuls(String puls) {
        this.puls = puls;
    }

    public String getSpo2() {
        return spo2;
    }

    public void setSpo2(String spo2) {
        this.spo2 = spo2;
    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    public Maalinger(String id, String temp, String puls, String spo2, String CPR) {
        this.id = id;
        this.temp = temp;
        this.puls = puls;
        this.spo2 = spo2;
        this.CPR = CPR;
    }
}
