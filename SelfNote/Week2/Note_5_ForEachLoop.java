public class Note_5_ForEachLoop {

  // for-each = traversing technique to iterate through the elements in an array / collection
  //            less steps, more readable
  //            but less flexible

  public static void main(String[] args) {

  String[] animals = {"cat", "dog", "rat", "bird"};

  for(String i : animals) { // : represent in
    System.out.println("I found an animal!"); // print 4 times
  }
    
  }
 
}
