/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Pegawai;
import java.time.*;

/**
 *
 * @author Markas PMI Gorut
 */
public class Tugas1Inheritance {
        public static void main(String[] args) {
        // contoh obyek data pegawai
        Pegawai p1 = new Pegawai("P01", "Said Ismail", 2, LocalDate.of(1979, 9, 1));
        p1.printPegawai();
        // contoh obyek data pegawai guru
        Guru p2 = new Guru("P02", "Wheny Anif", 1, LocalDate.of(1993, 3, 3), "201903032019");
        p2.printPegawai();
         
        // contoh obyek data pegawai tata usaha
        TataUsaha p3 = new TataUsaha("P03", "Nurdin Ngabito", 1, LocalDate.of(1988, 1, 25));
        p3.printPegawai();
    }
}
