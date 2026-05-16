/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardasarjava1;
import java.util.ArrayList; // Import wajib

/**
 *
 * @author ASUS
 */
public class DemoArrayList {
   public static void main(String[] args) {
       // 1. Deklarasi ArrayList
       // NamaClass<NamaTipeData> namaVariable = new namaClass<>();
       ArrayList<String> namaTeman = new ArrayList<>();
       
       // 2. Menambah data (add)
       namaTeman.add("Budi");
       namaTeman.add("Andi");
       namaTeman.add("Siti");
       
      System.out.println("Isi ArrayList: " + namaTeman);
      
      // 3. Mengambil data (get) berdasarkan index'
      System.out.println("Data Index 0; " + namaTeman.get(0));
      System.out.println("Data Index 2; " + namaTeman.get(2));
      
       // 4. Mengubah data (set)
       namaTeman.set(1, "Rina"); // Ganti "Andi" jadi "Rina"
       System.out.println("Setelah diubah: " + namaTeman);
       
       // 5. Menghapus data (Remove)
       namaTeman.remove(0); // Hapus index 0 (budi)
       System.out.println("Setelah dihapus: " + namaTeman);
       
       // 6. Ukuran ArrayList
         System.out.println(namaTeman.size() + "Jumlah Data: ");     
   
   }
}