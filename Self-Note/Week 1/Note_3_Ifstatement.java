public class Note_3_Ifstatement {

//------------------------------------------------[If Statement]---------------------------------------------------------------------

  public static void main(String[] args) {

    int age = 80; 

    if (age >= 75) {
      System.out.println("Your age is " + age + ", You are an elder!");
    }
    else if(age >= 18) {
      System.out.println("Your age is " + age + ", You are an adult!");
    }
    else if(age >= 13) {
      System.out.println("Your age is " + age + ", You are a teenager!");
    }
    else {
      System.out.println("Your age is " + age + ", You are a child!");
    }

  }
  
}
