package SelfNote.Week3.Note_1_StaticKeyword;

  // static = modifier. A single copy of a variable / method is created a shared.
  //          The class "owns" the static member.

  // 簡單而言，static 可以是公共設施的物品，而 instance 是每個 Object 身上有的特性

public class Main {

  public static void main(String[] args) {

    Friend friend_1 = new Friend("Tommy");
    Friend friend_2 = new Friend("Mary");
    
    Friend.displayFriendNumber();
    // System.out.println(friend_1.numberOfFriends); <= Legal but not recommended

  }


  
}
