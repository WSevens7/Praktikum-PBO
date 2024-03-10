public class Main {

    public static void main(String[] args) {
        //Informasi Pembeli
        Pembeli pembeli1 = new Pembeli("Tian");

        //Daftar Obat yang tersedia dan tidak tersedia
        Obat obat1 = new Obat("Obat Flu");
        obat1.setTersedia(true);

        Obat obat2 = new Obat("Vitamin C");
        obat2.setTersedia(false);

        Obat obat3 = new Obat("Paracetamol");
        obat3.setTersedia(true);

        Obat obat4 = new Obat("Obat Sakit Kepala");
        obat4.setTersedia(true);
        
        //Pembelian Obat
        try {
            pembeli1.beliObat(obat1);
            System.out.println("Pembelian " + obat1.getNama() + " Berhasil");
        
            pembeli1.beliObat(obat2);
            
            pembeli1.beliObat(obat3);
            System.out.println("Pembelian " + obat3.getNama() + " Berhasil");

            pembeli1.beliObat(obat4);
            System.out.println("Pembelian " + obat4.getNama() + " Berhasil");

        } catch (ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        } catch (BatasObatPenuhException e) {
            System.out.println(e.getMessage());
        }

        //Menampilkan informasi pembeli
        System.out.println("Nama Pembeli: " + pembeli1.getNama());

        //Menampilkan informasi keranjang
        System.out.println("Keranjang " + pembeli1.getNama() + ":");
        for (Obat obat : pembeli1.getKeranjangObat()) {
            if (obat != null) {
                System.out.println(" - " + obat.getNama());
            }
        }
    }
}