package Udemy.Chapter_5.Chapter_5_Class;

public class c5_63_People{

  protected String name;
  protected int age;
  protected String address;

  // default / empty constructor
  public c5_63_People () {
    this.name = "default_people_name";
    this.age = 0;
    this.address = "Earth";
  }

  public c5_63_People(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;

  }

  public void checkName() {
    System.out.println(this.name);
  }

  public void walk() {
    System.out.println(this.name + " is Walking!");
  }

  public void sleep() {
    System.out.println(this.name + " is " + "Sleeping!");
  }  

  public void printHello() {
    System.out.println("~~~~ [Hello from People Class!] ~~~~");
  }

  
  
}
