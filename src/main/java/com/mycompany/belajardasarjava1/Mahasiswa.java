/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
   // 1. Atribut (Ciri-ciri / Variable)
    // Tidak pakai 'tatic' karena milik masing masing object
    public String nama;
    public String nim;
    public double ipk;
    
// 2. Constructor (Metode khusus untuk inisialisasi Object)
// Nama harus SAMA dengan nama class, tidak ada Return Type
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk=ipk;
    }
    
// 3. Method (Perilaku /Timgkah Laku)
    public void tampilInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + ipk);
        System.out.println("IPK : " + ipk);
        System.out.println("-----------------");
    }
    
public void belajar() {
    System.out.println(nama + " sedang belajar Java OOP.");
    
}

}
    