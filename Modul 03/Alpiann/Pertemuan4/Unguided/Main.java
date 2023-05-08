/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan4.Unguided;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args){
        Pegawai Pegawai1;
        
        Pegawai1 = new Pegawai();
        
        System.out.println();
        
        Scanner inputBil = new Scanner(System.in);
        Scanner inputKal = new Scanner(System.in);
        
        System.out.println("Masukkan NIP : ");
        Pegawai1.setNIP(inputBil.nextInt());
        
        System.out.println("Masukkan Nama : ");
        Pegawai1.setNama(inputKal.nextLine());
        
        System.out.println("Masukkan Alamat : ");
        Pegawai1.setAlamat(inputKal.nextLine());
        
        System.out.println("Masukkan Jumlah Hari Lembur : ");
        Pegawai1.setJmlhhrLembur(inputBil.nextInt());
        
        System.out.println("Masukkan Gaji Pokok : ");
        Pegawai1.setGajiPokok(inputBil.nextDouble());
        
        Pegawai1.setTotalGaji(0);
        
        Pegawai1.cetak();

    }
}
