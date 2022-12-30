import java.util.Scanner;

public class discount {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);// deklarasiScanner
            double amount;// deklarasi variabel amount

            System.out.println("Berapa harganya ? ");
            amount = in.nextDouble();// proses input harga

            double totAmount = amount;

            for (int i = 0; i < 3; i++) {// mengulangi proses diskon 3 kali, masing-masing 10%
                totAmount = totAmount - (totAmount * 0.1);// mengurangi harga awal dengan diskon 10%
            }
            System.out.println("Harga setelah didiskon 10% sebanyak tiga kali = Rp. " + totAmount);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("JANGAN MEMASUKKAN SELAIN ANGKA !!!");
        }

    }
}
