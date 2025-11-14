/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author ACER
 */
public class Makanan implements Pembayaran{
    @Override
    public double hitungPajak(double harga){
        return harga * 5/100;
    }
    
}
