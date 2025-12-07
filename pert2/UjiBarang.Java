package pert2;

class UjiBarang {
    public static void main(String[] args) {
        // Buat objek barang pertama gitar
        BarangMusik gitar=new BarangMusik("GTR-001", "Gitar Akustik Yamaha");
//        System.out.println("before atur: ");
//        gitar.tampilInfo();

        // Atur harga gitar
        gitar.ubahHarga(1500000.0);
//        System.out.println("after atur before tambah: ");
//        gitar.tampilInfo();

        // Tambah stok gitar
        gitar.tambahStok(5);
//        System.out.println("after tambah: ");
//        gitar.tampilInfo();

        // Buat objek drum
        BarangMusik drum=new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);
//        System.out.println("drum: ");
//        drum.tampilInfo();
//        System.out.println("");

        // Tampilkan informasi kedua barang
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}