package Tugas2;

public class Kubus extends Persegi {
    public double volKubus(double s) {
        double volKubus;
        volKubus = luas(s) * s;
        System.out.println("Volume Kubus: " + volKubus + "\n");

        return volKubus;
    }
}
