

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) throws Exception {
        
        List<String> strings = new ArrayList<>(List.of("hello", "world", "vincent", "oscar"));
        List<String> result = new ArrayList<>();
        // filter out string withh length <= 5,

        for (String s : strings) {
            if (s.length() <= 5) {
                result.add(s);
            }
        }

        System.out.println(result);

        result = strings.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
        System.out.println(result);

    }
}
