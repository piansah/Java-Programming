/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Unguided;

/**
 *
 * @author Lenovo
 */
public class Bank {
    private int saldo,ambil,simpan;
 
 public Bank(){
    this.saldo = 100000;
 }
 public void simpanUang(int simpan){
    this.simpan = simpan;
 }
 public void ambilUang(int ambil){
    this.ambil = ambil;
 }
 public int getSaldo(){
    return saldo;
 }
 
    public void cetakKelayar(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp." + saldo);
        System.out.println("Simpan uang : Rp." + simpan);
        System.out.println("Saldo saat ini : Rp." + (simpan + saldo));
        System.out.println("Ambil uang : Rp." + ambil);
        System.out.println("Saldo saat ini : Rp." + (simpan + saldo - ambil));
    }
}