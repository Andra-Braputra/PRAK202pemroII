package praktikum2.soal2;

public class Kopi {
    private String pembeli;
    public String namaKopi;
    public String ukuran;
    public double harga;
    private double pajak;

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }
    
    private double pajakKopi() {
        this.pajak = 0.11 * harga; 
        return pajak;
    }

    public double getPajak() {
        return pajakKopi(); 
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
}
