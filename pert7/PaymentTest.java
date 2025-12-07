package pert7;

public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // Membuat objek dengan Saldo 150.000 dan Transaksi 50.000
        EWalletPayment eWallet = new EWalletPayment("OVO", 150000, 50000);

        // 1. Menampilkan data sebelum transaksi
        // Menggunakan %.0f agar format angka tidak menampilkan koma desimal berlebih
        System.out.printf("Saldo awal: %.0f\n", eWallet.getBalance());

        // 2. Memproses pembayaran
        System.out.println("Memproses pembayaran sebesar 50000...");
        eWallet.processPayment();

        // 3. Menampilkan data setelah transaksi
        System.out.printf("Sisa saldo: %.0f\n", eWallet.getBalance());
        System.out.println("Detail Transaksi: " + eWallet.getPaymentDetails());

    }
}