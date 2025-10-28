/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ACER
 */
public class PegawaiKontrak extends Pegawai {
   private int lamaKontrak;
    
   public PegawaiKontrak(int lamaKontrak, String namaPegawai, double gaji){
        super(namaPegawai, gaji);
        this.lamaKontrak =lamaKontrak;
    }
   public int getlamaKontrak() { return lamaKontrak; }
   public void setlamaKontrak(int lamaKontrak) { this.lamaKontrak = lamaKontrak; }
    
   @Override
   public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Lama Kontrak:" + lamaKontrak + "bulan");
    }

}
