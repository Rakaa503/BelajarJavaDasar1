/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PerbandinganNilai {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai1, nilai2;
        
        System.out.print("Masukan Nilai Pertama: ");
        nilai1 = input.nextInt();
        
        System.out.print("Masukan Nilai Pertama: ");
        nilai2 = input.nextInt();
        
        System.out.println("\n---Hasil Perbandingan ---");
        // Hasilnya akan boolean (true/false)
        System.out.println("Apakah Nilai 1 == Nilai 2? " + (nilai1 == nilai2));
        System.out.println("Apakah Nilai 1 >  Nilai 2? " + (nilai1 > nilai2));
        System.out.println("Apakah Nilai 1 != Nilai 2? " + (nilai1 != nilai2));
                
        input.close();    
        
    }
    
}
