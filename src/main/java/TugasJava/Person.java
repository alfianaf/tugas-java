package TugasJava;

import java.util.Calendar;

public class Person {
    public String firstName;
    public String lastName;
    public String domisili;
    int c1;
    Calendar c2 = Calendar.getInstance();

    public void setTahun(int c1) {
        this.c1 = c1;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;

    }

    public String getNama() {
        String namaLengkap = firstName + ' ' + lastName;
        return namaLengkap;
    }

    public String getDomisili() {
        return domisili;
    }

    public int getTahun() {
        int age = c2.get(Calendar.YEAR) - c1;
        return age;
    }
}
