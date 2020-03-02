package HW10;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        System.out.println("Read books list from file: ");

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
        } catch (InputMismatchException e) {
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

        System.out.println("Books list sorted by price (anonymous class): ");
        Books sortedBooksPrice = new Books();
        sortedBooksPrice.sortedByPriceAnonymousClass();
        System.out.println();

        System.out.println("Books list sorted by author (anonymous class): ");
        Books sortedBooksAuthor = new Books();
        sortedBooksAuthor.sortedByAuthorAnonymousClass();
        System.out.println();

        System.out.println("Books list sorted by publishing house (anonymous class): ");
        Books sortedBooksPublishingHouse = new Books();
        sortedBooksPublishingHouse.sortedByPublishingHouseAnonymousClass();
        System.out.println();

        System.out.println("Add book in file: ");
        Book bookAdd = new Book(9, "Murder on the Orient Express", "Agatha Christie",
                "William Morrow Paperbacks", 2011, 288, 125);

        SaveReadBooks addBook = new SaveReadBooks();
        addBook.addObject(bookAdd);
        System.out.println();

    }
}
