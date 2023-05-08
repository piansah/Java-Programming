/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Guided.projectbuku1;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Buku naruto = new Buku();
        naruto.setNIlai("Luffy", "Mashashi Khisimoto", 1024);
//naruto.judul = "Naruto and Luffy";
//naruto.pengarang = "luffy";
//naruto.halaman = "1024"
        //System.out.println("judul : " + this.judul);
        //System.out.println("pengarang : " + this.pengarang);
        //System.out.println("halaman : " + this.halaman);
        naruto.cetakKeLayar();
    }
}