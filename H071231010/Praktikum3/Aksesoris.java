package Praktikum3;

// public class Aksesoris {
//     // Attribute
//     private String nama;
//     private double harga;
//     private Bahan bahan;

//     // Constructors
//     public Aksesoris(String nama, double harga) {
//         this.nama = nama;
//         this.harga = harga;
//         this.bahan = new Bahan(); // Inisialisasi objek bahan
//     }

//     public Aksesoris(String nama, double harga, Bahan bahan) {
//         this.nama = nama;
//         this.harga = harga;
//         this.bahan = bahan;
//     }

//     // Behaviors
//     public String info() {
//         return nama + " adalah aksesoris dengan harga " + harga + " rupiah, menggunakan bahan " + bahan.getNama() + " " ;
//     }

//     public void gantiBahan(String bahanBaruNama, double hargaBaru) {
//         bahan.setNama(bahanBaruNama);
//         this.harga = hargaBaru;
//         System.out.println("Bahan aksesoris " + nama + " berhasil diganti menjadi bahan " + bahanBaruNama + " " );
//     }

//     // Getter and Setter methods
//     public String getNama() {
//         return nama;
//     }

//     public void setNama(String nama) {
//         this.nama = nama;
//     }


//     public double getHarga() {
//         return harga;
//     }

//     public void setHarga(double harga) {
//         this.harga = harga;
//     }

//     public Bahan getBahan() {
//         return bahan;
//     }

//     public void setBahan(Bahan bahan) {
//         this.bahan = bahan;
//     }

//     // Main method
//     public static void main(String[] args) {
//         // Membuat objek aksesoris
//         Aksesoris aksesoris1 = new Aksesoris("Gelang",  150000);

//         // Memanggil method info untuk mendapatkan informasi aksesoris
//         System.out.println(aksesoris1.info());

//         // Mengganti bahan aksesoris
//         aksesoris1.gantiBahan("Emas", 200000);

//         // Memanggil method info lagi setelah mengganti bahan
//         System.out.println(aksesoris1.info());
//     }
// }

// class Bahan {
//     // Attribute
//     private String nama;

//     // Constructors
//     public Bahan() {
//         this.nama = "logam";
//     }

//     public Bahan(String nama) {
//         this.nama = nama;
//     }

//     // Getter and Setter methods
//     public String getNama() {
//         return nama;
//     }

//     public void setNama(String nama) {
//         this.nama = nama;
//     }
// }





public class Aksesoris {
    private String nama;
    private double harga;
    private Bahan bahan;

    public Aksesoris(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.bahan = new Bahan();
    }

    public Aksesoris(String nama, double harga, Bahan bahan) {
        this.nama = nama;
        this.harga = harga;
        this.bahan = bahan;
    }

    public String info() {
        return nama + " adalah aksesoris dengan harga " + harga + " rupiah, menggunakan bahan " + bahan.getNama() + " " ;
    }

    public void gantiBahan(String bahanBaruNama, double hargaBaru) {
        bahan.setNama(bahanBaruNama);
        this.harga = hargaBaru;
        System.out.println("Bahan aksesoris" + nama + " berhasil diganti menjadi bahan " + bahanBaruNama + " ");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Bahan getBahan() {
        return bahan;
    }

    public void setBahan(Bahan bahan) {
        this.bahan = bahan;
    }

    public static void main(String[] args) {
        Aksesoris aksesoris1 = new Aksesoris("Gelang", 150000);
        System.out.println(aksesoris1.info());

        aksesoris1.gantiBahan("Emas", 200000);
        System.out.println(aksesoris1.info());
    }
}

class Bahan {
    private String nama;

    public Bahan() {
        this.nama = "logam";
    }

    public Bahan(String nama ) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}







