import java.util.List;

public class Main {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kampus X");

        // ================= TEKNOLOGI =================
        Kategori teknologi = new Kategori("Teknologi");

        teknologi.addBuku(new Buku(
                "Algoritma Dasar",
                2019,
                List.of(new Penulis("William Stallings"))
        ));

        teknologi.addBuku(new Buku(
                "Pemrograman Java",
                2020,
                List.of(new Penulis("Daniel Y."),
                        new Penulis("Peter William"))
        ));

        teknologi.addBuku(new Buku(
                "Teknologi Jaringan",
                1999,
                List.of(new Penulis("Chandra L."),
                        new Penulis("David Y."))
        ));

        perpus.addKategori(teknologi);


        // ================= FILSAFAT =================
        Kategori filsafat = new Kategori("Filsafat");

        filsafat.addBuku(new Buku(
                "Pengantar Filsafat",
                2018,
                List.of(new Penulis("Plato"))
        ));

        filsafat.addBuku(new Buku(
                "Etika Hidup",
                2020,
                List.of(new Penulis("Siti Kusmini"))
        ));

        filsafat.addBuku(new Buku(
                "Pemikiran Kiri Kanan",
                2017,
                List.of(new Penulis("Mawar Melati"))
        ));

        perpus.addKategori(filsafat);


        // ================= SEJARAH =================
        Kategori sejarah = new Kategori("Sejarah");

        sejarah.addBuku(new Buku(
                "Sejarah Dunia",
                2011,
                List.of(new Penulis("Noah Harari"))
        ));

        sejarah.addBuku(new Buku(
                "The History of the Ancient World",
                2007,
                List.of(new Penulis("Susan Wise Bauer"))
        ));

        sejarah.addBuku(new Buku(
                "Sejarah Teknologi",
                2015,
                List.of(new Penulis("Dewi Anata"))
        ));

        perpus.addKategori(sejarah);

        // ================= AGAMA =================
        Kategori agama = new Kategori("Agama");

        agama.addBuku(new Buku(
                "Pemikiran Orang Beragama",
                2020,
                List.of(new Penulis("Abdul Saihul"))
        ));

        agama.addBuku(new Buku(
                "Teologi Modern",
                2002,
                List.of(new Penulis("Rick Warren"))
        ));

        agama.addBuku(new Buku(
                "Spiritualitas",
                2012,
                List.of(new Penulis("Ainun Najib"))
        ));

        perpus.addKategori(agama);


        // ================= PSIKOLOGI =================
        Kategori psikologi = new Kategori("Psikologi");

        psikologi.addBuku(new Buku(
                "Thinking, Fast and Slow",
                2011,
                List.of(new Penulis("Daniel Kahneman"))
        ));

        psikologi.addBuku(new Buku(
                "Man's Search for Meaning",
                1946,
                List.of(new Penulis("Viktor E. Frankl"))
        ));

        psikologi.addBuku(new Buku(
                "Emotional Intelligence",
                1995,
                List.of(new Penulis("Daniel Goleman"))
        ));

        perpus.addKategori(psikologi);


        // ================= POLITIK =================
        Kategori politik = new Kategori("Politik");

        politik.addBuku(new Buku(
                "The Prince",
                1532,
                List.of(new Penulis("Niccolo Machiavelli"))
        ));

        politik.addBuku(new Buku(
                "The Art of War",
                -500,
                List.of(new Penulis("Sun Tzu"))
        ));

        politik.addBuku(new Buku(
                "On Politics",
                2013,
                List.of(new Penulis("Alan Ryan"))
        ));

        perpus.addKategori(politik);


        // ================= FIKSI =================
        Kategori fiksi = new Kategori("Fiksi");

        fiksi.addBuku(new Buku(
                "Laut Melaut",
                2018,
                List.of(new Penulis("Leila S."))
        ));

        fiksi.addBuku(new Buku(
                "Legenda Dugong",
                2013,
                List.of(new Penulis("Mawar Merah"))
        ));

        fiksi.addBuku(new Buku(
                "Seporsi Mie Ayam Sebelum Laprak",
                2024,
                List.of(new Penulis("Ziggy Zagga"))
        ));

        perpus.addKategori(fiksi);


        perpus.tampilkan();
    }
}