package SelfNote.Week5;

import java.util.Queue;
import java.util.LinkedList;

public class Note_2_Queue{
	
	public static void main(String[] args) {
		
		// *****************************************************
		
		// Queue = FIFO data structure. First-In First-Out
		//		   A collection designed for holding elements prior to processing
		//		   Linear data structure
		
		//        add = enqueue, offer()
		//        remove =  dequeue, poll()
		
		// Where are queues useful?
		
		// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
		
		// *****************************************************
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		//System.out.println(queue.isEmpty()); // false
		//System.out.println(queue.size()); // 4
		//System.out.println(queue.contains("Harold")); // true
		
		System.out.println(queue.peek()); // Karen
		System.out.println(queue); // [Karen, Chad, Steve, Harold] 
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
					
		System.out.println(queue); // []
		
	}
}