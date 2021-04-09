package Tugas4;

// WITHOUT CONSTRUCTOR
public class Person extends Sistem {
    private String fname;
    private String lname;
    private String domisili;
    private String nik;
    public static String VERSION = "1.0";

    // SETTER AND GETTER
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    // METHODS
    public String getFullname() {
        return getFname() + " " + getLname();
    }

    public void getVersion() {
        System.out.println(VERSION);
    }

    public static void testStaticMethod() {

    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public void studentRegistration(String fullName, String nik) {
        // TODO Auto-generated method stub
        System.out.println("Berhasil mendaftarkan " + fullName + " dengan nomor induk " + nik);
    }

    @Override
    public void learningPlan(String mataKuliah, String namaDosen, int sks, String ruangan) {
        // TODO Auto-generated method stub
        System.out.println("Berhasil mendaftarkan mata kuliah");

    }

}
