package Tugas5;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    Menu daftarMenu = new Menu();
    Pesanan listPesanan = new Pesanan();
    String pesanan;

    public void pesanAdd() {

    }

    public void MenuPilih() {
        int menu;
        daftarMenu.setList();

        for (String ulangi = "y"; ulangi.equalsIgnoreCase("y");) {
            System.out.print(
                    "\nPilihan : \n 1. Daftar Menu \n 2. Daftar Pesanan \n 3. Hapus Pesanan \n 4. Pembayaran \n 5. Exit \n \n Masukkan pilihan : ");

            menu = input.nextInt();
            System.out.println();
            input.nextLine();
            System.out.println();
            switch (menu) {
            case 1:
                for (String ulangiMenu = "y"; ulangiMenu.equalsIgnoreCase("y");) {

                    System.out.println("Daftar Menu : ");
                    System.out.println("|  Kode   |           Menu           |  Harga  |");
                    daftarMenu.getPaket2();
                    daftarMenu.getMakanan();
                    daftarMenu.getMinuman();

                    System.out.println();
                    System.out
                            .println("Silahkan pilih paket yang diinginkan (Tekan 'n' jika ingin mengakhiri pesanan):");
                    // pesanan = input.nextLine();
                    listPesanan.setPesanan(input.nextLine());
                    if (listPesanan.getPesanan().equalsIgnoreCase("n")) {
                        break;
                    }
                    listPesanan.setNilaiPesanan();
                    System.out.println();
                    System.out.println("Ingin menambahkan menu lagi? (Y / N)");

                    ulangiMenu = input.nextLine();

                }

                break;
            case 2:

                listPesanan.getNilaiPesanan();

                break;
            case 3:
                input.nextLine();
                listPesanan.getNilaiPesanan();
                System.out.println();
                System.out.println("Pilih pesanan yang ingin anda hapus");
                listPesanan.setPesanan(input.nextLine());
                listPesanan.hapusPesanan();

                break;
            case 4:
                listPesanan.getTagihan();

                break;
            case 5:
                ulangi = "n";
                break;
            }
            // System.out.println("\nApakah anda ingin mengulangi? (Y / N)");

            // ulangi = input.nextLine();

        }
        input.close();
    }

    public void MenuUtama() {
        System.out.println("Selamat datang di program pemesanan makanan\n");
        System.out.println("Silahkan memilih menu yang tersedia");

    }

    public static void main(String[] args) {
        App menu = new App();
        menu.MenuUtama();
        menu.MenuPilih();
    }
}
