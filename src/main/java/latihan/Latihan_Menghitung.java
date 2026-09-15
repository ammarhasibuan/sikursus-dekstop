/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class Latihan_Menghitung {
    public static void main(String[] args) {
    
        
    String kode = "JAVA-BSC";
    String nama = "Java Desktop Fundamental";
    
    double biaya = 400_000;
    boolean aktif = true;
    double biayaRegistrasi = 500_000;
    double totalSebelumDiskon = biaya + biayaRegistrasi;
    double diskon;
        if (totalSebelumDiskon >= 900_000) {
            diskon = 0.15;
        } else {
            diskon = 0.05;
        }
    double potongan = totalSebelumDiskon * diskon;
    double total = totalSebelumDiskon - potongan;

        
    String status = (total >= 900_000) ? "MAHAL" : "TERJANGKAU";

        
        System.out.println("Kode        : " + kode);
        System.out.println("Kursus      : " + nama);
        System.out.println("Aktif       : " + aktif);
        System.out.printf("Registrasi  : Rp%,.0f%n", biayaRegistrasi);
        System.out.printf("Subtotal    : Rp%,.0f%n", totalSebelumDiskon);
        System.out.printf("Diskon      : %.0f%%%n", (diskon * 100));
        System.out.printf("Potongan    : Rp%,.0f%n", potongan);
        System.out.printf("Total       : Rp%,.0f%n", total);
        System.out.println("Status      : " + status);
    }
}
    
