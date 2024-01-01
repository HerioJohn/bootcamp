package SelfNote.Week3.Bonus;

import java.util.Objects;

public class UsingEquals {

  String name;

  public String getName() {
    return this.name;
  }

  @Override // Override equals method
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    
    if (obj == null) {
      return false;
    }

    if (this.getClass() != obj.getClass()) {
      return false;
    }

    UsingEquals other = (UsingEquals)obj;

    return Objects.equals(this.getName(), other.getName());
  } 

  public static void main(String[] args) {
    
    UsingEquals object_1 = new UsingEquals();
    object_1.name = "A";

    UsingEquals object_2 = new UsingEquals();
    object_2.name = "A";

    System.out.println(object_1 == object_2); // false

    System.out.println(object_1.equals(object_2)); // true (Before it is false)

    System.out.println(object_1.name.equals(object_2.name)); // true

    object_1 = object_2;

    System.out.println(object_1 == object_2); // true

    System.out.println(object_2.equals(object_2)); // true

    // == is checking if they are same object.
    // equals is checking if they are same value.

  }
  
}
