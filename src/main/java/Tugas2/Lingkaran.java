package Tugas2;

public class Lingkaran {
    double r;

    public double luas(double r) {
        double luas = (double) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }

    public double keliling(double r) {
        double keliling = (double) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
