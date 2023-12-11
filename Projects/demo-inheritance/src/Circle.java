import java.math.BigDecimal;

public class Circle extends Shape {

  private double radius;

  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  // Circle extends Shape, so it has to implement all abstract methods in Parent abbstract class
  @Override
  public double area() {
    return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }


  
}
