package SelfNote.Week6.Note_1_Generics;

// <T> means type
public class Printer <T>{

  T thingToPrint;

  public Printer() {

  }

  public Printer(T thingToPrint) {
    this.thingToPrint = thingToPrint;
  }

  public void print() {
    System.out.println(thingToPrint);
  }
  
}
