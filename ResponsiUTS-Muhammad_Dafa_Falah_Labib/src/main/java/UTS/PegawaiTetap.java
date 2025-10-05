/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ACER
 */
public class PegawaiTetap extends Pegawai {
    private double tunjangan;
    
    public PegawaiTetap(double tunjangan, String namaPegawai, double gaji){
        super(namaPegawai, gaji);
        this.tunjangan =tunjangan;
    }
    public double gettunjangan() { return tunjangan; }
    public void settunjangan(double tunjangan) { this.tunjangan = tunjangan; }
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tunjangan:" + tunjangan);
    }
}
