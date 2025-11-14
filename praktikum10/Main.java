/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperasiHitung penjumlahan = new Penjumlahan(); 
        System.out.println("Penjumlahan: " + 
        penjumlahan.hitung(10, 5));
        
        OperasiHitung pengurangan = new Pengurangan(); 
        System.out.println("Pengurangan: " + 
        pengurangan.hitung(10, 5));
        
        
        //Tugas
        Pembayaran elektronik = new Elektronik(); 
        System.out.println("Harga Kompor listrik: Rp 1000000");
        System.out.println("Harga Pajak Kompor listrik: Rp" + elektronik.hitungPajak(1000000));
        
        Pembayaran makanan = new Makanan(); 
        System.out.println("Harga Nasi padang: Rp 30000");
        System.out.println("Harga Pajak Nasi padang: Rp" + makanan.hitungPajak(30000));
    }
    }
    

