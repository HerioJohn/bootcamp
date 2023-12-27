import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args){

        List<String> stack = new Stack<>();

        Stack<String> ss = new Stack<>();
        ss.push("ABC");
        ss.push("IJK");
        // pop -> get the last element

        System.out.println(ss.pop());  // IJK
        System.out.println(ss.pop());  // ABC
        // System.out.println(ss.pop());  Error, we can't pop an empty stack

        // 2. You can access the middle element
        ss.push

        // 3. Slow
        // Stack

        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ss.push("A");
        }
        long end = System.nanoTime();
        System.out.println("Stack.push() -> " + (end - start));

        start = System.nanoTime();
        ArrayList<String> as = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            as.add("A");
        }
        end = System.nanoTime();
        System.out.println("ArrayList.add() -> " + (end - start));
        
    }
}
