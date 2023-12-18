public class Friend {

  static int numberOfFriend; // <- 因為是static，所有 Friend Object 都共享這個變數 ; Class Friend 擁有這個變數

  String name; // 非 static，每個 Friend Object 有自己的 name 

  Friend(String name){
    this.name = name;
    numberOfFriend++;
  }

  static void displayFriends() {
    System.out.println("I have " + numberOfFriend + " friend(s)!");
  }
  
}
