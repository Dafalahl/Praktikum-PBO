/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum9;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kucing kucing1 = new Kucing();
        kucing1.suara();
        
        Anjing anjing1 = new Anjing();
        anjing1.suara();
        
        
        Kendaraan mobil= new Mobil();
        Kendaraan sepeda= new Sepeda();
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.suara();
        kendaraan.info();
    }
    
}
