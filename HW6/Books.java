package com.epam.HW6;

import java.util.ArrayList;
import java.util.Arrays;

public class Books {
    private Book [] books = new Book[]{
            new Book(1, "The Da Vinci Code", "Dan Brown",
                    "Doubleday", 2003,
                    350, 150),
            new Book(2, "Origin", "Dan Brown",
                    "Bantam Books ", 2017,
                    400, 200),
            new Book(3, "Wuthering Heights", "Emily Brontë",
                    "Penguin Books", 2008,
                    420, 110),
            new Book(4, "All the Light We Cannot See", "Anthony Doerr",
                    "Scribner ", 2014,
                    510, 220),
            new Book(5, "Harry Potter and the Sorcerer's Stone", " J.K. Rowling",
                    "Scholastic Inc", 2004,
                    310, 160)
    };


    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void showBooks(){
        for (Book element: books) {
            element.viewBook();
        }
    }

    public Book [] searchAuthor (String author){
        Book [] sortAuthor = new Book[books.length];
        int count = 0;
        for (Book element : books) {
            if (element.getAuthor() == author){
                sortAuthor[count] = element;
                count++;
            }
        }
        return Arrays.copyOf(sortAuthor, count);
    }

    public Book [] searchBooks (int year){
        Book [] sortYear = new Book [books.length];
        int count = 0;
        for (Book element: books) {
            if(element.getYearOfPublishing() > year){
                sortYear[count] = element;
                count++;
            }
        }
        return Arrays.copyOf(sortYear,count);
    }
}
