package com.epam.HW6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Book list: ");
        Books books = new Books();
        books.showBooks();
        System.out.println();

        System.out.println("Enter books  year of publishing");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        Books sortYear = new Books();
        sortYear.setBooks(books.searchBooks(year));
        sortYear.showBooks();
        System.out.println();

        System.out.println("Search author books");
        scan.nextLine();
        String authorBook = scan.nextLine();
        Books  authorSortList = new Books();
        authorSortList.setBooks(books.searchAuthor(authorBook));
        authorSortList.showBooks();
        
    }
}
