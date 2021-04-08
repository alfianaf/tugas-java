package Tugas2;

public class Bola extends Lingkaran {
    public double volBola(double r, double t) {
        double volBola;
        volBola = 4 / 3 * Math.PI * r * r * r;
        System.out.println("Volume Bola: " + volBola + "\n");

        return volBola;
    }
}
