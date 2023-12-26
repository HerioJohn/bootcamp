package SelfNote.Week3.Note_1_StaticKeyword;

public class Friend {

  String name;
  static int numberOfFriends;

  Friend() { // Empty Constructor

  }

  Friend(String name) { // Constructor
    this.name = name;
    numberOfFriends++;
  }

  public void setFriendName(String newName) {
    this.name = newName;
  }

  public static void displayFriendNumber() {
    System.out.println("The current amount of friend is: " + numberOfFriends);
  }
  
}
