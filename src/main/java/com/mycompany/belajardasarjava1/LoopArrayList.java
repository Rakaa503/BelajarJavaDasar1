/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

import.java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class LoopArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>(); // Pakai Integer.bukan int
        
        angka.add(10);
        angka.add(20);
        angka.add(30);
        
        System.out.println("=== Looping Angka ===");
        for (Integer num : angka) {
            System.out.println("Angka: " + num);
            
        }
    }
    
    
    
}
