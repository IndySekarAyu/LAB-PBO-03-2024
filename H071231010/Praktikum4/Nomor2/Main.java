/**
 *  Mobile
 */
class SelfUtils{
    public static void displaySelfData(){
        System.out.println("Indy Sekar Ayu");
        System.out.println("H071231010");

    }
}

 class  Mobile {
    public Mobile(String merk, String model, int harga, int tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }

    private String merk;
    private String model;
    private int harga;
    private int tahunProduksi;
    private String deskripsi;
    public Mobile() {
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public void displayinfo(){
        System.out.println("Merk " + merk);
        System.out.println("Model " + model);
        System.out.println("Harga " + harga);
        System.out.println("Tahun produksi " + tahunProduksi);
        System.out.println("Deskripsi " + deskripsi);

    }
}


public class Main{
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setMerk("samsung");
        mobile.setModel("persegi");
        mobile.setHarga(2000000);
        mobile.setTahunProduksi(20020);
        mobile.setDeskripsi("berwarna hitam");

        mobile.displayinfo();

        Mobile mobile1 = new Mobile("oppo", "lingkaran", 30000, 2021, "berwarna hijau");
        System.out.println(mobile1.getMerk());
        System.out.println(mobile1.getModel());
        System.out.println(mobile1.getHarga());
        System.out.println(mobile1.getTahunProduksi());
        System.out.println(mobile1.getDeskripsi());
        
        SelfUtils.displaySelfData();
    }
}

