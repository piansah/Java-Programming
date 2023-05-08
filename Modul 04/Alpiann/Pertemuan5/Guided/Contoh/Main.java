/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan_5.Guided.Contoh;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
    Zombie mayat = new Zombie();
    Pocong pocong = new Pocong();
    Burung merpati = new Burung();
    
    mayat.name = "Mayat hidup";
    pocong.name = "Mumun";
    merpati.name = "Merpati";
    
    mayat.attack();
    mayat.walk();
    
    pocong.attack();
    pocong.jump();
    
    merpati.attack();
    merpati.fly();
    merpati.jump();
    merpati.walk();
    }
}
