/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan_5.Guided.ProjectPoint;

/**
 *
 * @author Lenovo
 */
public class Point {
    protected float x,y;
    
    public Point (float a, float b){
        System.out.println("Konstruktor Point dijalankan");
        x = a;
        y = b;
    }
    
    public void cetakPoint(){
        System.out.println("Point : ["+x+", "+y+"]");
    }
}