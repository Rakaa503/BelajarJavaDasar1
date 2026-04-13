/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

/**
 *
 * @author ASUS
 */
public class MahasiswaEnkapsulasi {
    // 1. Atribut dibuat PRIVATE (tidak bisa langsung diakses di luar)
    private String nama;
    private int umur;
    
    // 2. Constructor
    public MahasiswaEnkapsulasi(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    // 3. Getter : Method untuk MENGAMBIL nilai atribut
    // Nama method standar : getNamaAtribut()
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
        
    }
    // 4. Setter : Method untuk MENGUBAH nilai atribut
    // Nama method standar : setNamaAtribut(tipe parameter)
    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }
    
    public void setUmur(int umurBaru) {
        // VALIDASI : Hanya terima umur positif
        if (umurBaru > 0){
            this.umur= umurBaru;
        } else {
            System.out.println("Eror: Umur tidak boleh negatif atau nol");
        }
    }
    
    public void tampilInfo() {
        System.out.println("Nama : " + ", Umur: " + umur);
    }
}
