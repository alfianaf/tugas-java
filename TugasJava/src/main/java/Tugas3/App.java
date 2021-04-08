package Tugas3;

public final class App implements BangunDatarInterface {

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {
        App app = new App();
        app.welcomeMessage("Bangun Datar\n");
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        lingkaran.menggambar("Lingkaran");
        lingkaran.karakteristik(4, "jari-jari\n");
        segitiga.menggambar("Segitiga");
        segitiga.karakteristik(3, "alas dan tinggi\n");
        persegi.menggambar("Persegi");
        persegi.karakteristik(4, "sisi yang sama panjang\n");
        app.closingMessage("Alfian", 2021);
    }

    @Override
    public void welcomeMessage(String programName) {
        System.out.println("Selamat datang di program " + programName);

    }

    @Override
    public void closingMessage(String username, int year) {
        // TODO Auto-generated method stub
        BangunDatarInterface.super.closingMessage(username, year);
    }

}
