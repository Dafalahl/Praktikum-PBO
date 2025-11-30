package praktikum12;

import java.io.*;
import java.util.*;

class ProdukInventori implements Serializable {
    String nama;
    int jumlah;
    double harga;

    public ProdukInventori(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String toString() {
        return nama + " | Stok: " + jumlah + " | Harga: " + harga;
    }
}

public class InventorySystem {
    static ArrayList<ProdukInventori> daftar = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan ke File (Serialisasi)");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilih = in.nextInt();
            in.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String n = in.nextLine();
                    System.out.print("Jumlah: ");
                    int j = in.nextInt();
                    System.out.print("Harga: ");
                    double h = in.nextDouble();
                    daftar.add(new ProdukInventori(n, j, h));
                    break;

                case 2:
                    simpanTxt();
                    break;

                case 3:
                    simpanSer();
                    break;

                case 4:
                    tampilkan();
                    break;
            }

        } while (pilih != 5);

        System.out.println("Keluar program.");
    }

    static void simpanTxt() {
        try {
            FileWriter fw = new FileWriter("produk.txt");
            for (ProdukInventori p : daftar) {
                fw.write(p.toString() + "\n");
            }
            fw.close();
            System.out.println("Data berhasil disimpan ke produk.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void simpanSer() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("produk.ser")
            );
            oos.writeObject(daftar);
            oos.close();
            System.out.println("Data berhasil diserialisasi ke produk.ser");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void tampilkan() {
        for (ProdukInventori p : daftar) {
            System.out.println(p);
        }
    }
}
