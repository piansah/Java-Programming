/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan4.Guided.Project;

/**
 *
 * @author Lenovo
 */
public class Buku {
    private String pengarang;
    private String judul;
    private int jumlahHalaman;
    private float diskon;
    private double harga;

    //methods
    public Buku() {
        System.out.println("konstruktor buku dijalankan....");
        
    }
    
    
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    
    public String getPengarang(){
        return pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
    public void setInfo(float diskon, double harga){
        this.diskon = diskon;
        this.harga = harga - (harga * diskon);
    }
    
    public void setInfo(double harga) {
        this.diskon = 0.1f;
        this.harga = harga - (harga * diskon);
    }
    
    public void cetak() {
        System.out.println("judul buku : " + this.getJudul());
        System.out.println("pengarang buku : " + this.getPengarang());
        System.out.println("jumlah halaman buku : " + this.getJumlahHalaman() + "halaman");
        System.out.println("Diskon buku : " + this.getDiskon());
        System.out.println("Harga buku : " + this.getHarga());
    }
}

