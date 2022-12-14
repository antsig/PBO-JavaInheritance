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
public class Guru extends Pegawai {
    // atribut tambahan untuk guru
    String nip;
    // constructor
    Guru(String id, String nama, int gol, LocalDate tgllhr, String nip){
        super(id, nama, gol, tgllhr);
        this.nip = nip;
    } 
    // menghitung tunjangan pegawai guru
    long hitungTunjPegawai(){
        long tunjPegawai = 1500000;
        return tunjPegawai;
    }     
    // menghitung tunjangan fungsional guru
    long hitungTunjFungsional(){
        long tunjFungsional;
        if (this.hitungUsia() < 40){
            tunjFungsional = 1700000;
        } else {
            tunjFungsional = 2000000;
        }
          return tunjFungsional;
    }     
    // menghitung total gaji
    long hitungTotalGaji(){
        long total = this.hitungGapok() + this.hitungTunjPegawai() + this.hitungTunjFungsional();
        return total;
    }     
    // cetak data pegawai, rincian gaji, total gaji
    @Override
    void printPegawai(){
        System.out.println("------------------------------------------------");
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("NIP          : " + this.nip);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Tunj Fungsi  : Rp " + this.hitungTunjFungsional());
        System.out.println("Total Gaji   : Rp " + this.hitungTotalGaji());
        System.out.println("------------------------------------------------");
    }
}