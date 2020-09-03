package three;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Tom", "T0m", "Harry", "Test", "tesT", "test", "test", "Tom"};
        List<String> batchOfWords = Arrays.asList(words);
        System.out.println(batchOfWords);
        Set<String> uniqueWords = new HashSet<>(batchOfWords);
        System.out.println(uniqueWords);

        Map<String, Integer> occurrences = new HashMap<>();

        for (String w : batchOfWords) {
            if (occurrences.containsKey(w)) {
                Integer occurrence = occurrences.get(w);
                occurrence++; // occurrence += 1; occurrence = occurrence + 1;
                occurrences.put(w, occurrence);
            } else {
                occurrences.put(w, 1);
            }
        }

        System.out.println(occurrences);

        System.out.println(new PhoneBook().get("test").isEmpty());
    }
}
