package practicumpbo.objectbehavior;

/**
 * Wafiy Anwarul Hikam / 220605110022 / Praktikum PBO / F
 * @author ACER A515-45-R3RR
 */
public class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Kaing! Kaing!");
        }
    }
}
