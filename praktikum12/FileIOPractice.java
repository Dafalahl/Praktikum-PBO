package praktikum12;

import java.io.*;

public class FileIOPractice {
    public static void main(String[] args) {
        try {
            // Menulis ke file
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Halo, ini contoh File I/O!\n");
            writer.write("Belajar Java itu mudah.");
            writer.close();
            System.out.println("Data berhasil ditulis ke file.");

            // Membaca dari file
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            System.out.println("\nIsi file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
