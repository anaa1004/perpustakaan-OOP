import java.util.List;

class Buku {
    String judul;
    int tahunTerbit;
    String sinopsis;
    List<Penulis> penulis;



    Buku(String judul, int tahunTerbit, String sinopsis, List<Penulis> penulis) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.sinopsis = sinopsis;
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
        System.out.println("\nSinopsis: " + sinopsis);
    }

    int hitungJumlahKata() {
        String[] kata = sinopsis.trim().split("\\s+");
        return kata.length;
    }

    int cekKesamaan(Buku bukuLain) {

        int skor = 0;
        int total = 4;

        if (this.judul.equalsIgnoreCase(bukuLain.judul)) {
            skor++;
        }

        if (this.tahunTerbit == bukuLain.tahunTerbit) {
            skor++;
        }

        if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)) {
            skor++;
        }

        if (this.penulis.size() == bukuLain.penulis.size()) {
            skor++;
        }

        return (skor * 100) / total;
    }

    Buku copy() {
        return new Buku(
                this.judul,
                this.tahunTerbit,
                this.sinopsis,
                this.penulis
        );
    }
}
