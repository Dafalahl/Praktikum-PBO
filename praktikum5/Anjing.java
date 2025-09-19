/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
class Anjing extends Hewan {
    public Anjing(String nama){
        super(nama, "Anjing");
    }

    public String suara(){
        return "Guk guk!";
    }

    @Override
    public String tampilkanInfo(){
        return super.tampilkanInfo() + "\n Suara: " + suara();
    }
}