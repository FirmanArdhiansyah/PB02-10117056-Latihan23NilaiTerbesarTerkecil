
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  Nama : Firman Ardhiansyah
 *          Kelas : IF-2 (PB02)
 *          NIM : 10117056
 * Deskripsi : Program ini berisi Program untuk menampilkan data terkecil dan terbesar
 */
public class PB0210117056Latihan23TerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String petugas;
        int nMhs;
        int nBesar;
        int nKecil;
        int nilaiMhs[] = new int[20];
        Scanner scn = new Scanner(System.in);

        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");

        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();

        nBesar = 0;
        nKecil = 100;

        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilaiMhs[i] = scn.nextInt();

            nBesar = ((nBesar <= nilaiMhs[i]) ? nilaiMhs[i] : nBesar);
            nKecil = ((nKecil >= nilaiMhs[i]) ? nilaiMhs[i] : nKecil);
        }
        System.out.println("\n" + "======Hasil Nilai Mahsiswa======");
        for (int i = 1; i <= nMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilaiMhs[i]);

        }

        System.out.print("\nNilai Terbesar adalah : " + nBesar);
        System.out.println("\nNilai Terkecil adalah : " + nKecil);
        System.out.println("\n" + "Petugas : " + petugas);

    }

}
