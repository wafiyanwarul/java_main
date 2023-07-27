package practicumpbo.variable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A515-45-R3RR
 */
public class HeapQuiz {
    int id = 0;
    public static void main(String[] args) {
    
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String[] islands = new String[4];
        islands[0] = "Kangean";
        islands[1] = "Bangka Belitung";
        islands[2] = "Natuna";
        islands[3] = "Biak";

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            System.out.print("Pulau = ");
            System.out.println(islands[ref]);
            y++;
        }
  
        
        
    }
}
