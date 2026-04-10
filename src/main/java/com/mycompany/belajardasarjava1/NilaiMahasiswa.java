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
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
         // Misal: 2 Mahasiswa, masimg-masing punya 3 nilai mapel
        int jumlahMahasiswa = 2;
        int jumlahMapel = 3;
        
        int [][] nilai = new int[jumlahMahasiswa][jumlahMapel];
        
        // Proses Input
        for (int j = 0; j < jumlahMapel; j++) {
            System.out.print("Masukan nilai Mapel ke-" + (j + 1) + "---");
            for (int J = 0; J < jumlahMapel; j++) {
                System.out.print("Masukan nilai Mapel ke-" + (J + 1) + ": ");
                                  
            }
        }
        System.out.println("\n================================");
        System.out.println("            LAPORAN NILAI SISWA   ");
        System.out.println("=================================");
        
        // Proses Output + Hitung Rata rata
        for (int i = 0; 1 < jumlahMahasiswa; i++) {
            int total = 0;
            System.out.print("Siswa " + (i + 1) + ": ");
            
            for (int j = 0; j< jumlahMapel; j++) {
                total += nilai [i][j];
                
                double rata = (double) total / jumlahMapel;
                System.out.println("Rata rata: " + rata);
                
            }
            Scan.close();
        }
        // TODO code application logic here
    }
    
}

        // TODO code application logic here
   

    
