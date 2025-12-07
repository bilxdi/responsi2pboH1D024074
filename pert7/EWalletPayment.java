package pert7;

public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String namaLayanan;
    private double saldo;
    private double nominalTransaksi;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double saldo, double nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal

    @Override
    public double getTransactionFee() {
        // Biaya transaksi diasumsikan 2000 sesuai hitungan output (150rb - 50rb - 2rb = 98rb)
        return 2000.0;
    }

    @Override
    public void processPayment() {
        double totalBiaya = nominalTransaksi + getTransactionFee();

        if (saldo >= totalBiaya) {
            saldo -= totalBiaya;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getBalance() {
        return saldo;
    }

}