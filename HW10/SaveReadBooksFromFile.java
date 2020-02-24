package HW10;

import java.io.*;

public  class SaveReadBooksFromFile {
    String filePath = "D:\\books.txt";
    public void addBookMethod(Book bookAdd) {
        try {

            DataOutputStream book = new DataOutputStream(new FileOutputStream(filePath, true));

            book.writeInt(bookAdd.ID);
            book.writeUTF(bookAdd.title);
            book.writeUTF(bookAdd.author);
            book.writeUTF(bookAdd.publishingHouse);
            book.writeInt(bookAdd.yearOfPublishing);
            book.writeInt(bookAdd.numberOfPages);
            book.writeInt(bookAdd.price);
            book.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void readBookMethod (){
        try {
            DataInputStream inputBook = new DataInputStream(new FileInputStream(filePath));

            System.out.println("ID: " + inputBook.readInt() + ", Title: " + inputBook.readUTF() +
                    ", Author: " + inputBook.readUTF() + ", Publishing House: " + inputBook.readUTF() +
                    ", Year Of Publishing: " + inputBook.readInt() + ", Number of pages: " +
                    inputBook.readInt() + ", Price: " + inputBook.readInt());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
