package HW8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        System.out.println("Book list: ");
        Books books = new Books();
        books.showBooks();
        System.out.println();

        System.out.println("Search books by year of publishing");
        System.out.println("Enter books  year of publishing");
        Scanner scan = new Scanner(System.in);
        try {
            int year = scan.nextInt();
            Books sortYear = new Books();
            sortYear.setBooks(books.searchBooks(year));
            sortYear.showBooks();
        } catch (InputMismatchException e){
            System.out.println("Type number not text");
        }

        System.out.println();


        System.out.println("Search books by year of author");
        System.out.println("Search author books");
        scan.nextLine();
        String authorBook = scan.nextLine();
        Books authorSortList = new Books();
        authorSortList.setBooks(books.searchAuthor(authorBook));
        authorSortList.showBooks();


        System.out.println("Book list sorted by price: ");
        Books booksSortedByPriceDescending = new Books();
        booksSortedByPriceDescending.showSortedBooksByPrice();
        System.out.println();

        System.out.println("Books list sorted by author: ");
        Books booksSortedByAuthor = new Books();
        booksSortedByAuthor.showSortedBooksByAuthor();
        System.out.println();

        System.out.println("Books list sorted by publishing house: ");
        Books booksSortedByPublishingHouse = new Books();
        booksSortedByPublishingHouse.showSortedBooksByPublishingHouse();
        System.out.println();
    }
}
