//by Wafiy Anwarul HIkam
//Simple ArrayList

import java.util.ArrayList;

public class cobaArrayList {

    static void declareArray(){
        ArrayList skincare = new ArrayList<>();

        //ini adalah indeks ke-0
        skincare.add(12);

        //indeks ke-1 dimulai dari nilai true
        skincare.add(true);
        skincare.add(12.000);
        skincare.add("Cleanser");
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

        skincare.remove(10);
        skincare.remove("Shampoo");

        System.out.println("Yang merupakan skincare yaitu : " + skincare);
        System.out.println("Skincare berisi " + skincare.size() + " item");

        System.out.println();

        System.out.println(skincare.get(14));
    }

    public static void main(String[] args) {
        declareArray();
    }
}