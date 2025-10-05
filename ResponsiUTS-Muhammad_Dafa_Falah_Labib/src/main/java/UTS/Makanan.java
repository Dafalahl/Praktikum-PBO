/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Makanan extends Produk{
    private LocalDate tanggalKadaluarsa;
    
    public Makanan(LocalDate tanggalKadaluarsa, String namaProduk, double harga){
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    public LocalDate gettanggalKadaluarsa() { return tanggalKadaluarsa; }
    public void settanggalKadaluarsa(LocalDate tanggalKadaluarsa) { this.tanggalKadaluarsa = tanggalKadaluarsa; }
    @Override
    public void tampilkanInfo(){
         super.tampilkanInfo();
         System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}