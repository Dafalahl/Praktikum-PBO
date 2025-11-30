package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {

    static ArrayList<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku dan Simpan ke buku.txt");
            System.out.println("2. Simpan Objek Buku ke buku.ser (Serialisasi)");
            System.out.println("3. Tampilkan data dari buku.txt dan buku.ser");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilih = in.nextInt();
            in.nextLine(); // hapus newline

            switch (pilih) {
                case 1 -> tambahDanSimpanTxt(in);
                case 2 -> simpanSerial();
                case 3 -> tampilkanSemua();
                case 4 -> System.out.println("Keluar program.");
                default -> System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 4);
    }

    // ================== OPSI 1: FILE I/O ==================
    static void tambahDanSimpanTxt(Scanner in) {
        try {
            System.out.print("Judul Buku: ");
            String j = in.nextLine();
            System.out.print("Pengarang: ");
            String p = in.nextLine();
            System.out.print("Tahun Terbit: ");
            int t = in.nextInt();
            in.nextLine();

            Buku b = new Buku(j, p, t);
            daftarBuku.add(b);

            // Simpan ke file txt
            FileWriter fw = new FileWriter("buku.txt", true); 
            fw.write(b.toString() + "\n");
            fw.close();

            System.out.println("Buku berhasil ditambahkan dan disimpan ke buku.txt");
        } catch (Exception e) {
            System.out.println("Error TXT: " + e.getMessage());
        }
    }

    // ================== OPSI 2: SERIALISASI ==================
    static void simpanSerial() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("buku.ser"));
            oos.writeObject(daftarBuku); 
            oos.close();
            System.out.println("Data buku berhasil diserialisasi ke buku.ser");
        } catch (Exception e) {
            System.out.println("Error Serial: " + e.getMessage());
        }
    }

    // ================== OPSI 3: MENAMPILKAN DATA ==================
    static void tampilkanSemua() {
        try {
            // tampilkan isi buku.txt
            System.out.println("\nIsi buku.txt:");
            BufferedReader br = new BufferedReader(new FileReader("buku.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // tampilkan isi buku.ser
            System.out.println("\nIsi buku.ser:");
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("buku.ser"));
            ArrayList<Buku> list = (ArrayList<Buku>) ois.readObject();
            ois.close();

            for (Buku b : list) {
                System.out.println(b);
            }

        } catch (Exception e) {
            System.out.println("Error tampilkan: " + e.getMessage());
        }
    }
}
