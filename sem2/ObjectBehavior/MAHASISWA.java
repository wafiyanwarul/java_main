/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicumpbo.objectbehavior;

/**
 *
 * @author ACER A515-45-R3RR
 */
public class MAHASISWA {

    private String nama;
    private String nim;
    private String prodi;

    public MAHASISWA(String na, String ni, String pd) {
        nama = na;
        nim = ni;
        prodi = pd;
    }

    // untuk Setter
    public void setNama(String nama) {
        nama = nama;
    }

    public void setNim(String nim) {
        nim = nim;
    }

    public void setProdi(String pd) {
        prodi = pd;
    }

    // untuk Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }
}

class mahasiswaRun {

    public static void main(String[] args) {
        MAHASISWA[] mahasiswaArray = new MAHASISWA[10];

        //objek pertama
        MAHASISWA mahasiswa1 = new MAHASISWA("Ridho Aulia", "3333453", "Arsitektur");
        mahasiswaArray[0] = mahasiswa1;

        //objek kedua
        MAHASISWA mahasiswa2 = new MAHASISWA("Ahmad Tamami", "3334012", "Teknik Industri");
        mahasiswaArray[1] = mahasiswa2;

        //objek ketiga
        MAHASISWA mahasiswa3 = new MAHASISWA("Citra Ayu", "3335678", "Teknik Kimia");
        mahasiswaArray[2] = mahasiswa3;

        //objek keempat
        MAHASISWA mahasiswa4 = new MAHASISWA("Doni Salman", "3337949", "Teknik Komputer");
        mahasiswaArray[3] = mahasiswa4;

        //objek kelima
        MAHASISWA mahasiswa5 = new MAHASISWA("Ahmad Kautsar", "3339874", "Teknik Elektro");
        mahasiswaArray[4] = mahasiswa5;

        //objek keenam
        MAHASISWA mahasiswa6 = new MAHASISWA("Wafiy Anwarul", "3338755", "Teknik Informatika");
        mahasiswaArray[5] = mahasiswa6;

        //objek ketujuh
        MAHASISWA mahasiswa7 = new MAHASISWA("Ahmad Yusni", "3335141", "Teknik Industri");
        mahasiswaArray[6] = mahasiswa7;

        //objek kedelapan
        MAHASISWA mahasiswa8 = new MAHASISWA("Ivan Fairuz", "3339756", "Teknik Mesin");
        mahasiswaArray[7] = mahasiswa8;

        //objek kesembilan
        MAHASISWA mahasiswa9 = new MAHASISWA("Fery Ari", "3337542", "Fisika");
        mahasiswaArray[8] = mahasiswa9;

        //objek kesepuluh
        MAHASISWA mahasiswa10 = new MAHASISWA("Azizi Shafa", "3332554", "Ilmu Komunikasi");
        mahasiswaArray[9] = mahasiswa10;

        System.out.println("Berikut adalah daftar mahasiswa beserta NIM-nya :");
        System.out.println("");

        //cetak keseluruhan
        int i = 0;
        while (i < mahasiswaArray.length) {
            System.out.println(i + ". Nama mahasiswa : " + mahasiswaArray[i].getNama());
            System.out.println("   NIM  mahasiswa : " + mahasiswaArray[i].getNim());
            System.out.println("   Mahasiswa Program Studi " + mahasiswaArray[i].getProdi());
            System.out.println("");
            i = i + 1;
        }

    }
}
