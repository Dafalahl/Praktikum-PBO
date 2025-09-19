/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
class Mobil extends KendaraanDarat {
    public String tipeMesin;

    public Mobil(String merk, int tahun, int roda, String tipeMesin){
        super(merk, tahun, roda);
        this.tipeMesin = tipeMesin;
    }

    @Override
    public String tampilkanInfo(){
        return super.tampilkanInfo() + "\nTipe Mesin: " + tipeMesin;
    }
}
