package Tugas2;

public class Prisma extends Segitiga {

    public double volPrisma(double tinggi2) {
        double volPrisma;
        volPrisma = super.luas() * tinggi2;
        System.out.println("Volume Prisma: " + volPrisma + "\n");
        System.out.println(super.luas());
        return volPrisma;
    }
}
