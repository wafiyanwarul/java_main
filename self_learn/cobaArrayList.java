//by Wafiy Anwarul HIkam
//Simple ArrayList

//load package arraylist
import java.util.ArrayList;

public class cobaArrayList {

    static void declareArray(){
        
        //deklarasi variabel arraylist
        ArrayList skincare = new ArrayList<>();

        //ini adalah indeks ke-0
        skincare.add(12);

        //indeks ke-1 dimulai dari nilai true
        skincare.add(true);//(boolean) == arraylist dapat menampung berbagai tipe data
        skincare.add(12.000);//(double)
        skincare.add("Cleanser");//(String)
        skincare.add("Mosturizer");
        skincare.add("Hydrating Toner");
        skincare.add("Exfoliating Toner");
        skincare.add("Serum");
        skincare.add("Essence");
        skincare.add("Booster");
        skincare.add("Pasta Gigi"); //pasta gigi bukan bagian dari skincare
        skincare.add("Face Oil");
        skincare.add("Masker");
        skincare.add("Shampoo"); //shampoo bukan bagian dari skincare
        skincare.add("Sunscreen");
        skincare.add("Body Wash");
        skincare.add("Body Serum");

        //dapat menghapus list dengan indeks
        skincare.remove(10);//menghapus ("Pasta Gigi")
        
        //dapat juga menghapus dengan mengetikkan nama listnya
        skincare.remove("Shampoo");//menghapus list shampoo dari arraylist

        //menampilkan isi dari arraylist
        System.out.println("Yang merupakan skincare yaitu : " + skincare);
        
        //menampilkan banyak list secara keseluruhan
        System.out.println("Skincare berisi " + skincare.size() + " item");

        //memberi jarak output
        System.out.println();

        //menampilkan list sesuai indeks yang kita inginkan
        System.out.println(skincare.get(14));//indeks ke-14 ("Body Serum")
    }

    public static void main(String[] args) {
        //memanggil method declareArray();
        declareArray();
    }
}
