package pert1;

class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas
    int umur=25;
    double berat=60;
    double tinggi=170;
    final double faktor=1.2;

    double hitungBMI() {
        // Lengkapi method ini
        return berat / ((tinggi/100) * (tinggi/100));
    }

    void tampilKategori() {
        // Lengkapi method ini
        if (hitungBMI() < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (hitungBMI() < 25) {
            System.out.println("Kategori: Normal");
        } else if (hitungBMI() >= 25) {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        // Lengkapi method ini
        return berat * faktor * 10;
    }

    void tampilInfo() {
        // Lengkapi method ini
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " +umur+ " tahun");
        System.out.println("Berat: " +berat+ " kg");
        System.out.println("Tinggi: " +tinggi+ " cm");
        System.out.println("BMI: " +hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan Kalori: " +hitungKalori()+ " kal/hari");
        System.out.println("====================================");
    }
}