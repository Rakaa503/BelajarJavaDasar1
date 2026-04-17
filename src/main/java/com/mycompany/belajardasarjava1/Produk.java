/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;

/**
 *
 * @author ASUS
 */
public class Produk {
    
    // Atribut private
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor
    public Produk(String namaProduk, double harga, int stokAwal) {
        this.namaProduk = namaProduk;
        this.harga = harga;

        if (stokAwal >= 0) {
            this.stok = stokAwal;
        } else {
            this.stok = 0;
            System.out.println("Stok awal tidak valid, di-set ke 0.");
        }
    }

    // Getter untuk semua atribut
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Setter hanya untuk stok
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh kurang dari 0!");
        }
    }

    // Method untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan. Stok saat ini: " + stok);
        } else {
            System.out.println("Jumlah penambahan harus positif!");
        }
    }

    // Method untuk mengurangi stok
    public void kurangStok(int jumlah) {
        if (jumlah > 0 && stok - jumlah >= 0) {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi. Sisa stok: " + stok);
        } else {
            System.out.println("Pengurangan gagal! Stok tidak cukup atau jumlah tidak valid.");
        }
    }
}
    

