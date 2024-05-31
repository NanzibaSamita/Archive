//import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {

        Clothes c1 = new Clothes("Shirt", "XL", 2, 1000, 1234, 36);
        Book b1 = new Book("Looking for Alaska","Original",1,300,3211,
                "Anton","Hoover","Science");

        c1.displayClotheinfo();
        b1.displayBookinfo();


    }
}