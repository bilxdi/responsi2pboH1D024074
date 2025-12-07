package pert3;

// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    double tunjangan;
    
    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    public Manajer(String nama, double gaji, double tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.print(" | Tunjangan: Rp " +tunjangan);
        System.out.println("\nTotal Pendapatan: Rp " +(gaji+tunjangan));
    }
}