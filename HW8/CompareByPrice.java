package HW8;

import java.util.Comparator;

public class CompareByPrice implements Comparator {
    @Override
    public int compare (Object ob1, Object ob2){
        Book book1 = (Book) ob1;
        Book book2 = (Book) ob2;
        if (book1.getPrice() > book2.getPrice()) return -1;
        if (book1.getPrice() < book2.getPrice()) return 1;
        return 0;
    }
}
