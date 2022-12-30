import java.util.Scanner;

public class sumElementArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//deklarasi scanner

        System.out.print("Berapa banyak indeks yang ingin dimasukkan ? : ");
        int length = scanner.nextInt();//input dari banyak indeks yang ingin dimasukkan

        int[] array = new int[length];//deklarasi variabel untuk menampung panjang indeks

        for (int i = 0; i < length; i++) {//untuk mengulangi proses input angka
            System.out.print("Masukkan angka : ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;//deklarasi variable sum
        for (int i = 0; i < length; i++) {//mengulangi pengecekan elemen dari banyak indeks
            if (array[i] % 4 == 0) {//elemen yang berkelipatan 4 akan dijumlahkan
                sum += array[i];//penjumlahan elemen dari indeks array yang kelipatan 4
            }
        }

        System.out.println("Jumlah dari elemen yang kelipatan 4  = " + sum);
    }
}
