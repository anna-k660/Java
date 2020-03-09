package hw11;

import java.util.*;

public class ListSetTask1 {
    public static void main(String[] arg) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add((int) (10 + Math.random() * 10));
        }
        Set set = new HashSet();
        set.addAll(list);

        CopyListTask1 newList = new CopyListTask1();
        newList.createCopyList(list);
        newList.createCopySet(set);
    }
}

