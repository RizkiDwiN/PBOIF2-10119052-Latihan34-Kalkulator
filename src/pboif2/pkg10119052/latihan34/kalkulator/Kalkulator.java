package pboif2.pkg10119052.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * sebuah kalkulator dengan menggunakan dua class berbeda
 * 
 */
public class Kalkulator {
    public static void main(String[] args) {
        PBOIF210119052Latihan34Kalkulator kalku = new PBOIF210119052Latihan34Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        Scanner input = new Scanner(System.in);
        kalku.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalku.value2 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kalku.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalku.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalku.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kalku.bagiBilangan());
        System.out.println("Hasil Sisa : " + kalku.sisaBilagan());
        
        
    }
}
