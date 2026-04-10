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
public class kalkulatorMethod {
 
    // Method untuk penjumlahan
    static double tambah(double a, double b) {
        return a + b;
    }
    
    // Method untuk pengurangan 
    static double kurang(double a, double b) {
        return a-b;
    }
    
    // Method untuk perkalian
    static double kali(double a, double b) {
        return a * b;
        
    }
    
    // Method untuk pembagian 
    static double bagi(double a, double b) {
        return a/b;
    }
    
    // Method tampil menu (void)
    static void tampilMenu() {
        System.out.println("=== KALKULATOR METHOD ===");
        System.out.println("=== KALKULATOR METHOD ===");
        System.out.println("1. Tambah (+) ");
        System.out.println("1. Kurang (-) ");
        System.out.println("1. Kali (x) ");
        System.out.println("1. Bagi (-) ");
        System.out.println("1. Keluar");
        System.out.println("Pilih: ");
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;
        double angka1, angka2, hasil = 0;
        
        do {
            tampilMenu();
            pilihan = scan.nextInt();
            
            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukan Angka 1: ");
               angka1 = scan.nextDouble();
               System.out.print("Masukan Angka 2: ");
               angka2 = scan.nextDouble();
               
               // Pemanggilan method sesuai pilihan 
               if (pilihan == 1) hasil = tambah(angka1, angka2);
               else if (pilihan == 2) hasil = kurang(angka1, angka2);
               else if (pilihan == 3) hasil = kali(angka1, angka2);
               else if (pilihan == 4) hasil = bagi(angka1, angka2);
               
               System.out.println("Hasil: " + hasil);
            } else if (pilihan == 5) {
                System.out.println("Terima Kasih...");
            } else {
                System.out.println("Pilihan salah!");
            }
        }while (pilihan != 5 );
        
        scan.close();
            }
               
               
               
               
                   
}
           
               
                
            