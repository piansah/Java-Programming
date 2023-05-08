/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Unguided;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
    int pilih;
    int a,b,c,d,e;
    Scanner inputan;
 
    inputan = new Scanner(System.in);
 
 Titik titik = new Titik();
 
 do{
    titik.tampilMenu();
    System.out.println("Pilih menu : ");
    pilih = inputan.nextInt();
 
    switch(pilih){
    case 1 -> {
        System.out.println("Masukkan Nilai x: ");
        a = inputan.nextInt();
        System.out.println("Masukkan Nilai y: ");
        b = inputan.nextInt();
        titik.inisialisasiTitik(a, b);
    }
 
    case 2 -> titik.tampilTitik();
    case 3 -> {
        System.out.println("Masukkan Nilai Skalar ; " );
        c = inputan.nextInt();
        titik.perkalianSkalar(c);
    }
    case 4 -> titik.pencerminanSumbuX();
    case 5 -> titik.pencerminanSumbuY();
    case 6 -> {
         System.out.println("Masukkan Nilai TITik x Kedua : ");
         d = inputan.nextInt();
         System.out.println("Masukkan Nilai Titik y Kedua : ");
         e = inputan.nextInt();
         System.out.println("Jarak Antar Titik = " + 
titik.Jarak(d, e));
              }
              default -> System.out.println("Inputan yang dimasukkan Salah!");
          }
        }while(pilih != 0);
     }
}