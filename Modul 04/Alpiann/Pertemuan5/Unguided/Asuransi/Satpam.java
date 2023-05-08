/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan_5.Unguided.Asuransi;

/**
 *
 * @author Lenovo
 */
public class Satpam extends Pegawai {
    private int gajiPokok;
    private int jamLembur;

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getJamLembur() {
        return jamLembur;
    }
    
    public void setSatpam(String nama, String NIP, String alamat, 
            int tahunMasuk, int gajiPokok, int jamLembur) {
        this.nama = nama;
        this.NIP = NIP;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }
    
    public int HitungGajiAkhir() {
        int gajiAkhir = gajiPokok + (10000 * jamLembur);
        return gajiAkhir;
    }
    
    public void cetakSatpam(){
        System.out.println("\n--Data Satpam--");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIP: " + this.NIP);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Tahun Masuk: " + this.tahunMasuk);
        System.out.println("Gaji Pokok: " + this.gajiPokok);
        System.out.println("Jumlah Jam Lembur: " + this.jamLembur);
        System.out.println("Gaji Akhir: " + HitungGajiAkhir());
    }
}
