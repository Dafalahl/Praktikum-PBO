/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ACER
 */
public abstract class Produk {
    String nama;
    int harga;

    public Produk(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public abstract int hitungDiskon();
    
    
    
}
