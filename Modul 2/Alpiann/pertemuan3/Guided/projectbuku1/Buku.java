/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Guided.projectbuku1;

/**
 *
 * @author Lenovo
 */
public class Buku {
    private String judul;
    private String pengarang;
    private int halaman;
    
    public void setNIlai(String judul, 
            String pengarang, int halaman){
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
    } 
    public void cetakKeLayar(){
        System.out.println("judul : " + this.judul);
        System.out.println("pengarang : " + this.pengarang);
        System.out.println("halaman : " + this.halaman);
    }
}
