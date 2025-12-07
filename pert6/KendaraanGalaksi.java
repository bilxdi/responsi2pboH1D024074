package pert6;

public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    // TODO:
    // - String namaKendaraan
    // - int levelEnergi         (0–100)
    // - int kapasitasPenumpang
    private String namaKendaraan;
    private int levelEnergi = 100;
    private int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    // levelEnergi default = 100.
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }


    // ==========================================================
    // GETTER
    // ==========================================================

    // TODO: Getter namaKendaraan
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    // TODO: Getter levelEnergi
    public int getLevelEnergi() {
        return levelEnergi;
    }

    // Method setter tambahan agar subclass bisa mengubah energi
    public void setLevelEnergi(int levelEnergi) {
        if (levelEnergi > 100) this.levelEnergi = 100;
        else if (levelEnergi < 0) this.levelEnergi = 0;
        else this.levelEnergi = levelEnergi;
    }

    // TODO: Getter kapasitasPenumpang
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // TODO:
    // Method final tampilStatus()
    // Format:
    // "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak"
    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }


    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    // TODO:
    // abstract void aktifkanMesin();
    abstract void aktifkanMesin();

    // TODO:
    // abstract void jelajah(int jarak);
    abstract void jelajah(int jarak);

    // TODO:
    // abstract void isiEnergi(int jumlah);
    abstract void isiEnergi(int jumlah);
}