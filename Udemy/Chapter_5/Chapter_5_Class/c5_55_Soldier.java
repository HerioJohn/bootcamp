package Udemy.Chapter_5.Chapter_5_Class;

public class c5_55_Soldier {
  
  // encapsulation 
  // (以下的 field 的 scope（變數有效範圍）為整個 c5_55_Soldier Class)
  private int healthPt = 0;
  private int defensePt = 0;
  private int attackPt = 0;
  private static String race = "Human";

  // ------ Constructor ------

  public c5_55_Soldier() {

  }

  public c5_55_Soldier(int healthPt, int defensePt, int attackPt){

  }

  // ----- Getter ------

  public void getHealthPt(){
    System.out.println(this.healthPt);
  }

  public void getDefensePt(){
    System.out.println(this.defensePt);
  }

  public void getAttackPt(){
    System.out.println(this.attackPt);
  }

  // ----- Setter ------

  public void setHealthPt(int newHealthPt) {
    this.healthPt = newHealthPt;
  }

  public void setDefensePt(int newDefensePt) {
    this.defensePt = newDefensePt;
  }

  public void setAttackPt(int newAttackPt) {
    this.attackPt = newAttackPt;
  }

  public void editAllState(int newHealthPt, int newDefensePt, int newAttackPt) {
    this.healthPt = newHealthPt;
    this.defensePt = newDefensePt;
    this.attackPt = newAttackPt;
  }

  // ----- Method ------

  public void checkState(){
    System.out.println("------ Check State Begining! -----");
    System.out.println("Health Point: " + this.healthPt);
    System.out.println("Defense Point: " + this.defensePt);
    System.out.println("Attack Point: " + this.attackPt);
    System.out.println("----- Check State is Done! -----");
  }

  public void printOutRace(){
    System.out.println("this is a " + this.race);
  }

}
