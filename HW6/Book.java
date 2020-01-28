package com.epam.HW6;

public class Book {
    private int ID;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
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

    public void viewBook(){
        System.out.println("Book ID: " + ID +
                            " Title: " + title +
                            " Author: " + author +
                            " Publishing House: " + publishingHouse +
                            " Year Of Publishing " + yearOfPublishing +
                            " Number Of Pages " + numberOfPages +
                           " Price: " + price );
    }
}
