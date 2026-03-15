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

        teknologi.addBuku(new Buku(
                "The Pragmatic Programmer",
                1999,
                List.of(new Penulis("Andrew Hunt"),
                        new Penulis("David Thomas"))
        ));

        teknologi.addBuku(new Buku(
                "Clean Code",
                2008,
                List.of(new Penulis("Robert Martin"))
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

        filsafat.addBuku(new Buku(
                "Republic",
                1990,
                List.of(new Penulis("Plato"))
        ));

        filsafat.addBuku(new Buku(
                "Meditations",
                2000,
                List.of(new Penulis("Marcus Aurelius"))
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

        sejarah.addBuku(new Buku(
                "Guns, Germs, and Steel",
                1997,
                List.of(new Penulis("Jared Diamond"))
        ));

        sejarah.addBuku(new Buku(
                "The Silk Roads",
                2015,
                List.of(new Penulis("Peter Frankopan"))
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

        agama.addBuku(new Buku(
                "The Problem of Pain",
                1940,
                List.of(new Penulis("C. S. Lewis"))
        ));

        agama.addBuku(new Buku(
                "The Purpose Driven Life",
                2002,
                List.of(new Penulis("Rick Warren"))
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

        agama.addBuku(new Buku(
                "The Purpose Driven Life",
                2002,
                List.of(new Penulis("Rick Warren"))
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

        politik.addBuku(new Buku(
                "Democracy in America",
                1835,
                List.of(new Penulis("Alexis de Tocqueville"))
        ));

        politik.addBuku(new Buku(
                "Political Order and Political Decay",
                2014,
                List.of(new Penulis("Francis Fukuyama"))
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

        fiksi.addBuku(new Buku(
                "Harry Potter and the Philosopher's Stone",
                1997,
                List.of(new Penulis("J.K. Rowling"))
        ));

        fiksi.addBuku(new Buku(
                "Dune",
                1965,
                List.of(new Penulis("Frank Herbert"))
        ));

        perpus.addKategori(fiksi);


        perpus.tampilkan();
    }
}