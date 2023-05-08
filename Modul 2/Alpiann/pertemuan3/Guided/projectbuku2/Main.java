/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.pertemuan3.Guided.projectbuku2;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Buku naruto = new Buku("Naruto", "Oda", 89);
        Buku Onepiece = new Buku("luffy", "hema", 1024);
        Buku Hilman = new Buku("hilman", "Frank", 53);
        naruto.cetakKeLayar();
        Onepiece.cetakKeLayar();
        Hilman.cetakKeLayar();
    }
}
