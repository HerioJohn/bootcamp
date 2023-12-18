package SelfNote.Week3;

public class Note_1_Static {

  // 需要配合 Cat.java 

  public static void main(String[] args) {

    System.out.println(Cat.getCatCount());
    
    Cat myCat = new Cat();
    myCat.meow();
    myCat.name = "Tommy";
    myCat.age = 8;
    myCat.livesRemaining = 9;
    System.out.println(Cat.getCatCount());
    System.out.println(myCat.getCatCount()); //合法但不應該

  }
  
}
