package hw11;

import java.util.HashMap;
import java.util.Map;

public class VocabularyMap {
    public static void main(String[] args) {
        String[] newPairs = addData();
        mapWords(newPairs);
        getElements();
    }

    static void getElements() {
        HashMap<String, String> newMap = new HashMap<>();
        newMap = mapWords(addData());
        String element = newMap.get("movie");
        System.out.println(element);
    }

    static HashMap<String, String> mapWords(String[] newPairWords) {
        HashMap<String, String> wordTranslate = new HashMap<String, String>();
        wordTranslate.put(newPairWords[0], newPairWords[1]);
        wordTranslate.put("book", "книга");
        wordTranslate.put("green", "зеленый");
        for (Map.Entry<String, String> entry : wordTranslate.entrySet()) {
            System.out.println((entry.getKey() + " - " + entry.getValue()));
        }
        return wordTranslate;
    }

    static String[] addData() {
        String[] keyValue = {"movie", "фильм"};
        return keyValue;
    }

}



