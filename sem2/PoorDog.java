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
public class PoorDog {

    private int size;
    private String name;
    
    public void setSize(int s){
        size =  s;
    }
    
    public void setName(String n){
        name = n;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

class PoorDogTestDrive {

    public static void main(String[] args) {

//        ORIGINAL -- ASLI : (TANPA NILAI)
//        PoorDog one = new PoorDog();
//        System.out.println("Ukuran anjing : " + one.getSize());
//        System.out.println("Nama anjing : " + one.getName());

//        MODIFIED -- DIMODIFIKASI (DENGAN NILAI & PARAMETER)
        PoorDog one = new PoorDog();
        one.setSize(40);
        one.setName("Brodi");
        System.out.println("Ukuran anjing : " + one.getSize());
        System.out.println("Nama anjing : " + one.getName());

        PoorDog two = new PoorDog();
        two.setSize(80);
        two.setName("Kiko");
        System.out.println("Ukuran anjing : " + two.getSize());
        System.out.println("Nama anjing : " + two.getName());

        PoorDog three = new PoorDog();
        three.setSize(65);
        three.setName("Ollie");
        System.out.println("Ukuran anjing : " + three.getSize());
        System.out.println("Nama anjing : " + three.getName());
    }
}
