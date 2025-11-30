package praktikum12;

import java.io.*;

// objek yang akan diserialisasi
class Produk implements Serializable {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class SerializationPractice {
    public static void main(String[] args) {
        try {
            Produk p = new Produk("Laptop", 15000000);

            // Serialisasi (simpan objek)
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("produk.ser")
            );
            oos.writeObject(p);
            oos.close();
            System.out.println("Objek berhasil diserialisasi.");

            // Deserialisasi (baca objek)
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("produk.ser")
            );
            Produk p2 = (Produk) ois.readObject();
            ois.close();

            System.out.println("Objek berhasil dibaca kembali:");
            System.out.println("Nama: " + p2.nama);
            System.out.println("Harga: " + p2.harga);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
