/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan4.Guided.Percobaan;

import pratikumpbo2.markus.pertemuan4.guided.percobaan1.PassByReference;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
//        ModifierExample motor = new ModifierExample();
//        motor.setMotorNazar("XSR");
//        System.out.println(motor.getMotorNazar());
//    Arithmetic perkalian = new Arithmetic();
//    
//        System.out.println(perkalian.perkalian(5, 5));
//        System.out.println(perkalian.perkalian(5, 5, 5));
        
//    PassByValue passBy = new PassByValue();
//    
//    int a = 10;
//    
//        System.out.println("Variable A yang belum di pass by value" + a);
//        passBy.ByValue(a);
    PassByReference passBy = new PassByReference(12, 10);
    
    passBy.bypass(passBy);
    

    }
}