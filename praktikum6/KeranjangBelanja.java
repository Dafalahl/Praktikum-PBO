/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
class KeranjangBelanja {
     List<Produk> listProduk = new ArrayList<>();

    // Tambah produk ke keranjang
    public void tambahProduk(Produk p) {
        listProduk.add(p);
    }

    // Hitung total harga setelah diskon
    public int hitungTotal() {
        int total = 0;
        for (Produk p : listProduk) {
            total += (p.harga - p.hitungDiskon());
        }
        return total;
    }
}
