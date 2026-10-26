package latihan3;

public class Main {
    public static void main(String[] args) {
        
        BangunDatar persegi = new Persegi(5);
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar persegiPanjang = new PersegiPanjang(8, 4);
        BangunDatar segitiga = new Segitiga(6, 4);

        tampilkan("Persegi", persegi);
        tampilkan("Lingkaran", lingkaran);
        tampilkan("Persegi Panjang", persegiPanjang);
        tampilkan("Segitiga", segitiga);
    }

    static void tampilkan(String nama, BangunDatar bangun) {
        System.out.println("=== " + nama + " ===");
        System.out.println("Luas     : " + bangun.luas());
        System.out.println("Keliling : " + bangun.keliling());
        System.out.println();
    }
}
