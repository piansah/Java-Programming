/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Unguided;

/**
 *
 * @author Lenovo
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank BankBeraksi = new Bank();
        BankBeraksi.getSaldo();
        BankBeraksi.simpanUang(500000);
        BankBeraksi.ambilUang(150000);
        BankBeraksi.cetakKelayar();
    }
}