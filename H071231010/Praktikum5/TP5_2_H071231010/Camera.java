package TP5_2_H071231010;

public class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String nama, String nomorSeri, double harga, int resolution, String lensType) {
        super(nama, nomorSeri, harga);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe: Camera");
        System.out.println("Resolution: " + resolution + " MP");
    }
}

