package pert4;

class Customer {
    // TODO: Buatkan atribut
    protected String nama;
    protected String id;
    protected int belanja;
    // TODO: Sediakan constructor
    public Customer(String nama, String id, int belanja) {
        this.nama = nama;
        this.id = id;
        this.belanja = belanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " +nama+ " | ID: " +id+ " | Total Belanja: Rp " +belanja);
    }
}
