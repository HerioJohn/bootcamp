public class PersonDemo {

  public static void main(String[] args) {
    
    String str = new String ("hello");

    // Call Person's constructor
    Person p1 = new Person(); // p1's name -> null, p1's age = 0

    Person p1 = new Person();
    p1.setName("John");

    Person p2 = new Person();
    p2.setName("Peter");

    Person p3 = p1;
    p3.setName("Mary");

    Person p4 = new Person();
    p4.setName("Jenny");

    System.out.println(p1.getName()); //Mary
    System.out.println(p2.getName()); //Peter
    System.out.println(p3.getName()); //Mary
    System.out.println(p4.getName()); //Jenny



  }
  
}
