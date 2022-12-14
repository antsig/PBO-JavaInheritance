/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pegawai;
import java.time.*;

/**
 *
 * @author Markas PMI Gorut
 */
public class TataUsaha extends Pegawai {
 
    // constructor
    TataUsaha(String id, String nama, int gol, LocalDate tgllhr){
        super(id, nama, gol, tgllhr);
    }
 
    // menghitung tunjangan pegawai tata usaha
    long hitungTunjPegawai(){
        long tunjPegawai = 1000000;
        return tunjPegawai;
    }
         
    // menghitung total gaji
    long hitungTotalGaji(){
        long total = this.hitungGapok() + this.hitungTunjPegawai();
        return total;
    }
     
    // cetak data pegawai, rincian gaji, total gaji
    void printPegawai(){
        System.out.println("------------------------------------------------");
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Total Gaji   : Rp " + this.hitungTotalGaji());
        System.out.println("------------------------------------------------");
    }
}