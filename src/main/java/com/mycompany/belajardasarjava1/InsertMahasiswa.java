/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InsertMahasiswa {
     public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("--- INPUT DATA MAHASISWA ---");
     System.out.println("NIM  : ");
     String nim = scan.nextLine();
     System.out.print("Nama : ");
     
     String nama = scan.nextLine();
     
     System.out.print("IPK : ");
     double ipk = scan.nextDouble();
     
    // QUERY SQL (Tanda Tanya ? adalah placeholder
    String sql = "INSERT INTO tb_mhs (nim, nama, ipk) VALUES (?, ?, ?)";
    
    try {
        // 1. Panggil Koneksi
        Connection conn = KoneksiDB.getConnection();
        
        // 2. Preapare statement
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        // 3. Isi data ke placeholder (Index dimulai dari 1)
        pstmt.setString(1, nim);
        pstmt.setString(2, nama);
        pstmt.setDouble(3, ipk);
        
        // 4. Eksekusi Query
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
            
        } else {
            
        }
            
        // 5. Tutup Koneksi
        pstmt.close();
        conn.close();
        
    } catch (SQLException e) {
        System.out.println("Error SQL: " + e.getMessage());
        
        }
            scan.close();
        }
        
        
    }

    