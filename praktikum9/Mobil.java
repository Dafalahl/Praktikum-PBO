/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author ACER
 */
public class Mobil extends Kendaraan {
    @Override
    void berjalan(){
    System.out.println("Mobil berjalan dengan cepat");}
    
}

 class Sepeda extends Kendaraan{
    @Override
    void berjalan(){
    System.out.println("Sepeda berjalan dengan lambat");}
}
