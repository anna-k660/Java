package HW10;

import java.util.Comparator;

public class CompareByAuthor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String book1 = ((Book)o1).getAuthor();
        String book2 = ((Book)o2).getAuthor();
        return book1.compareTo(book2);
    }
}
