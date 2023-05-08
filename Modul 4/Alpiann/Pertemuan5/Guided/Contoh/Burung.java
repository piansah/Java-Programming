/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan_5.Guided.Contoh;

/**
 *
 * @author Lenovo
 */
public class Burung extends Enemy {

    String name;
    // overriding
    @Override
    void attack() {
        System.out.println(name + " menyerang dengan paruh");
    }
    
    // overloading
    void attack(String senjata) {
        System.out.println(name + " menyerang dengan " + senjata);
    }
    
    void fly() {
        System.out.println(name + " terbang");
    }
    
    void walk() {
        System.out.println(name + " berjalan");
    }
    
    void jump() {
        System.out.println(name + " melompat");
    }
}

