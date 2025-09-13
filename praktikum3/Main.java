/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // Membuat 2 object mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");

        // Tampilkan info & nyalakan mesin
        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println();

        mobil2.displayInfo();
        mobil2.startEngine();
        System.out.println();

        // Ubah warna mobil1
        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();
    }
}