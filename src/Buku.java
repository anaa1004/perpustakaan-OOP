import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<Penulis> copyPenulis = new ArrayList<>();

        for (Penulis p : this.penulis) {
            copyPenulis.add(new Penulis(p.nama));
        }

        return new Buku(
                this.judul,
                this.tahunTerbit,
                this.sinopsis,
                copyPenulis
        );
    }

    void bacaFile(String pathFile) {
        try {
            File file = new File(pathFile);
            Scanner scan = new Scanner(file);

            if (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(";");

                if (data.length >= 4) {
                    this.judul = data[0].trim();
                    this.tahunTerbit = Integer.parseInt(data[1].trim());
                    this.sinopsis = data[2].trim();
                    this.penulis = new ArrayList<>();
                    String[] daftarPenulis = data[3].split(",");
                    for (String p : daftarPenulis) {
                        if (!p.trim().isEmpty()) {
                            this.penulis.add(new Penulis(p.trim()));
                        }
                    }
                } else {
                    System.out.println("Format file salah! Harus: judul;penulis");
                    this.penulis = new ArrayList<>();
                }
            } else {
                System.out.println("File kosong!");
                this.penulis = new ArrayList<>();
            }

            scan.close();

        } catch (Exception e) {
            System.out.println("Error membaca file: " + e.getMessage());
            this.penulis = new ArrayList<>();
        }
    }

    void simpanFile(String namaFile) {
        try {
            FileWriter writer = new FileWriter(namaFile);

            StringBuilder semuaPenulis = new StringBuilder();

            for (int i = 0; i < penulis.size(); i++) {
                semuaPenulis.append(penulis.get(i).nama);
                if (i < penulis.size() - 1) {
                    semuaPenulis.append(",");
                }
            }

            writer.write(
                    judul + ";" +
                            tahunTerbit + ";" +
                            sinopsis + ";" +
                            semuaPenulis.toString()
            );

            writer.close();
        } catch (IOException e) {
            System.out.println("Error menyimpan file: " + e.getMessage());
        }
    }

    double hitungRoyalti(double hargaBuku) {
        return hargaBuku * 0.10;
    }

    double hitungRoyalti(double hargaBuku, double persen) {
        return hargaBuku * (persen / 100);
    }
}
