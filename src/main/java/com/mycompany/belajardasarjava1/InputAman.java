/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

import java.util.Scanner;
import java.util.InputMismatchException; // Import class exception

/**
 *
 * @author ASUS
 */
class InputAman {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.print("Masukan angka bulat: ");
            int angka = scan.nextInt(); // Error jika user input huruf
            
            System.out.println("Angka yang Anda masukan: " + angka);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka, bukan huruf !");
        } finally {
            // Blok ini selalu dijalankan
            System.out.println("Blok Finally: Selesai.");
            scan.close();
        }
            
        }
            
        }