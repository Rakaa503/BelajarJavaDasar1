/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

/**
 *
 * @author ASUS
 */
public class RunMahasiswaEnkapsulasi {
    public static void main(String[] args) {
    MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi("Andi", 20);
    // Mengakses data menggunakan Getter
    System.out.println("Nama Awal: " + mhs.getNama());
    
    // Mengubah data menggunakan setter
    System.out.println("/nMengubah nama menjadi budi...");
    mhs.setNama("Budi");
    
    // Mencoba mengisi umur negatif (akan di tolak validasi)
    System.out.println("Mencoba set umur = -5...");
    mhs.setUmur(-5); //Ini akan memicu pesan eror validasi
    
    //Mengisi umur yang benar
    System.out.println("Mencpba set umur = 21...");
    mhs.setUmur(21);
    
    // Tampilkan hasil akhir
    mhs.tampilInfo();
    
    // mhs.umur = 10:  -> EROR: Tidak bisa mengakses private atribut langsung
  }
}
