/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
class KendaraanDarat extends Kendaraan {
    public int roda;

    public KendaraanDarat(String merk, int tahun, int roda){
        super(merk, tahun);
        this.roda = roda;
    }

    @Override
    public String tampilkanInfo(){
        return super.tampilkanInfo() + "\nJumlah roda: " + roda;
    }
}
