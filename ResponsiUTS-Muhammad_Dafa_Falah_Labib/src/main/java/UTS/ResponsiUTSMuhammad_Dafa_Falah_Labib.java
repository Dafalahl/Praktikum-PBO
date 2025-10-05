/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UTS;
import java.time.LocalDate;
/**
 *
 * @author ACER
 */
public class ResponsiUTSMuhammad_Dafa_Falah_Labib {

    public static void main(String[] args) {
        Produk produk1 = new Elektronik(1, "Laptop", 5000000);
        produk1.tampilkanInfo();
        
        Produk produk2 = new Makanan(LocalDate.of(2025, 10, 5), "Snack", 15000);
        produk2.tampilkanInfo(); 
        
        Pegawai pegawai1 = new PegawaiTetap(1000000, "Budi", 5000000);
        pegawai1.tampilkanInfo(); 
        
        Pegawai pegawai2 = new PegawaiKontrak(7, "Andi", 3000000);
        pegawai2.tampilkanInfo(); 
    }
}
