package Udemy.Chapter_5.Chapter_5_Class;

public class c5_63_Student extends c5_63_People {

  private String name;
  private String age;
  private String address;
  private int grades;

  public c5_63_Student(String name, int age, String address, int grades) {
    super(name,age,address);
    this.grades = grades;
  }

  public void learn() {
    System.out.println(this.name + " is Learning!");
  }
  
}
