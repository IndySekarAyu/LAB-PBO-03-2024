package TP5_2_H071231010;

public class Laptop extends Product {
    int ramSize;

    public Laptop(String nama, String nomorSeri, double harga, int ramSize) {
        super(nama, nomorSeri, harga);
        this.ramSize = ramSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe: Laptop");
        System.out.println("RAM Size: " + ramSize + " GB");
    }
}