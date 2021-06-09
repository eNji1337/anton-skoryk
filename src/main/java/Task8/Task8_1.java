package Task8;

import java.util.*;

public class Task8_1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "One", "Two", "One");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Initial array");
        System.out.println(words);
        System.out.println("Unique words");
        System.out.println(unique);
        System.out.println("Repeated words");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
