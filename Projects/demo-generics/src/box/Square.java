
package box;

public class Square extends Shape {

  private double edge;

  public Square(double edge) {
    this.edge = edge;
  }

  @Override
  public double area() {
    return this.edge * this.edge;
  }

}
