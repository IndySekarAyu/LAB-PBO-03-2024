package TP5_2_H071231010;

public class Smartphone extends Product {
    double ukuranLayar;
    int kapasitasPenyimpanan;

    public Smartphone(String nama, String nomorSeri, double harga, double ukuranLayar, int kapasitasPenyimpanan) {
        super(nama, nomorSeri, harga);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe: Smartphone");
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("Kapasitas Penyimpanan: " + kapasitasPenyimpanan + " GB");
    }
}