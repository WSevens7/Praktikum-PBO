package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double Alas;
    private double Tinggi;

    public Segitiga(double Alas, double Tinggi, int jumlahSisi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }

    public double hitungLuas() {
        return (Alas*Tinggi)/2;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(Alas/2, 2) + Math.pow(Tinggi, 2));
        return Alas + sisiMiring + sisiMiring;
    }

    public double getAlas() {
        return Alas;
    }

    public void setAlas(double Alas) {
        this.Alas = Alas;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }
}