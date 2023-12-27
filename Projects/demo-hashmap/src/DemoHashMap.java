import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) throws Exception {
        
        Map<String, Integer> ageBook = new HashMap<>();

        ageBook.put("John", 20);
        ageBook.put("John", 13);
        ageBook.put("Mary", 3);

        System.out.println(ageBook.size());

        for (Map<K,V>.Entry<String, Integer> entry : ageBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(ageBook.get("Mary"));
        System.out.println(ageBook.get("John"));
        System.out.println(ageBook.get("John"));

        Map<Integer, String> winnerBook = new HashMap<>();
        winnerBook.put(1,"Tommy");
        winnerBook.put(1, "Peter");
        winnerBook.put(2, "Sally");
        winnerBook.put(3, "Jenny");

        


















        // Map<String, BOok>
        Map<String, Book> bookMap = new HashMap<>();
        // put Book
        bookMap.put("John", new Book ("ABC"));
        bookMap.put("John", new Book ("IJK"));
        bookMap.put("Jenny", new Book ("XYZ"));

        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }
        // get Book name
        System.out.println(bookMap.get("Jenny").getName());



    }
}
