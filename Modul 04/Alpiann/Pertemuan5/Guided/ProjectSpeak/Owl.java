/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan_5.Guided.ProjectSpeak;

/**
 *
 * @author Lenovo
 */
public class Owl extends Mammal{
    public void speak() {
        System.out.println("Whoo! Whoo!");
    }
    
    //jika menggunakan @override, maka saat 
    //main dijalankan, method ini yang akan berjalan(bukan yang ada
    //pada class Mammal
    @Override
    public void sleep() {
        System.out.println(" ");
    }
}