import java.util.List;

class Buku {
    String judul;
    int tahunTerbit;
    List<Penulis> penulis;



    Buku(String judul, int tahunTerbit, List<Penulis> penulis) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penulis = penulis;
    }

    void tampilkan() {
        System.out.print("Judul: " + judul +
                " | Tahun: " + tahunTerbit +
                " | Penulis: ");

        for (int i = 0; i < penulis.size(); i++) {
            penulis.get(i).tampilkan();
            if (i < penulis.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
