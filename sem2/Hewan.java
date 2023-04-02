/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicumpbo.polymorphismandinheritance;

/**
 *
 * @author ACER A515-45-R3RR
 */
class Animal {

    //encapsulation
    protected String picture;
    protected String food;
    protected int hungry;
    protected String location;
    protected String boundaries;

    //untuk getter
    public String getPicture() {
        return picture;
    }

    public String getFood() {
        return food;
    }

    public int getHungry() {
        return hungry;
    }

    public String getLocation() {
        return location;
    }

    public String getBondaries() {
        return boundaries;
    }

    //constructor berparameter
    public Animal(String pr, String fd, int hg, String lc, String bd) {
        picture = pr;
        food = fd;
        hungry = hg;
        location = lc;
        boundaries = bd;
    }

    //untuk setter
    public void setPicture(String pr) {
        picture = pr;
    }

    public void setFood(String fd) {
        food = fd;
    }

    public void setHungry(int hg) {
        hungry = hg;
    }

    public void setLocation(String lc) {
        location = lc;
    }

    public void setBoundaries(String bd) {
        boundaries = bd;
    }

    void inform() {
        System.out.println("Ini adalah gambar hewan " + picture + 
                " \ndengan jenis makanan " + food + 
                " \ndengan tingkat kelaparan " + hungry + 
                " \ndengan koordinat lokasi " + location +
                " \ndan dapat berkeliaran pada wilayah " + boundaries);
    }

    //method-method untuk objek
    void makeNoise() {
        System.out.println("The Animal is making noise ");
    }

    void eat() {
        System.out.println("The Animal is eating ");
    }

    void sleep() {
        System.out.println("The Animal is sleeping ");
    }

    void roam() {
        System.out.println("The Animal is roaming ");
    }
}

//famiili kucing
class Feline extends Animal {

    public Feline(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void roam() {
        System.out.println("THE ANIMAL WITH THE FAMILY \"cat\" (FELINE) is EXPLORING");
    }
}

//famili anjing
class Canine extends Animal {
    
    public Canine(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void roam() {
        System.out.println("THE ANIMAL WITH THE FAMILY \"dog\" (CANINE) is EXPLORING");
    }
}

class Lion extends Feline {

    public Lion(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void makeNoise() {
        System.out.println("THE LION IS ROARING");
    }

    @Override
    void eat() {
        System.out.println("THE LION IS EATING");
    }
}

class Cat extends Feline {

    public Cat(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void makeNoise() {
        System.out.println("THE CAT IS MEOWING");
    }

    @Override
    void eat() {
        System.out.println("THE CAT IS EATING");
    }
}

class Tiger extends Feline {

    public Tiger(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void makeNoise() {
        System.out.println("THE TIGER IS ROARING");
    }

    @Override
    void eat() {
        System.out.println("THE TIGER IS EATING ");
    }
}

class Hippo extends Animal{

    public Hippo(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void makeNoise() {
        System.out.println("ngook ngook ngook ngook nguuuk");
    }

    @Override
    void eat() {
        System.out.println("THE HIPPO IS EATING");
    }
}

class Dog extends Canine {

    public Dog(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void makeNoise() {
        System.out.println("THE DOG IS BARKING");
    }

    @Override
    void eat() {
        System.out.println("THE DOG IS EATING");
    }
}

class Wolf extends Canine {

    public Wolf(String pr, String fd, int hg, String lc, String bd) {
        super(pr, fd, hg, lc, bd);
    }

    @Override
    void makeNoise() {
        System.out.println("THE WOLF IS ROARING");
    }

    @Override
    void eat() {
        System.out.println("THE WOLF IS EATING BONE");
    }
}

public class Hewan {

    public static void main(String[] args) {

        Animal li1 = new Lion("Lion.JPEG", "Meat", 8,"(8,4)", "450m x 764m");
        li1.inform();
        li1.makeNoise();
        li1.roam();
        li1.eat();
        li1.sleep();
        
        System.out.println("");   
        
        Animal ca1 = new Cat("Cat.JPEG", "Meat", 3, "(11,2)", "164m x 145m");
        ca1.inform();
        ca1.makeNoise();
        ca1.roam();
        ca1.eat();
        ca1.sleep();
        
        System.out.println(""); 
        
        Animal ti1 = new Tiger("Tiger.JPEG", "Meat", 9, "(2,7)", "672m x 840m");
        ti1.inform();
        ti1.makeNoise();
        ti1.roam();
        ti1.eat();
        ti1.sleep();
        
        System.out.println(""); 
        
        Animal hi1 = new Hippo("Hippo.JPEG", "Meat and Grass", 7, "4,2)", "120m x 115m");
        hi1.inform();
        hi1.makeNoise();
        hi1.roam();
        hi1.eat();
        hi1.sleep();
        
        System.out.println("");
        
        Animal do1 = new Dog("Dog.JPEG", "Meat", 5, "(9,7)", "92m x 40m");
        do1.inform();
        do1.makeNoise();
        do1.roam();
        do1.eat();
        do1.sleep();
        
        System.out.println(""); 
        
        Animal wo1 = new Wolf("Wolf.JPEG", "Meat", 3, "8,6)", "138m x 225m");
        wo1.inform();
        wo1.makeNoise();
        wo1.roam();
        wo1.eat();
        wo1.sleep();
        
        System.out.println("");
    }
}
