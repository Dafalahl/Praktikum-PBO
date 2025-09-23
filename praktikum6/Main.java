/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Tambahkan produk
        keranjang.tambahProduk(new Buku("Java Programming", 100_000));
        keranjang.tambahProduk(new Elektronik("Headphone", 500_000));
        keranjang.tambahProduk(new Pakaian("Kaos", 150_000));

        // Hitung total
        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotal());
    }
    
}
