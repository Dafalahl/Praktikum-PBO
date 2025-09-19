/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
public class Kendaraan {
    public String merk;
    public int tahun;

    public Kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }

    public String tampilkanInfo(){
        return "Merk: " + merk + "\nTahun: " + tahun;
    }
}