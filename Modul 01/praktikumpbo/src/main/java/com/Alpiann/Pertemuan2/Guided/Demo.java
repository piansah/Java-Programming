/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan2.Guided;

/**
 *
 * @author Lenovo
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");//UNTUK MENCETAK OUTPUT
        
        //tipe&nama variabel 
        //deklarasi
        //int a;
        //float b;
        //double c;
        //char d;
        //boolean e;
        
        String nama;
        
        //Assigment
        //a = 5;
        //b = 0.5f;
        //c = 0.5;
        //d = 'r';
        //e = true;
        
        nama = "PIAN";
        
        //operasi aritmatika
        int x, y;
        int hasilPenjumlahan, hasilPengurangan, hasilPerkalian, hasilPembagian1;
        float hasilPembagian2;
        
        x = 10;
        y = 5;
        
        hasilPenjumlahan = x + y;
        hasilPengurangan = x - y;
        hasilPerkalian = x * y;
        hasilPembagian1 = x / y;
        hasilPembagian2 = (float) y / (float) x; //---> casting(mengubah tipe data)
        
        System.out.println("Hasil penjumlahan x dan y: " +(x+y));
        System.out.println("Hasil Pengurangan x dan y: " +(x-y));
        System.out.println("Hasil perkalian x dan y: " +(x*y));
        System.out.println("Hasil pembagian x dan y: " +(x/y));
        System.out.println("Hasil pembagian y dan x: " +(y/x));
        System.out.println("nama saya adalah : " + (nama));
    }
}















