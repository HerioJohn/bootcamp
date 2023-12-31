import java.math.BigDecimal;

public abstract class Shape {
  // abstract class vs class

  // Difference:
  // 1. Cannot be "new"
  // 2. May contain abstract method(s), implicitly public
  // 
  // Same:
  // 1. Still have instance variables (attributes)
  // 2. Still have instance methhods
  // 3. Still have static methods
  // 4. Stikk have constructor, but cannot be "new", for super() only

  private String color;

  // Constructor

  public Shape() {

  }

  abstract double area(); // implicitly public

  public String getColor() {
    return this.color;
  }

  public static double totalArea(Shape[] shapes) {
    BigDecimal total = BigDecimal.valueOf(0);
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
      // shape.area() -> runtime -> whhich object(circle/ square) -> different implementation of area()
    }
    return total.doubleValue();
  }
  

  public static void main(String[] args) {
    Shape s1 = new Circle(3.2d,"Yellow"); // Polymorhsim

    // Java Compile Time: s1 has area(), getColor(), getRadius()
    System.out.println("s1 area=" + s1.area());
    System.out.println("s1 color=" + s1.getColor());

    Circle c2 = (Circle) s1;
    System.out.println(c2.getRadius());

    Circle c1 = new Circle();
    System.out.println("c1 area=" + c1.area());
    System.out.println("c1 color=" + c1.getColor());
    System.out.println("c1 radius=" + c1.getRadius());

    Shape[] shapes = new Shape[]{new Circle(4.2), new Square(9)};
    System.out.println(totalArea(shapes));
    
  }



  
}
