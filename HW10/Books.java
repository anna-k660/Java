package HW10;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Books implements Serializable {
    SaveReadBooks booksList = new SaveReadBooks();
    private Book[] books = booksList.readBooks();

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "books=" + Arrays.toString(books);
    }

    public void showBooks() {
        for (Book element : books) {
            System.out.println(element);
        }
    }

    public Book[] searchAuthor(String author) {
        Book[] sortAuthor = new Book[books.length];
        int count = 0;
        for (Book element : books) {
            if (element.getAuthor() == author) {
                sortAuthor[count] = element;
                count++;
            }
        }
        return Arrays.copyOf(sortAuthor, count);
    }

    public Book[] searchBooks(int year) {
        Book[] sortYear = new Book[books.length];
        int count = 0;
        for (Book element : books) {
            if (element.getYearOfPublishing() > year) {
                sortYear[count] = element;
                count++;
            }
        }
        return Arrays.copyOf(sortYear, count);
    }

    public void showSortedBooksByPrice() {
        Arrays.sort(books, new CompareByPrice());
        for (Book element : books) {
            System.out.println(element);
        }
    }

    public void showSortedBooksByAuthor() {
        Arrays.sort(books, new CompareByAuthor());
        for (Book element : books) {
            System.out.println(element);
        }
    }

    public void showSortedBooksByPublishingHouse() {
        Arrays.sort(books, new CompareByPublishingHouse());
        for (Book element : books) {
            System.out.println(element);
        }
    }

    public void sortedByPriceAnonymousClass() {
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                if (book1.getPrice() > book2.getPrice()) return -1;
                if (book1.getPrice() < book2.getPrice()) return 1;
                return 0;
            }
        });
        for (Book element : books) {
            System.out.println(element);
        }
        ;
    }

    public void sortedByAuthorAnonymousClass() {
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String book1 = ((Book) o1).getAuthor();
                String book2 = ((Book) o2).getAuthor();
                return book1.compareTo(book2);
            }
        });
        for (Book element : books) {
            System.out.println(element);
        }
    }

    public void sortedByPublishingHouseAnonymousClass() {
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String book1 = ((Book) o1).getPublishingHouse();
                String book2 = ((Book) o2).getPublishingHouse();
                return book1.compareTo(book2) * (-1);
            }
        });
        for (Book element : books) {
            System.out.println(element);
        }
    }

}
