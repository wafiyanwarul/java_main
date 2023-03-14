package mahasiswa;

/**
 * Wafiy Anwarul Hikam / 220605110022 / Praktikum PBO / F
 * 
 * @author ACER A515-45-R3RR
 */
public class Dog {

    String name;

    public static void main(String[] args) {
        //membuat objek dog dan akses 
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Ciko";
        
//        buat array dog
        Dog [] anjing = new Dog[3];
        anjing [0] = new Dog();
        anjing [1] = new Dog();
        anjing [2] = dog1;
        
//        akses objek dog menggunakan referensi array
        anjing[0].name = "Dalma";
        anjing[1].name = "Doggy";
        
//        mencetak
        System.out.println("Nama anjing yang terakhir");
        System.out.println(anjing[2].name);
        
//        loop array dan semua anjing menggonggong
        int x = 0;
        while (x < anjing.length) {            
            anjing[x].bark();
            x = x + 1;            
        }
    }
    
    public void bark(){
        System.out.println(name + " bersuara guk-guk!!");
    }
}
