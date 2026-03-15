import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    String  nama;
    List<Kategori> kategori;

    Perpustakaan(String nama) {
        this.nama = nama;
        kategori = new ArrayList<>();
    }

    void addKategori(Kategori newKategori){
        kategori.add(newKategori);
    }

    void tampilkan() {
        System.out.println("Perpustakaan: " + nama);
        for (Kategori kategori1 : kategori) {
            kategori1.tampilkan();
        }
    }
}
