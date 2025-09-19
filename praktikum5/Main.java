/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args){
        Kucing k = new Kucing("Kitty");
        Anjing a = new Anjing("Buddy");

        System.out.println(k.tampilkanInfo());
        System.out.println(a.tampilkanInfo());
        
        Mobil m = new Mobil("Toyota", 2022, 4, "Bensin");
        SepedaMotor s = new SepedaMotor("Honda", 2023, 2, true);

        System.out.println("=== Mobil ===");
        System.out.println(m.tampilkanInfo());
        System.out.println("\n=== Sepeda Motor ===");
        System.out.println(s.tampilkanInfo());
    }
}
