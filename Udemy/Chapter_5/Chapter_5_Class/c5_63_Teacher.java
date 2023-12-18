package Udemy.Chapter_5.Chapter_5_Class;

public class c5_63_Teacher extends c5_63_People {

  public c5_63_Teacher(String name, int age, String address, String subject) {
    super(name, age, address); // If child class constructor doesn't invoke supper(), it will run parent class's default constructor
    this.subject = subject;
  }

  private String subject;

  public void teaching() {
    super.printHello(); // the keyword super is not a must, but good when working with other developer!
    System.out.println(this.name + " is Teaching " + this.subject + "...");
  }

}
