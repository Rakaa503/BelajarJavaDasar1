/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

/**
 *
 * @author ASUS
 */
public class DemoArray2d {
      public static void main(String[] args) {
        // 1. Deklarasi langsung
        int [][] angka = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
        
        };
        
        // 2. Mengakses data spesifik
        // Baris 0, kolom 1 -> Nilainya 20
        System.out.println("Data di Baris 0, kolom 1: " + angka[0][1]);
        
        // Baris 2, kolom 0=>  Nilainya 70
        System.out.println("Data di baris 2, Kolom 0: " + angka[2][0]);
        
        // 3. Mengetahui ukuran array
        System.out.println("Jumlah Baris: " + angka.length); // Output: 3
        System.out.println("Jumlah Kolom: " + angka[0].length); // Output: 3
        // TODO code application logic here
    }
    
}
