package Udemy.Chapter_5.Chapter_5_Class;

public class c5_62_Robot {

  public String name;
  public int yearMade;

  public c5_62_Robot(String name, int yearMade){
    this.name = name;
    this.yearMade = yearMade;
  }

  // setter method
  public void setName(String newName) {
    this.name = name;
  }

  public void setYearMade(int newYearMade) {
    if (yearMade < 1990) 
      System.out.println("Year made cannot be earlier than 1990!");
    else if (yearMade > 2022)
      System.out.println("Year made cannot be greater than 2022!");
    else
      this.yearMade = yearMade;

  }

  // getter method
  public String getName() {
    return this.name;
  }

  public int getYearMade() {
    return this.yearMade;
  }


  
}
