package Tugas2;

public class Persegi {
    double sisi;

    public double luas(double sisi) {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    public double keliling(double sisi) {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

}
