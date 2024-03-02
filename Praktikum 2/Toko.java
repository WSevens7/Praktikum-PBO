public class Toko {
    public static void main(String[] args) {
        Penjual penjual1 = new Penjual("Willy", "Semarang", "08123456789");
        Produk produk1 = new Produk("Keyboard", 500000, 10, "Keyboard untuk mengetik untuk PC/Laptop", penjual1);

        System.out.println("Deskripsi Produk :");
        System.out.println(produk1); 

        produk1.setNama("Keyboard Logiteko");
        produk1.setHargaPro(650000);

        System.out.println("\nDeskripsi Produk setelah diubah:");
        System.out.println(produk1);

        System.out.println("\nInformasi Penjual:");
        System.out.println(penjual1); 
    }
}
