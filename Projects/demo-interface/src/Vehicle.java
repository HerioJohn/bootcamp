public interface Vehicle { // "Vehicle" is abstract word.

// intercae has no instance variable.
int x = 10; // implicitly final
// int y; <= this will cause Error

// interface is a contract with abstract behaviors (methods)

// if a class implements an interface, it has to implement all its abstract methods 
// (all or nothing)

boolean start();  // implicitly public abstract method

boolean stop();

boolean accelerate();

void brake();

// After Java 8
// default instance method
boolean test();

/* 

public static void main(String[] args) {
  // x -> static?
  System.out.println(Vehicle.x);  // 10, intercae -> static final
}

*/
  
}
