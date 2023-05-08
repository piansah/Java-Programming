/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Guided.projectbuku2;

/**
 *
 * @author Lenovo
 */
public class Buku {
    private String judul;
    private String pengarang;
    private int halaman;
    
    public Buku(String judul,
            String pengarang,
            int halaman){
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
    }
        
    public Buku(String judul){
        this.judul = judul;
        this.pengarang = "tidak diketahui";
        this.halaman = 0;
    }
    public Buku(){
        this.judul = "tidak diketahui";
        this.pengarang = "tidak diketahui";
        this.halaman = 0;
    }
    public void cetakKeLayar(){
        System.out.println("judul : " + this.judul);
        System.out.println("pengarang : " + this.pengarang);
        System.out.println("halaman : " + this.halaman);
    }
}
