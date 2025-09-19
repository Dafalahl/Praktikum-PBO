/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama, "Kucing");
    }

    public String suara(){
        return "Meong!";
    }

    @Override
    public String tampilkanInfo(){
        return super.tampilkanInfo() + "\n Suara: " + suara();
    }
}
