package mahasiswa;

/**
 * Wafiy Anwarul Hikam / 220605110022 / Praktikum PBO / F
 *
 * @author ACER A515-45-R3RR
 */
public class Books {

    String title;
    String author;
}

class BooksTestDrive {

    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        myBooks[0].title = "Outlier";
        myBooks[1].title = "Muhammad Al Fatih 1453";
        myBooks[2].title = "Felix Siau";
        myBooks[0].author = "Mallcom Gladwell";
        myBooks[1].author = "Prof. Dr. H. Quraish Syihab";
        myBooks[2].author = "Tere Liye";
        
        while (x < myBooks.length) {            
            System.out.print(myBooks[x].title);
            System.out.print(" karya ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}