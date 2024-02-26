public class MTitik {
    public static void main(String[] args) {
       Titik t1 = new Titik(2, 3);
       Titik t2 = new Titik(4, 5);

       Garis g1 = new Garis(t1, t2);

       double jarak = t1.getJarakPusat();
       System.out.println("Jarak untuk ke pusat: " + jarak);

       t1.RefleksiX();
       System.out.println("Hasil Titik setelah RefleksiX: " + t1);
       t1.RefleksiY();
       System.out.println("Hasil Titik setelah RefleksiY: " + t1);

       Titik TRefleksiX = t1.getRefleksiX();
       System.out.println("Hasil Titik RefleksiX: " + TRefleksiX);
       Titik TRefleksiY = t1.getRefleksiY();
       System.out.println("Hasil Titik RefleksiY: " + TRefleksiY);

       System.out.println(g1);
       System.out.println("Panjang garis: " + g1.getPanjang());
       System.out.println("Gradien garis: " + g1.getGradien());

       Garis GRefleksiY = g1.getRefleksiY();
       System.out.println("Garis refleksi Y: " + GRefleksiY);

       Garis g3 = new Garis(t1, new Titik(5, 7));
       System.out.println("Apakah g1 tegak lurus dengan g3? " + g1.isTegakLurus(g3));
     
   }
}