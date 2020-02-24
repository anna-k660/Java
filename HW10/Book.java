package HW10;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

public class Book implements Serializable {
    public int ID;
    public String title;
    public String author;
    public String publishingHouse;
    public int yearOfPublishing;
    public int numberOfPages;
    public int price;

    public Book(int ID, String title, String author, String publishingHouse,
                int yearOfPublishing, int numberOfPages, int price) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book " +
                " ID: " + ID +
                ", title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", publishingHouse: '" + publishingHouse + '\'' +
                ", yearOfPublishing: " + yearOfPublishing +
                ", numberOfPages: " + numberOfPages +
                ", price=" + price +
                '}';
    }


}

