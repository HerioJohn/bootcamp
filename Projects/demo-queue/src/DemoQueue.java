import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Deque;;

public class DemoQueue {
    public static void main(String[] args) throws Exception {

        List<String> ls = new LinkedList<>();
        ls.add("ABC");
        ls.add("IJK");

        String result = ls.get(0);
        ls.remove(0);

        // List vs Queue
        // 1. We cannot access the middle elements in the queue. Just get the obbject from the queue head.
        // 2. Queue is FIFO (First in First out)

        Queue<String> qs = new LinkedList<>();
        qs.add("ABC");
        qs.add("IJK");

        System.out.println(qs.poll()); //ABC
        System.out.println(qs.poll()); //IJK

        System.out.println(qs.size()); // 0

        Deque<String> ds = new LinkedList<>();
        ds.add("ABC"); // same as addLast();
        ds.add("IJK"); // same as addLast()

        ds.add("Last"); // addLast();
        ds.add("First"); // addFirst();

        // pollLast
        System.out.println(ds.pollLast());

        System.out.println(ds.pollFirst());

        System.out.println(ds.removeLast()); 

        System.out.println(ds.removeFirst());

        System.out.println(ds.offer(result));


        
    }
}
