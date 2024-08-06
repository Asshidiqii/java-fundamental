package com.juaracoding.oop;

public class Car {
    String bahanBakar;
    int tahunPembuatan = 2000;

    Car(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }

    void warna(){
        System.out.println("merah");
    }

    void mesin(){
        System.out.println("1800 cc");
    }

    int getTahunPembuatan(){
        return tahunPembuatan;
    }
}
