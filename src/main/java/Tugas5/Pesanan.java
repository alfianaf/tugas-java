package Tugas5;

import java.util.ArrayList;
import java.util.List;

public class Pesanan extends Sistem {
    List<Integer> hargaPesanan = new ArrayList<>();
    List<String> listPesanan = new ArrayList<>();
    private Double sum;
    private Double total;
    private String pesanan;

    public void setTotalPesanan() {
        listPesanan.add("Paket 1");
        hargaPesanan.add(14000);

    }

    @Override
    public void setNilaiPesanan() {
        System.out.println();
        if (getPesanan().equals("Paket1")) {
            System.out.println("Menambahkan Paket 1");
            listPesanan.add("Paket 1");
            hargaPesanan.add(14000);
        }
        if (getPesanan().equals("Paket2")) {
            System.out.println("Menambahkan Paket 2");
            listPesanan.add("Paket 2");
            hargaPesanan.add(17000);
        }
        if (getPesanan().equals("Paket3")) {
            System.out.println("Menambahkan Paket 3");
            listPesanan.add("Paket 3");
            hargaPesanan.add(10000);
        }
        if (getPesanan().equals("MA1")) {
            System.out.println("Menambahkan Tempe Penyet");
            listPesanan.add("Tempe Penyet");
            hargaPesanan.add(6000);
        }
        if (getPesanan().equals("MA2")) {
            System.out.println("Menambahkan Ayam Bakar");
            listPesanan.add("Ayam Bakar");
            hargaPesanan.add(15000);
        }
        if (getPesanan().equals("MA3")) {
            System.out.println("Menambahkan Ayam Goreng");
            listPesanan.add("Ayam Goreng");
            hargaPesanan.add(12500);
        }
        if (getPesanan().equals("MI1")) {
            System.out.println("Menambahkan Es Jeruk");
            listPesanan.add("Es Jeruk");
            hargaPesanan.add(2500);
        }
        if (getPesanan().equals("MI2")) {
            System.out.println("Menambahkan Es Teh");
            listPesanan.add("Es Teh");
            hargaPesanan.add(2000);
        }
        if (getPesanan().equals("MI3")) {
            System.out.println("Menambahkan Jus Jambu");
            listPesanan.add("Jus Jambu");
            hargaPesanan.add(5000);
        }
        if (getPesanan().equalsIgnoreCase("n")) {
            System.out.println("Anda membatalkan pesanan!");

        }
    }

    @Override
    public void hapusPesanan() {
        System.out.println();

        if (getPesanan().equals("Paket1")) {
            System.out.println("Menghapus Pesanan Paket 1");
            listPesanan.remove("Paket 1");
            hargaPesanan.remove(Integer.valueOf(14000));
        }
        if (getPesanan().equals("Paket2")) {
            System.out.println("Menghapus Pesanan Paket 2");
            listPesanan.remove("Paket 2");
            hargaPesanan.remove(Integer.valueOf(17000));
        }
        if (getPesanan().equals("Paket3")) {
            System.out.println("Menghapus Pesanan Paket 3");
            listPesanan.remove("Paket 3");
            hargaPesanan.remove(Integer.valueOf(10000));
        }
        if (getPesanan().equals("MA1")) {
            System.out.println("Menghapus Pesanan Tempe Penyet");
            listPesanan.remove("Tempe Penyet");
            hargaPesanan.remove(Integer.valueOf(6000));
        }
        if (getPesanan().equals("MA2")) {
            System.out.println("Menghapus Pesanan Ayam Bakar");
            listPesanan.remove("Ayam Bakar");
            hargaPesanan.remove(Integer.valueOf(15000));
        }
        if (getPesanan().equals("MA3")) {
            System.out.println("Menghapus Pesanan Ayam Goreng");
            listPesanan.remove("Ayam Goreng");
            hargaPesanan.remove(Integer.valueOf(12500));
        }
        if (getPesanan().equals("MI1")) {
            System.out.println("Menghapus Pesanan Es Jeruk");
            listPesanan.remove("Es Jeruk");
            hargaPesanan.remove(Integer.valueOf(2500));
        }
        if (getPesanan().equals("MI2")) {
            System.out.println("Menghapus Pesanan Es Teh");
            listPesanan.remove("Es Teh");
            hargaPesanan.remove(Integer.valueOf(2000));
        }
        if (getPesanan().equals("MI3")) {
            System.out.println("Menghapus Pesanan Jus Jambu");
            listPesanan.remove("Jus Jambu");
            hargaPesanan.remove(Integer.valueOf(5000));
        }

    }

    @Override
    public void getNilaiPesanan() {

        System.out.println("Berikut adalah pesanan yang sudah anda pilih :");
        System.out.println("|           Menu           |  Harga  |");
        for (int i = 0; i < listPesanan.size(); i++) {
            System.out.println("|         " + listPesanan.get(i) + "        |  " + hargaPesanan.get(i));
        }
        System.out.println();

        System.out.println("Total Tagihan : Rp. " + getTotal());
    }

    @Override
    public void getTagihan() {
        System.out.println(
                "Silahkan membayarkan tagihan pesanan anda sejumlah Rp. " + getTotal() + " ke kasir, Terima kasih");

    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public String getPesanan() {
        return pesanan;
    }

    public Double getSum() {
        this.setSum();
        return sum;
    }

    public void setSum() {
        Double sum = hargaPesanan.stream().mapToDouble(d -> d).sum();

        this.sum = sum;
    }

    public Double getTotal() {
        this.setTotal();
        return total;
    }

    public void setTotal() {
        Double total = 1.1 * getSum();

        this.total = total;
    }
}
