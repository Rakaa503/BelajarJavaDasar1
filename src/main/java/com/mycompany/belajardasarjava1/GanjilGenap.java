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
public class GanjilGenap {
     
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukan sebuah angka: ");
        angka = Scan.nextInt();
        
        // Menggunakan operator modulus (%) sisa bagi 
        if (angka % 2 ==0) {
            System.out.println(angka + "adalah bilangan Genap");
        } else {
            System.out.println(angka + "adalah bilangan Ganjil");
        }
        
        Scan.close();
       
    }

}
