public class Penjual {
    private String NamaPenjual;
    private String NoTelp;
    private String Alamat;

    public Penjual(String NamaPenjual, String Alamat, String NoTelp) {
        this.NamaPenjual = NamaPenjual;
        this.NoTelp = NoTelp;
        this.Alamat = Alamat;
        
    }

    public String getNamaPen() {
        return NamaPenjual;
    }

    public void setNamaPen(String NamaPenjual) {
        this.NamaPenjual = NamaPenjual;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }

    @Override
    public String toString() {
        return "Penjual : " + NamaPenjual + ", " + NoTelp + ", " + Alamat;
    }
}