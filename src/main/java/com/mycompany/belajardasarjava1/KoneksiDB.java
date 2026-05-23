/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class KoneksiDB {
    // Konfigurasi Database
    // Konfigurasi Database
    private static final String URL = "jdbc:mysql://localhost:3306/db_mahasiswa";
    private static final String USER = "root"; // Default XAMPP
    private static final String PASS = "";     // Default XAMPP kosong

    // Method untuk mendapatkan koneksi
    public static Connection getConnection() {
        Connection conn = null;

        try {
            // 1. Load Driver (Untuk Java modern, baris ini opsional tapi aman)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Buat Koneksi
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Koneksi Berhasil!");

        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver tidak ditemukan! Cek Library JAR.");
        } catch (SQLException e) {
            System.out.println("Error: Koneksi Gagal! Cek URL/User/Pass atau MySQL");
        }

        return conn;
    }
}
    
    

