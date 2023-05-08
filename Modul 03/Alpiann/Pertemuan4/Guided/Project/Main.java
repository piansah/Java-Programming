/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan4.Guided.Project;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Buku novel, fiksi;
        
        novel = new Buku();
        fiksi = new Buku();
        
        System.out.println();
        
        Scanner inputBilangan = new Scanner(System.in);
        Scanner inputKalimat = new Scanner(System.in);
        
        System.out.println("masukkan judul buku: ");
        novel.setJudul(inputKalimat.nextLine());
        
        
        System.out.println("masukkan pengarang: ");
        novel.setPengarang(inputKalimat.nextLine());
        
        novel.setInfo(0.2f, 45000);
        
        System.out.println("masukkan jumlah halaman: ");
        novel.setJumlahHalaman(inputBilangan.nextInt());
        
        novel.cetak();
        
        System.out.println();
        
         System.out.println("masukkan judul buku: ");
        fiksi.setJudul(inputKalimat.nextLine());
        
        
        System.out.println("masukkan pengarang: ");
        fiksi.setPengarang(inputKalimat.nextLine());
        
        fiksi.setInfo(79000);
        
        System.out.println("masukkan jumlah halaman: ");
        fiksi.setJumlahHalaman(inputBilangan.nextInt());
        
        fiksi.cetak();
    }
}
