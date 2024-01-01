package SelfNote.Week5;

import java.util.Stack;

public class Note_3_Stack{
	
	public static void main(String[] args) {
		
		// *****************************************************
		
		// stack = LIFO data structure. Last-In First-Out
		//               stores objects into a sort of "vertical tower"
		//		  push() to add objects to the top
		//		  pop() to remove objects from the top
		
		// uses of stacks?
		// 1. undo/redo features in text editors
		// 2. moving back/forward through browser history
		// 3. backtracking algorithms (maze, file directories)
		// 4. calling functions (call stack)
		
		// *****************************************************
		
		Stack<String> stack = new Stack<String>();
		
		//System.out.println(stack.empty());
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		
    System.out.println(stack); // [Minecraft, Skyrim, DOOM, Borderlands, FFVII]

		String myFavGame = stack.pop(); // Remove the Top One

		System.out.println(stack.peek());	// Borderlands

		System.out.println(stack.search("Fallout76")); // -1 (Not found)

    System.out.println(stack.search("Skyrim")); // 3

    System.out.println(stack); // [Minecraft, Skyrim, DOOM, Borderlands]
		
	}
}