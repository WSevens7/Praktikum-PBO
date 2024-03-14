package org.main;

import org.bangundatar.*;
public class MSegitiga {
    public static void main(String[] args) {
        double Alas = 10;
        double Tinggi = 15;

        double Luas = (Alas * Tinggi) / 2;
        double Keliling = Alas + Math.sqrt(Math.pow(Alas/2, 2) + Math.pow(Tinggi, 2)) * 2;

        // Output yang dihasilkan
        System.out.println("Alas segitiga: " + Alas);
        System.out.println("Luas segitiga: " + Luas);
        System.out.println("Tinggi segitiga: " + Tinggi);
        System.out.println("Keliling segitiga: " + Keliling);

    }
}