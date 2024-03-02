public class Produk {

    private String NamaPro;
    private String DeskripsiPro;
    private int StokPro;
    private double HargaPro;
    private Penjual Penjual;

    public Produk(String NamaPro, double HargaPro, int StokPro, String DeskripsiPro, Penjual Penjual) {
        this.NamaPro = NamaPro;
        this.DeskripsiPro = DeskripsiPro;
        this.StokPro = StokPro;
        this.HargaPro = HargaPro;
        this.Penjual = Penjual;
    }

    public String getNama() {
        return NamaPro;
    }

    public void setNama(String NamaPro) {
        this.NamaPro = NamaPro;
    }

    public double getHargaPro() {
        return HargaPro;
    }

    public void setHargaPro(double HargaPro) {
        this.HargaPro = HargaPro;
    }

    public int getStokPro() {
        return StokPro;
    }

    public void setStokPro(int StokPro) {
        this.StokPro = StokPro;
    }

    public String getDeskripsiPro() {
        return DeskripsiPro;
    }

    public void setDeskripsiPro(String DeskripsiPro) {
        this.DeskripsiPro = DeskripsiPro;
    }

    public Penjual getPenjual() {
        return Penjual;
    }

    public void setPenjual(Penjual Penjual) {
        this.Penjual = Penjual;
    }

    public void ubahStokPro(int Ubah) {
        StokPro += Ubah;
    }
    @Override
    public String toString() {
        return "Pro: " + NamaPro + ", " + DeskripsiPro + ", " + StokPro + ", " + HargaPro + ", " + Penjual;
    }
}