/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas;

/**
 *
 * @author ACER
 */
class Perpustakaan {
    private Buku[] daftarBuku;
    private int index = 0;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
    }

    public void tambahBuku(Buku buku) {
        if(index < daftarBuku.length) {
            daftarBuku[index++] = buku;
        }
    }

    public void infoPerpustakaan() {
        for(int i = 0; i < index; i++) {
            daftarBuku[i].infoBuku();
        }
    }
}

