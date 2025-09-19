/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
class SepedaMotor extends KendaraanDarat {
    public boolean adaBox;

    public SepedaMotor(String merk, int tahun, int roda, boolean adaBox){
        super(merk, tahun, roda);
        this.adaBox = adaBox;
    }

    @Override
    public String tampilkanInfo(){
        return super.tampilkanInfo() + "\nAda Box: " + (adaBox ? "Ya" : "Tidak");
    }
}
