package Tugas5;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String, Integer> makanan = new HashMap<>();
    Map<String, Integer> minuman = new HashMap<>();
    Map<String, Integer> isiPaket1 = new HashMap<>();
    Map<String, Integer> isiPaket2 = new HashMap<>();
    Map<String, Integer> isiPaket3 = new HashMap<>();
    Map<String, Map<String, Integer>> paket = new HashMap<>();
    int x = 0;
    int y = 0;

    public void setList() {
        makanan.put("Ayam Goreng", 12500);
        makanan.put("Ayam Bakar", 15000);
        makanan.put("Tempe Penyet", 6000);

        minuman.put("Es Teh", 2000);
        minuman.put("Es Jeruk", 2500);
        minuman.put("Jus Jambu", 5000);

        isiPaket1.put("Ayam Goreng + Es Teh", 14000);
        isiPaket2.put("Ayam Bakar + Es Jeruk", 17000);
        isiPaket3.put("Tempe Penyet + Jus Jambu", 10000);
        paket.put("Paket1", isiPaket1);
        paket.put("Paket2", isiPaket2);
        paket.put("Paket3", isiPaket3);

    }

    public void getMakanan() {
        x = 0;
        for (String element : makanan.keySet()) {
            x = x + 1;

            System.out.println("|   " + "MA" + x + "   |        " + element + "       | " + makanan.get(element));
        }
    }

    public void getMinuman() {
        y = 0;
        for (String element : minuman.keySet()) {
            y = y + 1;
            System.out.println("|   " + "MI" + y + "   |        " + element + "       |  " + minuman.get(element));
        }
    }

    public void getPaket() {
        for (String element : paket.keySet()) {
            System.out.println(element + " : " + paket.keySet());
        }
    }

    public void getPaket2() {
        for (Map.Entry<String, Map<String, Integer>> entry : paket.entrySet()) {
            String key = entry.getKey();
            Map<String, Integer> values = entry.getValue();
            System.out.println("| " + key + "  | " + values.keySet().toString() + "  |  " + values.values().toString());
        }
    }
}
