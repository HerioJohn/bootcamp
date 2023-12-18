public enum Direction {

  NORTH(1), EAST(2), WEST(-2), SOUTH(-1),;

  private int value;

  private int getValue() {
    return this.value;
  }

  private static Direction fromValue(int value) {
    for (Direction d : values()) {
      if (d.value == value) {
        return d;
      }
    }
    return null;
  }

  // static methhod
  public static Direction opposite(Direction direction) {
        return Direction.fromValue(direction.getValue() * -1);

  }

  // instance method
  public Direction opposite() {
     return Direction.fromValue(this.getValue() * -1);
}

public static void main(String[] args) {
  System.out.println(Direction.WEST.opposite());
  System.out.println(Direction.opposite(Direction.WEST));

  String result = Direction.WEST.opposite().name();
  String result2 = Direction.WEST.opposite().toString();
  int result3 = Direction.WEST.opposite().hashCode();
}
