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

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

class PoorDogTestDrive {

    public static void main(String[] args) {

        PoorDog one = new PoorDog();
        System.out.println("Ukuran anjing : " + one.getSize());
        System.out.println("Nama anjing : " + one.getName());

    }
}
