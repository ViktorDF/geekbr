package three;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> book = new HashMap<>();

    public void add(String name, String number) {
        if (book.containsKey(name)) {
            book.get(name).add(number);
        } else {
            HashSet<String> numbers = new HashSet<>();
            numbers.add(name);
            book.put(name, numbers);
        }
    }

    public Set<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        }
        return new HashSet<>();
    }
}
