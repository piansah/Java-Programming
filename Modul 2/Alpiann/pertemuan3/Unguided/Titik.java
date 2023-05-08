/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Unguided;

/**
 *
 * @author Lenovo
 */
public class Titik {
    private int x,y,x1,y1;
    private int skalar;
 
public Titik(){
    this.x = 1;
    this.y = 2;
}
 
public void inisialisasiTitik(int x, int y){
    this.x = x;
    this.y = y;
}
 
public void tampilTitik(){
    System.out.println("Titik x : " + this.x);
    System.out.println("Titik y : " + this.y);
}
 
public void perkalianSkalar(int skalar){
    this.skalar = skalar * this.x * this.y;
    System.out.println("Hasil perkalian skalar = " + this.skalar);
}
 
void pencerminanSumbuX(){
    System.out.println("Titik x : " + this.x);
    System.out.println("Titik y : -" + this.y);
}
 
void pencerminanSumbuY(){
    System.out.println("Titik x : -" + this.x);
    System.out.println("Titik y : " + this.y);
}
 
double Jarak(int x1, int y1){
this.x1 = x1; 
this.y1 = y1;
return Math.sqrt((this.x1 - this.x) * (this.x1 - this.x) * (this.y1 - this.y) * (this.y1 - this.y));
}
 
    void tampilMenu(){
        System.out.println("\n \n............MENU OPERASI TITIK.............");
        System.out.println("1. Inisialisasi Titik");
        System.out.println("2. Tampil Titik");
        System.out.println("3. Perkalian Skalar Titik");
        System.out.println("4. Pencerminan Terhadap Sumbu X");
        System.out.println("5. Pencerminan Terhadap Sumbu Y");
        System.out.println("6. Jarak Antara Dua Titik");
    }
}
