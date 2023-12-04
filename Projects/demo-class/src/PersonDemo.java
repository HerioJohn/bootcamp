public class PersonDemo {

  public static void main(String[] args) {

    // Call Person's constructor
    Person p1 = new Person("John"); // p1's name -> null, p1's age = 0
    //p1.setFirstName("John");

    Person p2 = new Person("Peter","Lee");
    //p2.setFirstName("Peter");
 
    Person p3 = p1;
    //p3.setFirstName("Mary");

    Person p4 = new Person("Zoey","Kim");
    //p4.setFirstName("Jenny");

    Person p5 = new Person("Ken","Wong");
    System.out.println("p5's Full Name is: " + p5.getFullName()); // Ken Wong
    System.out.println("p5's Full Name is: " + p5.getFullName(true)); // KEN WONG
    System.out.println("p5's Full Name is: " + p5.getFullName(false)); // ken wong

    //System.out.println(p1.getFirstName()); //John
    //System.out.println(p2.getFirstName()); //Peter
    //System.out.println(p3.getFirstName()); //Mary
    //System.out.println(p4.getFirstName()); //Jenny





  }
  
}
