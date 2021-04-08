package Tugas2;

public class Segitiga {
    double alas;
    double tinggi;
    public double luas;

    public double luas() {
        luas = (this.alas * this.tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    public double keliling(double alas, double tinggi) {
        double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        double keliling = alas + tinggi + miring;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
