package HW10;

import java.io.*;

public class SaveReadBooks implements Serializable {
    String filePath = "D:\\books.txt";
    Book[] books = new Book[0];
    public Book[] readBooks() {
        String filePath = "D:\\books.txt";

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            int booksCount = ois.readInt();
            books = new Book[booksCount];

            for (int i = 0; i < booksCount; i++) {
                books[i] = (Book) ois.readObject();
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }


    public void addObject(Book book) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(book);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
