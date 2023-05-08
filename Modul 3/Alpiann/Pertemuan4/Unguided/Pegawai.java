/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan4.Unguided;

/**
 *
 * @author Lenovo
 */
public class Pegawai {
    private int NIP;
    private String nama;
    private String alamat;
    private int jmlhhrLembur;
    private double gajiPokok;
    private double totalGaji;
    private float gajiLembur;
    
    public Pegawai(){
        System.out.println("Konstruktor Pegawai di jalankan");
    }
    //java tidak memiliki destructor karena menggunakan garbage collector
    
    public void setNIP(int NIP){
        this.NIP = NIP;
    }
    
    public int getNIP(){
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJmlhhrLembur() {
        return jmlhhrLembur;
    }

    public void setJmlhhrLembur(int jmlhhrLembur) {
        this.jmlhhrLembur = jmlhhrLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public double getTotalGaji(){
        return totalGaji;
    }
    public void setTotalGaji(double totalGaji, float gajiLembur) {
        this.gajiLembur = gajiLembur;
        this.totalGaji = gajiPokok + (gajiPokok*jmlhhrLembur*gajiLembur);
    }
    public void setTotalGaji(double totalGaji) {
        this.gajiLembur = 0.01f;
        this.totalGaji = gajiPokok + (gajiPokok*jmlhhrLembur*gajiLembur);
    }
    
    public void cetak(){
        System.out.println("Masukan NIP :" + this.getNIP());
        System.out.println("Masukan Nama :" + this.getNama());
        System.out.println("Masukan Alamat :" + this.getAlamat());
        System.out.println("Jumlah hari lembur :" + this.getJmlhhrLembur());
        System.out.println("Gaji pokok :" + this.getGajiPokok());
        System.out.println("Total Gaji " + this.getTotalGaji());
    }  
}

