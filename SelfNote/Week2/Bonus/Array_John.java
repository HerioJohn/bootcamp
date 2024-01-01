package SelfNote.Week2.Bonus;

public class Array_John {

  public static void main(String[] args) {
    
    String[] items = new String[4];

    items[0] = "Hammer";
    System.out.println(items[0]);

    // If you already know what is in the array

    String[] food = {"Sushi", "Pizza", "Hamburger", "Steak", "BobaTea"};

    for (int i = 0; i < food.length; i ++) {
      System.out.println(food[i]);
    }

    // using for - each

    for (String f : food) {
      System.out.println(f);
    }


  }
  
}
