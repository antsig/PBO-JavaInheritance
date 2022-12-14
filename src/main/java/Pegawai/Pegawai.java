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
public class Pegawai {
    // atribut
    String idPegawai;
    String nama;
    int gol;
    LocalDate tglLahir;
    // constructor
    Pegawai(String id, String nama, int gol, LocalDate tgllhr){
        this.idPegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tgllhr;
    }
    // method menghitung usia pegawai
    int hitungUsia(){
        // mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
        // hitung selisih tgl lahir dan tgl hari ini
        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    } 
    // hitung gaji pokok berdasarkan golongan dan usia
    long hitungGapok(){
        long gapok = 0;
        if (this.gol == 1){
            if (this.hitungUsia() < 40){
               gapok = 3500000;
            } else {
               gapok = 4500000;
            }
        } else if (this.gol == 2){
            if (this.hitungUsia() < 40){
               gapok = 5000000;
            } else {
               gapok = 6000000;
            }
        }
        return gapok;
    }     
    // mencetak data pegawai dan gaji pokoknya
    void printPegawai(){
        System.out.println("------------------------------------------------");
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("------------------------------------------------");
    }
}
