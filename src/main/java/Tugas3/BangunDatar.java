package Tugas3;

public abstract class BangunDatar {
    // modifier : public
    public abstract void menggambar(String nama);

    // modifier : default
    void karakteristik(int sisi, String sifat) {
        System.out.println("Bangun datar ini memiliki " + sisi + " sisi");
        System.out.println("Karakteristik bangun datar ini memiliki " + sifat);
    }

}
