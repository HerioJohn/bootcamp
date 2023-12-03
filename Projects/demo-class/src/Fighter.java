public class Fighter {

  private String name;

  private int health;

  private int defensive;

  private int attack;

  private double speed;

  public Fighter() {

  }

  // Name

  public void setName(String x){
    this.name = x;
  }

  public String getName(){
    return this.name;
  }

  // Health

  public void setHealth(int x){
    this.health = x;
  }

  public int getHealth(){
    return this.health;
  }

  // Defensive

  public void setDefensive(int x){
    this.defensive = x;
  }

  public int getDefensive(){
    return this.defensive;
  }

  // Attack
  public void setAttack(int x){
    this.attack = x;
  }

  public int getAttack(){
    return this.attack;
  }

  // Speed
  public void setSpeed(double x){
    this.speed = x;
  }

  public double getSpeed(){
    return this.speed;
  }

  public static void main(String[] args) {
    Fighter fighter_a= new Fighter();
    fighter_a.setName("Tommy");
    fighter_a.setHealth(100);
    fighter_a.setDefensive(5);
    fighter_a.setAttack(15);
    fighter_a.setSpeed(25);
  }

  
}
