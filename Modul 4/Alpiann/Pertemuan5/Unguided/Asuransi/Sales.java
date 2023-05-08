/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan_5.Unguided.Asuransi;

/**
 *
 * @author Lenovo
 */
public class Sales extends Pegawai{
    private int gajiPokok;
    private int jumlahPelanggan;

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getJumlahPelanggan() {
        return jumlahPelanggan;
    }
    
    public void setSales(String nama, String NIP, String alamat, 
            int tahunMasuk, int gajiPokok, int jumlahPelanggan) {
        this.nama = nama;
        this.NIP = NIP;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        this.jumlahPelanggan = jumlahPelanggan;
    }
    
    public int HitungGajiAkhir() {
        int gajiAkhir = gajiPokok + (50000 * jumlahPelanggan);
        return gajiAkhir;
    }
    
    public void cetakSales() {
        System.out.println("\n--Data Sales--");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIP: " + this.NIP);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Tahun Masuk: " + this.tahunMasuk);
        System.out.println("Gaji Pokok: " + this.gajiPokok);
        System.out.println("Jumlah Pelanggan yang Direkrut: " 
                + this.jumlahPelanggan);
        System.out.println("Gaji Akhir: " + HitungGajiAkhir());
    }
}

