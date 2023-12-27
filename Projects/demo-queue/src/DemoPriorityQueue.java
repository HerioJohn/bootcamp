package src;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static void main(String[] args) {
    Queue<String> qs = new PriorityQueue<>();

    qs.add("hello"); 
    qs.add("a");
    qs.add("x");

    System.out.println(qs);
  }
  
}
