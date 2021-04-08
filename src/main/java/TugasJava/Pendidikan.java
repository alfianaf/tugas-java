package TugasJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pendidikan {

    public String sd;
    public String smp;
    public String sma;
    public String kuliah;

    ArrayList<String> jenjang = new ArrayList<String>();

    public ArrayList getJenjang() {
        jenjang.add(getSd());
        jenjang.add(getSmp());
        jenjang.add(getSma());
        jenjang.add(getKuliah());
        return jenjang;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getSmp() {
        return smp;
    }

    public void setSmp(String smp) {
        this.smp = smp;
    }

    public String getSma() {
        return sma;
    }

    public void setSma(String sma) {
        this.sma = sma;
    }

    public String getKuliah() {
        return kuliah;
    }

    public void setKuliah(String kuliah) {
        this.kuliah = kuliah;
    }

}
