package pert1;

class UjiPengguna {
    public static void main(String[] args) {
        // Buat objek pengguna dan isi datanya sesuai data uji coba
        // Panggil method tampilInfo
        // Tampilkan demonstrasi tentang konstanta final
        Pengguna user=new Pengguna();
        user.tampilInfo();
        System.out.println("\n--- Demonstrasi Konstanta Final ---" +
                "\nNilai faktor aktivitas: " +user.faktor+
                "\nFaktor aktivitas bersifat final (konstan)" +
                "\nArtinya nilai ini tidak bisa diubah setelah diinisialisasi" +
                "\n\nJika kita mencoba menulis:" +
                "\nuser.faktor=1.5;" +
                "\nAkan muncul 'java: cannot assign a value to final variable faktor'");
//        user.faktor=1.5;
    }
}