public class MTitik {
    static double counter;
    public static void main(String[] args) {
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(3, 4);
        Titik t3 = new Titik(5, 6);
        Titik t4 = new Titik();

        t4.setAbsis(7);
        t4.setOrdinat(8);
        System.out.println("t1: " + t1.getAbsis()+ ", " + t1.getOrdinat());
        System.out.println("t2: " + t2.getAbsis()+ ", " + t2.getOrdinat());
        System.out.println("t3: " + t3.getAbsis()+ ", " + t3.getOrdinat());
        System.out.println("t4: " + t4.getAbsis()+ ", " + t4.getOrdinat());
        System.out.println("Jumlah objek titik yang telah dibuat: " + Titik.getCounter());
    }
}
