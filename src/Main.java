import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kampus X");

        // ================= TEKNOLOGI =================
        Kategori teknologi = new Kategori("Teknologi");

        teknologi.addBuku(new Buku(
                "Algoritma Dasar",
                2019,
                "Buku ini berisi tentag penjelasan algoritma dasar yang dibutuhkan untuk orang-orang yang ingin belajar tentang algoritma.",
                List.of(new Penulis("William Stallings"))
        ));

        teknologi.addBuku(new Buku(
                "Pemrograman Java",
                2020,
                "Buku ini berisi tentang penjelasan kode-kode Java untuk pemula.",
                List.of(new Penulis("Daniel Y."),
                        new Penulis("Peter William"))

        ));

        teknologi.addBuku(new Buku(
                "Teknologi Jaringan",
                1999,
                "Di dalam buku ini terdapat penjelasan tentang teknologi dan juga jaringan.",
                List.of(new Penulis("Chandra L."),
                        new Penulis("David Y."))
        ));

        teknologi.addBuku(new Buku(
                "The Pragmatic Programmer",
                1999,
                "buku ini berisi kiat-kiat untuk para programmer.",
                List.of(new Penulis("Andrew Hunt"),
                        new Penulis("David Thomas"))
        ));

        teknologi.addBuku(new Buku(
                "Clean Code",
                2008,
                "Kode-kode harus ditulis secara terstruktur dan bersih agar mudah dimaintain dan dikembangkan.",
                List.of(new Penulis("Robert Martin"))
        ));

        perpus.addKategori(teknologi);


        // ================= FILSAFAT =================
        Kategori filsafat = new Kategori("Filsafat");

        filsafat.addBuku(new Buku(
                "Pengantar Filsafat",
                2018,
                "Filsafat adalah suatu pandangan tentang dunia dan segala hal di dalamnya",
                List.of(new Penulis("Plato"))
        ));

        filsafat.addBuku(new Buku(
                "Etika Hidup",
                2020,
                "Di dalam kehidupan ini ada beberapa hal yang harus dilakukan sebagai manusia.",
                List.of(new Penulis("Siti Kusmini"))
        ));

        filsafat.addBuku(new Buku(
                "Pemikiran Kiri Kanan",
                2017,
                "berisi tentang pemikiran para orang-orang yang hidup di dunia ini.",
                List.of(new Penulis("Mawar Melati"))
        ));

        filsafat.addBuku(new Buku(
                "Republic",
                1990,
                "Plato merumuskan gagasannya tentang negara yang ideal.",
                List.of(new Penulis("Plato"))
        ));

        filsafat.addBuku(new Buku(
                "Meditations",
                2000,
                "cara hidup dengan tenang, dengan bermeditasi.",
                List.of(new Penulis("Marcus Aurelius"))
        ));

        perpus.addKategori(filsafat);


        // ================= SEJARAH =================
        Kategori sejarah = new Kategori("Sejarah");

        sejarah.addBuku(new Buku(
                "Sejarah Dunia",
                2011,
                "kumpulan cerita tentang apa saja yang pernah terjadi di dunia ini.",
                List.of(new Penulis("Noah Harari"))
        ));

        sejarah.addBuku(new Buku(
                "The History of the Ancient World",
                2007,
                "Dunia yang kuno adalah suatu hal yang menarik dibahas, karena dari situlah peradaban manusia dimulai.",
                List.of(new Penulis("Susan Wise Bauer"))
        ));

        sejarah.addBuku(new Buku(
                "Sejarah Teknologi",
                2015,
                "Teknologi terus berkembang seiring berjalannya zaman, banyak hal-hal baru yang ditemukan untuk mempermudah kehidupan manusia hingga saat ini.",
                List.of(new Penulis("Dewi Anata"))
        ));

        sejarah.addBuku(new Buku(
                "Guns, Germs, and Steel",
                1997,
                "Buku ini membahas perbedaan laju perkembangan masyarakat manusia di berbagai benua selama 13.000 tahun terakhir.",
                List.of(new Penulis("Jared Diamond"))
        ));

        sejarah.addBuku(new Buku(
                "The Silk Roads",
                2015,
                "Sultan mehmed II melancarkan serangan terhadap kekaisaran Bizantium.",
                List.of(new Penulis("Peter Frankopan"))
        ));

        perpus.addKategori(sejarah);

        // ================= AGAMA =================
        Kategori agama = new Kategori("Agama");

        agama.addBuku(new Buku(
                "Pemikiran Orang Beragama",
                2020,
                "Dalam kehidupan ini agama dibutuhkan untuk menjadi pedoman hidup umat manusia.",
                List.of(new Penulis("Abdul Saihul"))
        ));

        agama.addBuku(new Buku(
                "Teologi Modern",
                2002,
                "Proses pendekatan ilmu agama dengan mempertimbangkan konteks zaman serta perkembangan ilmu pengetahuan.",
                List.of(new Penulis("Rick Warren"))
        ));

        agama.addBuku(new Buku(
                "Spiritualitas",
                2012,
                "Berisi berbagai kelompok dan hal yang sehubungan dengan spiritualitas.",
                List.of(new Penulis("Ainun Najib"))
        ));

        agama.addBuku(new Buku(
                "The Problem of Pain",
                1940,
                "Penderitaan manusia, penderitaan hewan, dan neraka bukanlah alasan yang cukup untuk menolak kepercayaan pada Tuhan yang baik dan mahakuasa.",
                List.of(new Penulis("C. S. Lewis"))
        ));

        agama.addBuku(new Buku(
                "The Purpose Driven Life",
                2002,
                "Buku ini akan menuntun pemacanya untuk menjawab pertanyaan 'Untuk apa aku hidup di dunia ini?'",
                List.of(new Penulis("Rick Warren"))
        ));

        perpus.addKategori(agama);


        // ================= PSIKOLOGI =================
        Kategori psikologi = new Kategori("Psikologi");

        psikologi.addBuku(new Buku(
                "Thinking, Fast and Slow",
                2011,
                "Berisi tentang perbedaan antara dua mode berpikir",
                List.of(new Penulis("Daniel Kahneman"))
        ));

        psikologi.addBuku(new Buku(
                "Man's Search for Meaning",
                1946,
                "Menceritakan pengalaman penulisnya sebagai tahanan kamp konsentrasi Nazi, dan mendeskripsikan metode psikoterapi yang dikembangkannya.",
                List.of(new Penulis("Viktor E. Frankl"))
        ));

        psikologi.addBuku(new Buku(
                "Emotional Intelligence",
                1995,
                "Membahas konsep kecerdasan emosional dan memberikan definisi tentang kecerdasan emosional menurut beberapa ahli.",
                List.of(new Penulis("Daniel Goleman"))
        ));

        agama.addBuku(new Buku(
                "The Purpose Driven Life",
                2002,
                "Buku ini akan menuntun pemacanya untuk menjawab pertanyaan 'Untuk apa aku hidup di dunia ini?'",
                List.of(new Penulis("Rick Warren"))
        ));

        perpus.addKategori(psikologi);


        // ================= POLITIK =================
        Kategori politik = new Kategori("Politik");

        politik.addBuku(new Buku(
                "The Prince",
                1532,
                "Sebuah risalah singkat tentang bagaimana cara memperoleh kekuasaan, membangun negara, dan mempertahankannya.",
                List.of(new Penulis("Niccolo Machiavelli"))
        ));

        politik.addBuku(new Buku(
                "The Art of War",
                2005,
                "Prinsip-prinsip dasar yang diperlukan untuk mencapai kemenangan dalam pertempuran dan konflik.",
                List.of(new Penulis("Sun Tzu"))
        ));

        politik.addBuku(new Buku(
                "On Politics",
                2013,
                "Membahas tentang konsep ideal tentang negara, kekuasaan, dan masyarakat.",
                List.of(new Penulis("Alan Ryan"))
        ));

        politik.addBuku(new Buku(
                "Democracy in America",
                1835,
                "Analisis mengapa demokrasi represenatif berhasil di Amerika tetapi gagal di tempat lain.",
                List.of(new Penulis("Alexis de Tocqueville"))
        ));

        politik.addBuku(new Buku(
                "Political Order and Political Decay",
                2014,
                "Pentingnya memahami sistem politik dari dimensi perubahan sosial dan perubahan ekonomi.",
                List.of(new Penulis("Francis Fukuyama"))
        ));

        perpus.addKategori(politik);


        // ================= FIKSI =================
        Kategori fiksi = new Kategori("Fiksi");

        fiksi.addBuku(new Buku(
                "Laut Melaut",
                2018,
                "Pemuda yang dinyatakan hilang itu sebenarnya hanya sedang bersantai dan pergi melaut.",
                List.of(new Penulis("Leila S."))
        ));

        fiksi.addBuku(new Buku(
                "Legenda Dugong",
                2013,
                "Mitos yang selalu beredar di masyarakat tentang makhluk laut yang mirip duyung.",
                List.of(new Penulis("Mawar Merah"))
        ));

        fiksi.addBuku(new Buku(
                "Seporsi Mie Ayam Sebelum Laprak",
                2024,
                "Kadang untuk lepas dari hal-hal yang bikin stress kita butuh makanan enak, contohnya... mie ayam!",
                List.of(new Penulis("Ziggy Zagga"))
        ));

        fiksi.addBuku(new Buku(
                "Harry Potter and the Philosopher's Stone",
                1997,
                "Harry, seorang penyihir muda yang menemukan warisan sihirnya pada ulang tahunnya yang ke sebelas.",
                List.of(new Penulis("J.K. Rowling"))
        ));

        fiksi.addBuku(new Buku(
                "Dune",
                1965,
                "Pencarian pribadi seorang pahlawan muda. Dia memimpin rakyatnya melawan seorang baron jahat yang mencoba mengancurkan perdagangan rempah-rempah di seluruh galaksi.",
                List.of(new Penulis("Frank Herbert"))
        ));

        perpus.addKategori(fiksi);

        perpus.tampilkan();



        // PERBANDINGAN BUKU
        System.out.println("\n===== PERBANDINGAN BUKU =====");

        Buku buku1 = new Buku(
                "Algoritma Dasar",
                2019,
                "Buku ini berisi tentag penjelasan algoritma dasar yang dibutuhkan untuk orang-orang yang ingin belajar tentang algoritma.",
                List.of(new Penulis("William Stallings"))
        );

        Buku buku2 = new Buku(
                "Pemrograman Java",
                2020,
                "Buku ini berisi tentang penjelasan kode-kode Java untuk pemula.",
                List.of(new Penulis("Daniel Y."),
                        new Penulis("Peter William"))
        );

        System.out.println("\nBuku pertama:");
        buku1.tampilkan();

        System.out.println("\nBuku kedua:");
        buku2.tampilkan();

        int kesamaan = buku1.cekKesamaan(buku2);

        System.out.println("\nTingkat kesamaan: " + kesamaan + "%");

        // Menampilkan jumlah kata dalam sinopsis
        System.out.println("\nJumlah kata sinopsis buku pertama: " + buku1.hitungJumlahKata());
        System.out.println("\nJumlah kata sinopsis buku pertama: " + buku2.hitungJumlahKata());

        // Menguji method copy
        Buku bukuCopy1 = buku1.copy();
        Buku bukuCopy2 = buku2.copy();

        System.out.println("\n===== HASIL COPY BUKU =====");
        bukuCopy1.tampilkan();
        bukuCopy2.tampilkan();

        // Baca dan Simpan File
        // simpan dari object
        buku1.simpanFile("data.txt");
        // baca ke object baru
        Buku bukuFile = new Buku("", 0, "", new ArrayList<>());
        bukuFile.bacaFile("data.txt");
        // tampilkan
        System.out.println("\n===== DATA DARI FILE =====");
        bukuFile.tampilkan();


        // ================= ROYALTI =================
        System.out.println("\n===== HITUNG ROYALTI =====");
        System.out.println("Royalti 10%: " + buku1.hitungRoyalti(100000));
        System.out.println("Royalti 20%: " + buku1.hitungRoyalti(100000, 20));
    }
}