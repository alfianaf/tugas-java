package TugasJava;

import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        Pendidikan jenjangPrint = new Pendidikan();
        Person personPrint = new Person();
        System.out.print("Program Input Biodata \n");
        System.out.print("Masukkan Data Diri Anda \n");
        System.out.print("Nama Depan : \n");
        String firstnameInput = in.nextLine();

        System.out.print("Nama Belakang : \n");
        String lastnameInput = in.nextLine();

        System.out.print("Domisili : \n");
        String domisiliInput = in.nextLine();

        System.out.print("Tahun Lahir : \n");
        int tahunInput = in.nextInt();

        in.nextLine();
        personPrint.setFirstName(firstnameInput);
        personPrint.setLastName(lastnameInput);
        personPrint.setDomisili(domisiliInput);
        personPrint.setTahun(tahunInput);

        System.out.print("Masukkan Jenjang Pendidikan Anda \n");
        System.out.print("Sekolah Dasar : \n");
        String sdInput = in.nextLine();

        System.out.print("Sekolah Menengah Pertama : \n");
        String smpInput = in.nextLine();

        System.out.print("Sekolah Menengah Atas : \n");
        String smaInput = in.nextLine();

        System.out.print("Perguruan Tinggi : \n");
        String kuliahInput = in.nextLine();
        jenjangPrint.setSd(sdInput);
        jenjangPrint.setSmp(smpInput);
        jenjangPrint.setSma(smaInput);
        jenjangPrint.setKuliah(kuliahInput);
        int menu;

        System.out.print("Tampilkan Biodata \n");

        for (String ulangi = "y"; ulangi.equalsIgnoreCase("y");) {
            System.out.print("Pilihan : \n 1. Person \n 2. Pendidikan \n \n Masukan pilihan : ");
            menu = in.nextInt();
            switch (menu) {
            case 1:
                System.out.println("\nUser terkait memiliki informasi detail sebagai berikut : ");
                System.out.println("\nNama Lengkap : ");
                System.out.println(personPrint.getNama());
                System.out.println("\nDomisili : ");
                System.out.println(personPrint.getDomisili());
                System.out.println("\nUmur : ");
                System.out.println(personPrint.getTahun());
                break;
            case 2:

                System.out.println("\nUser terkait memiliki riwayat pendidikan sebagai berikut : ");

                System.out.println("SD : " + jenjangPrint.getJenjang().get(0));
                System.out.println("SMP : " + jenjangPrint.getJenjang().get(1));
                System.out.println("SMA : " + jenjangPrint.getJenjang().get(2));
                System.out.println("Perguruan Tinggi : " + jenjangPrint.getJenjang().get(3));
                break;
            }
            System.out.println("\nApakah anda ingin mengulangi? (Y / N)");

            ulangi = in.next();

        }
        in.close();
    }

}
