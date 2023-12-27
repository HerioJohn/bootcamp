import java.util.List;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) throws Exception {
        Set<String> ss = new HashSet<>();
        List<String> ls = new ArrayList<>();
        ls.add("A");
        ls.add("B");
        ls.add("C");

        for (String s : ls) {
            System.out.println(ss.add(s));
        }

        System.out.println(ss.size());
    }
}
