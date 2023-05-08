/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan4.Guided.Percobaan;

/**
 *
 * @author Lenovo
 */
public class PassByReference {
    static private int y;
    static private int x;
    
    public PassByReference(int x, int y){
        PassByReference.y = y;
        PassByReference.x = x;
    }
    
    public void bypass(PassByReference value){
        System.out.println("variable x sebelum pass by reference = " + x);
        System.out.println("variable y sebelum pass by reference = " + y);
        PassByReference.x = PassByReference.x*10;
        PassByReference.y = PassByReference.y*10;
        System.out.println("variable x yang sudah di pass by reference = " + PassByReference.x);
        System.out.println("variable y yang sudah di pass by reference = " + PassByReference.y);
    }
}
