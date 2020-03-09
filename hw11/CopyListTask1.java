package hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CopyListTask1 {
    public void createCopyList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Object element = list.get(i);
            System.out.print(element.toString() + " ");
        }
        System.out.println();
    }

    public void createCopySet(Set<Integer> set) {
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
