package Tugas2;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 * Hello world!
 */
public final class App {
    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Program Menghitung Luas dan Volume \n");

        Persegi persegi = new Persegi();
        Kubus kubus = new Kubus();

        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();

        Segitiga segitiga = new Segitiga();
        Prisma prisma = new Prisma();
        prisma.setAlas(6);
        prisma.setTinggi(10);
        // segitiga.setAlas(6);
        // segitiga.setTinggi(10);

        segitiga.luas();
        segitiga.keliling(5, 10);
        prisma.volPrisma(10);

        persegi.luas(5);
        persegi.keliling(5);
        kubus.volKubus(5);

        lingkaran.luas(10);
        lingkaran.keliling(10);
        bola.volBola(10, 5);
        System.out.println(segitiga.getAlas());
    }
}
