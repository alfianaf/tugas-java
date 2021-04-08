package Tugas3;

public interface BangunDatarInterface {
    // method abstract -- tanpa body
    public void welcomeMessage(String programName);

    // default method -- dengan body -- opsional diturunkan
    default void closingMessage(String username, int year) {
        System.out.println("Copyright " + username + " ");
        showYear(year);
    }

    // static method -- dengan body -- tidak bisa diturunkan
    static void showYear(int year) {
        System.out.print(year);
    }
}
