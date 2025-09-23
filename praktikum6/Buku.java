/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ACER
 */
class Buku extends Produk{
    public Buku(String nama, int harga){
        super(nama, harga);
    }
    @Override
    public int hitungDiskon(){
        return harga * 10/100;
    }
}

