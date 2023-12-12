package Udemy.Chapter_5.Chatper_5_Main;

import Udemy.Chapter_5.Chapter_5_Class.c5_62_Robot;

public class c5_62_RobotMain {

  public static void main(String[] args) {

      c5_62_Robot r = new c5_62_Robot("Bob", 300);

      // Use Setter Method
      r.setName("Mary");
      System.out.println(r.getName());
      r.setYearMade(500);
      System.out.println(r.getYearMade());
    
  }


}
