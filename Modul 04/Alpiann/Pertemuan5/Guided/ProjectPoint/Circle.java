/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Alpiann.Pertemuan_5.Guided.ProjectPoint;

/**
 *
 * @author Lenovo
 */
public class Circle extends Point{
    private float radius;
    
    public Circle (float r, float a, float b){
        super(a, b);
        radius = r;
        System.out.println("Konstruktor Circle dijalankan");
    }
    
    public void cetakPoint(){
        super.cetakPoint();
        System.out.println("Radius :" + radius);
    }
}

