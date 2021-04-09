package Tugas4;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    Person person = new Person();
    Student student = new Student();

    public void MenuAwal() {
        System.out.println("Program Sistem Informasi Akademik Sederhana");
        System.out.println("Masukkan Nama Depan");
        student.setFname(input.nextLine());
        System.out.println("Masukkan Nama Belakang");
        student.setLname(input.nextLine());
        System.out.println("Masukkan NIK");
        student.setNik(input.nextLine());
        student.studentRegistration(student.getFullname(), student.getNik());

    }

    public void MenuPilih() {
        int menu;

        for (String ulangi = "y"; ulangi.equalsIgnoreCase("y");) {
            System.out.print(
                    "Pilihan : \n 1. Menambahkan mata kuliah \n 2. Menampilkan data mahasiswa \n \n Masukkan pilihan : ");
            menu = input.nextInt();
            System.out.println();
            input.nextLine();
            System.out.println();

            switch (menu) {
            case 1:
                System.out.println("Masukkan nama mata kuliah");
                String mataKuliah = input.nextLine();

                System.out.println("Masukkan nama dosen pengampu");
                String namaDosen = input.nextLine();

                System.out.println("Masukkan jumlah sks mata kuliah");
                Integer sks = input.nextInt();
                input.nextLine();

                System.out.println("Masukkan ruangan kelas mata kuliah");
                String ruangan = input.nextLine();
                student.learningPlan(mataKuliah, namaDosen, sks, ruangan);
                // student.learningPlan("Tugas Akhir", "Agung Prasetyo", 4, "D304");
                break;
            case 2:

                System.out.println("Berikut informasi mengenai mahasiswa terkait : ");

                System.out.println("Nama : " + student.getFullname());
                System.out.println("SKS : " + student.getSks());

                student.getMahasiswa();
                break;
            }
            System.out.println("\nApakah anda ingin mengulangi? (Y / N)");

            ulangi = input.nextLine();

        }
        input.close();

    }

    public void MenuUtama() {

    }

    public static void main(String[] args) {
        App menu = new App();
        menu.MenuAwal();
        menu.MenuPilih();
        menu.MenuUtama();

        // person.learningPlan(student.getMataKuliah(), sks, ruangan);
    }
}
