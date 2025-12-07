package pert6;

public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n");

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur astraFury = new PesawatTempur("Astra-Fury", 2, 8);


        // TODO:
        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi voyagerX = new KapalEksplorasi("Voyager X", 10, 4);


        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        System.out.println("--- PESAWAT TEMPUR ---");
        // TODO:
        // Aktifkan mesin pesawat
        astraFury.aktifkanMesin();
        // Pesawat menjelajah 10 km
        astraFury.jelajah(10);
        // Pesawat menjelajah 30 km
        astraFury.jelajah(30);
        // Pesawat menembak 3 rudal
        astraFury.tembakRudal(3);
        // Tampilkan status pesawat
        astraFury.tampilStatus();


        System.out.println("\n--- KAPAL EKSPLORASI ---");
        // TODO:
        // Aktifkan mesin kapal eksplorasi
        voyagerX.aktifkanMesin();
        // Kapal menjelajah 15 km
        voyagerX.jelajah(15);
        // Kapal melakukan scanPlanet("Kepler-442b")
        voyagerX.scanPlanet("Kepler-442b");
        // Tampilkan status kapal
        voyagerX.tampilStatus();

    }
}