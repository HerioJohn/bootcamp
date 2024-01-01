package SelfNote.Week5;

import java.util.LinkedList;

public class Note_4_LinkedList{
	
 public static void main(String[] args) {
  // *****************************************************
  
  // LinkedList =  Nodes are in 2 parts (data + address)
  //               Nodes are in non-consecutive memory locations
  //               Elements are linked using pointers
            
  //    advantages?
  //    1. Dynamic Data Structure (allocates needed memory while running)
  //    2. Insertion and Deletion of Nodes is easy. O(1) 
  //    3. No/Low memory waste
  
  //    disadvantages?
  //    1. Greater memory usage (additional pointer)
  //    2. No random access of elements (no index [i])
  //    3. Accessing/searching elements is more time consuming. O(n)

  // small data set:                              LinkedList = BAD
  // large data set + lots of searching:          LinkedList = BAD
  // large data set + lots of inserting/deleting: LinkedList = GOOD 
  
  //    uses?
  //    1. implement Stacks/Queues
  //    2. GPS navigation
  //    3. music playlist
  //
  
  // *****************************************************

LinkedList<String> linkedList = new LinkedList<String>();
		
    /* 
		// LinkedList as a Stack
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop(); // Remove First Node
		*/	

		// LinkedList as a Queue
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		//linkedList.poll(); // Remove First Node
		
		linkedList.add(4, "E");
		System.out.println(linkedList.indexOf("F")); // 5
		
		
		System.out.println("The First Node is: " + linkedList.peekFirst());
		System.out.println("The Last Node is: " + linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("Z");
		//String first = linkedList.removeFirst();
		//String last = linkedList.removeLast();
		
		System.out.println(linkedList); // [0, A, B, C, D, E, F, Z]
		
	}
}