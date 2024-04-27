package TP5_2_H071231010;

public class Product {
    String nama;
    String nomorSeri;
    double harga;

    public Product(String nama, String nomorSeri, double harga) {
        this.nama = nama;
        this.nomorSeri = nomorSeri;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Nomor Seri: " + nomorSeri);
        System.out.println("Harga: $" + harga);
    }
}
