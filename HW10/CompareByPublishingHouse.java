package HW10;

import java.util.Comparator;

public class CompareByPublishingHouse implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String book1 = ((Book)o1).getPublishingHouse();
        String book2 = ((Book)o2).getPublishingHouse();
        return book1.compareTo(book2);
        }
    }


