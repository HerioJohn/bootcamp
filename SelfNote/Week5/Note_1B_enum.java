package SelfNote.Week5;

public class Note_1B_enum {

  public static void main(String[] args) {
    
    // we can not use "new" for enum

    Note_1_daysofTheWeek day = Note_1_daysofTheWeek.THURSDAY;

    if (day == Note_1_daysofTheWeek.THURSDAY) {
      System.out.println("Yay it is almost Friday!");
    }



  }
  
}
