package TP5_2_H071231010;

import java.util.ArrayList;
import java.util.Scanner;

public class TokoElektronik {
    private Scanner scanner;
    private ArrayList<Product> produkList;

    public TokoElektronik() {
        this.scanner = new Scanner(System.in);
        this.produkList = new ArrayList<>();
    }

    public void tambahProduk(Product produk) {
        produkList.add(produk);
        System.out.println("Produk berhasil ditambahkan ke dalam stok.");
    }

    public void tampilkanSemuaProduk() {
        if (produkList.isEmpty()) {
            System.out.println("Stok toko kosong.");
        } else {
            System.out.println("Daftar Produk:");
            for (Product produk : produkList) {
                produk.displayInfo();
                System.out.println();
            }
        }
    }

    public void beliProduk(String nomorSeri) {
        boolean found = false;
        for (Product produk : produkList) {
            if (produk.nomorSeri.equals(nomorSeri)) { 
                found = true;
                System.out.println("Anda telah membeli produk:");
                produk.displayInfo();
                System.out.println("Pembelian berhasil.");
                break;
            }
        }
        if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
    
    public static void main(String[] args) {
        TokoElektronik toko = new TokoElektronik();

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");

            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    String nama = scanner.next();
                    System.out.print("Masukkan nomor seri: ");
                    String nomorSeri = scanner.next();
                    System.out.print("Masukkan harga: ");
                    double harga = scanner.nextDouble();
                

                    System.out.println("\nPilih tipe produk:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Camera");
                    System.out.print("Pilih tipe produk (1-3): ");
                    int tipe = scanner.nextInt();

                    Product produk = null;
                    switch (tipe) {
                        case 1:
                            System.out.print("Masukkan ukuran layar (inci): ");
                            double ukuranLayar = scanner.nextDouble();
                            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                            int kapasitasPenyimpanan = scanner.nextInt();
                            produk = new Smartphone(nama, nomorSeri, harga, ukuranLayar, kapasitasPenyimpanan);
                            break;
                      
                        case 2: 
                            System.out.print("Masukkan RAM size (GB): ");
                            int ramSize = scanner.nextInt();
                            System.out.print("Masukkan Processor Type: ");
                            String processorType = scanner.next();
                            produk = new Laptop(nama, nomorSeri, harga, ramSize);
                            break;
                    
                        case 3:
                            System.out.print("Masukkan resolution (MP): ");
                            int resolution = scanner.nextInt();
                            System.out.print("Masukkan lens type: ");
                            String lensType = scanner.next();
                            produk = new Camera(nama, nomorSeri, harga, resolution, lensType);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }
                    if (produk != null) {
                        toko.tambahProduk(produk);
                    }
                    break;
                case 2:
                    toko.tampilkanSemuaProduk();
                    break;
                case 3:
                    System.out.print("\nMasukkan nomor seri produk yang ingin dibeli: ");
                    String nomorSeriBeli = scanner.next();
                    toko.beliProduk(nomorSeriBeli);
                    break;
                case 4:
                    System.out.println("\nTerima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 4);
    }
}
