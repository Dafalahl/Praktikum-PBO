/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ACER
 */
public class Produk {
    private String namaProduk;
    private double harga;

    
    public Produk(String namaProduk, double harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getnamaProduk(){
        return namaProduk;
    }
    
    public void setnamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public double getharga(){
        return harga;
    }
    
    public void setharga(double harga) {
        this.harga = harga;
    }
            
    public void tampilkanInfo(){
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);

    }
}
