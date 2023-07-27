import java.util.Scanner;

public class scanner {
    public static void main(String[]args){
        String name;
        String age;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter your name! : ");
        name = input.nextLine();

        System.out.print("Enter your age! : ");
        age = input.nextLine();    

        System.out.println("Your name is: " + name + "\nYour age is: " + age);
    }
}
