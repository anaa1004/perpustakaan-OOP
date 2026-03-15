import java.util.ArrayList;
import java.util.List;

public class Kategori {
    String nama;
    List<Buku> buku;

    Kategori(String nama) {
        this.nama = nama;
        buku = new ArrayList<>();
    }

    void addBuku(Buku newBuku) {
        buku.add(newBuku);
    }

    void tampilkan() {
        System.out.println("\nKategori: " + nama);
        for (Buku buku1 : buku) {
            buku1.tampilkan();
            System.out.println("Jumlah kata sinopsis: " + buku1.hitungJumlahKata());
            System.out.println();
        }
    }
}
