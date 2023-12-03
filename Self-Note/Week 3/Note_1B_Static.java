public class Note_1B_Static {

  // 需要配合 Friend.java

  public static void main(String[] args) {

    Friend friend = new Friend("Tommy");
    Friend friend2 = new Friend("Mary");
    Friend friend3 = new Friend("Peter");

    Friend.displayFriends(); // Replacement of System.out.println("The Friend count is: " + Friend.numberOfFriend);



    
  }
  
}
