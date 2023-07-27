package practicumpbo.variable;

/**
 * Wafiy Anwarul Hikam / 220605110022? / Praktikum PBO / F
 *
 * @author ACER A515-45-R3RR
 */
public class MAHAsiswa {

    public static void main(String[] args) {
        Mahasiswa[] mahasiswaArray = new Mahasiswa[5];

        //objek pertama
        Mahasiswa mahasiswa1 = new Mahasiswa("Rahman", "3333453");
        mahasiswaArray[0] = mahasiswa1;

        //objek kedua
        Mahasiswa mahasiswa2 = new Mahasiswa("Ahmad", "3334012");
        mahasiswaArray[1] = mahasiswa2;

        //objek ketiga
        Mahasiswa mahasiswa3 = new Mahasiswa("Citra", "3335678");
        mahasiswaArray[2] = mahasiswa3;

        //objek keempat
        Mahasiswa mahasiswa4 = new Mahasiswa("Doni", "3337949");
        mahasiswaArray[3] = mahasiswa4;

        //objek keempat
        Mahasiswa mahasiswa5 = new Mahasiswa("Kautsar", "3339874");
        mahasiswaArray[4] = mahasiswa5;

        System.out.println("Berikut adalah 5 daftar mahasiswa beserta NIM-nya :");

        //cetak keserluruhan
        int i = 0;
        while (i < mahasiswaArray.length) {
            System.out.println("Nama mahasiswa ke " + i + " adalah " + mahasiswaArray[i].Nama());
            System.out.println("NIM mahasiswa ke " + i + " adalah " + mahasiswaArray[i].Nim());
            System.out.println("");
            i = i + 1;
        }

    }
}

class Mahasiswa {

    private String nama;
    private String nim;

    public Mahasiswa(String n, String ni) {
        nama = n;
        nim = ni;
    }

    public String Nama() {
        return nama;  // menggunakan variabel instance untuk mengembalikan nilai
    }

    public String Nim() {
        return nim;  // menggunakan variabel instance untuk mengembalikan nilai
    }
}
