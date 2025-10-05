/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ACER
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, double gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    
    public String getnamaPegawai(){
        return namaPegawai;
    }
    
    public void setnamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public double getgaji(){
        return gaji;
    }
    
    public void setgaji(double gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanInfo(){
    System.out.println("Nama Pegawai: " + namaPegawai);
    System.out.println("Gaji: " + gaji);
    }
}
