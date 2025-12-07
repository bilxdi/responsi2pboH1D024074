package pert4;

class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    int poin;
    String level;
    // TODO: Buat constructor dengan super

    public Member(String nama, String id, int belanja, int poin, String level) {
        super(nama, id, belanja);
        this.poin = poin;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: " +poin+ " | Level: " +level);
    }
}
