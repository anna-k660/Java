package HW10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteBooks {
    public static void main(String[]args){
        String filePath = "D:\\books.txt";
        Book[] books = new Book[]{
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
                new Book(5, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling",
                        "Scholastic Inc", 2004,
                        310, 160)
        };
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(books.length);
            for ( int i = 0; i< books.length; i++){
                oos.writeObject(books[i]);
            }
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
