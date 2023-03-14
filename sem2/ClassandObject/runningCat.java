package practicumpbo.classandobject;
/**
 * Wafiy Anwarul Hikam / 220605110022 / Praktikum PBO / F
 *
 * @author ACER A515-45-R3RR
 */
import java.util.Random;

public class runningCat {

    public static void main(String[] args) {
        Random ran = new Random();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.name = "Tom";
        cat1.ras = "Anggora";
        cat1.age = 2;

        cat2.name = "Kimba";
        cat2.ras = "Persia";
        cat2.age = 3;

        cat3.name = "Micky";
        cat3.ras = "Siamese";
        cat3.age = 1;

        int num1 = ran.nextInt(3);
        int num2 = ran.nextInt(3);
        int num3 = ran.nextInt(3);

        if (num1 == 0) {
            cat1.eat();
        } else if (num1 == 1) {
            cat1.sleep();
        } else {
            cat1.meong();
        }
        
        System.out.println();
        
        if (num2 == 0) {
            cat2.eat();
        } else if (num2 == 1) {
            cat2.sleep();
        } else {
            cat2.meong();
        }

        System.out.println();
        
        if (num3 == 0) {
            cat3.eat();
        } else if (num3 == 1) {
            cat3.sleep();
        } else {
            cat3.meong();
        }
    }
}