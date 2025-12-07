package pert5;

class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] list = {

        // Isi array dengan objek mesinMotor
        new mesinMotor("Honda Supra X", 125, "Bebek"),

        // Isi array dengan objek mesinTraktor
        new mesinTraktor("Kubota MX5200", 520, 5.0),

        // Isi array dengan objek mesinTraktorListrik
        new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70),
        new mesinMotor("Yamaha R25", 250, "Sport"),
        new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80)
        };
        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin m : list) {
            m.tampilInfo();

        // Loop untuk menampilkan kategori dan performa

            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma() + "\n");
        }
        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin m : list) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            }
        }
        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin terbaik = list[0];
        for (defaultMesin m : list) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        // Logika sorting 3 performa tertinggi
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].nilaiPerforma() < list[j + 1].nilaiPerforma()) {
                    // swap
                    defaultMesin temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " +
                    list[i].namaMesin + " → " + list[i].nilaiPerforma());
        }

    }
}
