package practicumpbo.objectbehavior;

/**
 * Wafiy Anwarul Hikam / 220605110022 / Praktikum PBO / F
 * @author ACER A515-45-R3RR
 */
public class PetsBark {

    private String name;
    private int size;

    public PetsBark(String name, int size) { //UNRUK MENAMPUNG NAMA & UKURAN
        this.name = name;                    //DARI SETIAP OBJEK ANJING
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSize(int s) {
        size = s;
    }

    public void bark() {
        if (size > 60) {
            System.out.println(name + " : Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println(name + " : Ruff! Ruff!");
        } else {
            System.out.println(name + " : Kaing! Kaing!");
        }
    }
}

class PetsBarkTestDrive {

    public static void main(String[] args) {
        PetsBark[] pets = new PetsBark[10]; 

        pets[0] = new PetsBark("Kimmi", 10);
        pets[1] = new PetsBark("Kiko", 70);
        pets[2] = new PetsBark("Ollie", 47);
        pets[3] = new PetsBark("Aurora", 50);
        pets[4] = new PetsBark("Piki", 70);
        pets[5] = new PetsBark("Lona", 63);
        pets[6] = new PetsBark("Bombom", 78);
        pets[7] = new PetsBark("Jacky", 20);
        pets[8] = new PetsBark("Zoey", 12);
        pets[9] = new PetsBark("Cooper", 36);

        System.out.println("Nama-nama anjing dan suaranya :");
        System.out.println("");
        
        for (int i = 0; i < pets.length; i++){
            pets[i].bark();            
//            for (int j = 0; j < 1; j++){  //GUNAKAN JIKA INGIN ADA JARAK SETIAP
//                System.out.println(" ");  //NAMA ANJING
//            }
        }
    }    
}
