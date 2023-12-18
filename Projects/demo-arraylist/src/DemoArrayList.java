import java.util.ArrayList;
import java.util.Collection;

public class DemoArrayList {
    public static void main(String[] args) throws Exception {

        ArrayList<String> ss = new ArrayList<String>(); // still Okay

        // After 1.7
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ABC");
        strings.add("IJK");
        strings.add("XYZ");
        System.out.println(strings.size());

        // for-each
        for (String s : strings) {
            System.out.println(s);
        }
        
        strings.remove(2);
        System.out.println(strings);
        strings.remove("ABC");
        System.out.println(strings);

        ArrayList<String> anotherList = new ArrayList <> (List.of("1234","2345","0000"));
        strings.addAll(anotherList);
        System.out.println(strings);

        // removeAll
        ArrayList<String> removedList = new ArrayList<>(List.of("2345","IJK"));
        strings.removeAll(removedList);
        System.out.println(strings);

        strings.set(1, "DDD");
        System.out.println(strings);

        System.out.println(strings.subList(1,2));

        System.out.println(strings.indexOf("0000")); // 2

        // List<> is an Interface implemented by ArrayList.class
        List<String> strings2 = new ArrayList<>();
        strings2.add("ABC");
        strings2.remove(0);
        System.out.println(strings2);
    }
}
