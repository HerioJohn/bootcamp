package Udemy.Chapter_5.Chatper_5_Main;

import Udemy.Chapter_5.Chapter_5_Class.c5_63_Student;
import Udemy.Chapter_5.Chapter_5_Class.c5_63_Teacher;

public class c5_63_Main {

  public static void main(String[] args) {
    
    c5_63_Teacher t1 = new c5_63_Teacher("Mary", 25, "HongKong", "Math");
    c5_63_Teacher t2 = new c5_63_Teacher("Tommy", 45, "England", "English");

    c5_63_Student s1 = new c5_63_Student("Peter", 15, "HongKong", 75);


    t1.teaching();
    t2.sleep();

    s1.checkName();
    s1.learn();
    s1.walk();
    s1.sleep();

  }
  
}
