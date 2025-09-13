/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args){
        Pekerja  Budi= new Pekerja("Budi", 30, "Guru", 3000);
   
        System.out.println(Budi);
        Budi.setNama("Yanto");
        System.out.println(Budi);
//        System.out.println(Budi.nama);
        System.out.println(Budi.usia);
        System.out.println(Budi.pekerjaan);
//        System.out.println(Budi.gaji);
    }
    
}
