/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

/**
 *
 * @author ASUS
 */
public class RunBank {
    public static void main(String[] args) {
        RekeningBank rek = new RekeningBank("123456", 1000000);
        
        rek.tarik(5000000);
        rek.setor(2000000);
        rek.tarik(200000000); // Gagal, saldo kurang
        
        System.out.println("Saldo Akhir: Rp " + rek.getSaldo());
    }
    
}
