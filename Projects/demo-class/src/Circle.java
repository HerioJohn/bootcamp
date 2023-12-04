public class Circle {

  public static void main(String[] args){
      Circle circle_A = new Circle(); // radius = 0.0
      circle_A.setRadius(3.2d);
      double diamter_A = circle_A.getDiameter(radius_A);
      double area_A = circle_A.getArea();


      System.out.println("The radius of circle A is: " + radius_A);
      System.out.println("The diamter of circle A is: " + diamter_A);
      System.out.println("The area of circle A is: " + area_A);

  }

  private double radius;

  


  // Empty Constructor
  public Circle() {

  }

  // Argument Constructor
  public Circle (double x){
    this.radius = x;
  }

  // Getter
  public double getRadius(){
    return this.radius;
  }

  public double getDiameter(double x) { 
    return this.radius * 2;
  }

  public double getArea(){
    return Math.pow(this.radius, 2) * Math.PI;
  }

    // Getter  // Setter
  public void setRadius(double x) {
    this.radius = x;
  }

  
}
