package latihan3;

public class Segitiga extends BangunDatar {
    public float alas;
    public float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float keliling() {
        float sisiMiring = (float) Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
        return alas + 2 * sisiMiring;
    }
}
