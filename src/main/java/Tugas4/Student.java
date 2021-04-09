package Tugas4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    private int sks;
    private int x = 0;

    List<String> listDosen = new ArrayList<>();
    List<Integer> listSks = new ArrayList<>();
    List<String> listMataKuliah = new ArrayList<>();
    List<String> listRuangan = new ArrayList<>();
    // Map<Integer, String> listRuangan = new HashMap<>();
    // Map<String, Integer> listMataKuliah2 = new HashMap<String, Integer>();
    // Map<String, Map<Integer, String>> listMahasiswa = new HashMap<String,
    // Map<Integer, String>>();
    // Map<Integer, String> listMahasiswa = new HashMap<>();

    private String lecture;
    private String ruangan;

    @Override
    public String getFullname() {
        Integer sum = listSks.stream().reduce(0, Integer::sum);
        this.sks = sum;
        if (this.sks >= 144) {
            return "Prof " + super.getFullname();
        } else {
            return super.getFullname();
        }
    }

    @Override
    public void learningPlan(String mataKuliah, String namaDosen, int sks, String ruangan) {
        // TODO Auto-generated method stub
        super.learningPlan(mataKuliah, namaDosen, sks, ruangan);
        listMataKuliah.add(mataKuliah);
        listDosen.add(namaDosen);
        listSks.add(sks);
        listRuangan.add(ruangan);

    }

    @Override
    public void studentRegistration(String fullName, String nik) {
        // TODO Auto-generated method stub
        super.studentRegistration(fullName, nik);
    }

    public int getSks() {

        return this.sks;
    }

    public void getMahasiswa() {
        x = 0;
        System.out.println("| No. |   Mata Kuliah   | SKS | Nama Dosen | Ruang Kelas |");
        for (String element : listMataKuliah) {

            x = x + 1;
            System.out.println("| " + x + ".  |  " + element + "  |  " + listSks.get(x - 1) + "  |  "
                    + listDosen.get(x - 1) + "  |  " + listRuangan.get(x - 1) + "  |  ");
            // System.out.println(listMahasiswa.get(element));
        }

    }

    public void getDosen() {

        for (String element : listDosen) {
            System.out.println(element);
        }

    }
    // METHODS

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

}
