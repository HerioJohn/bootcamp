
public class JavaQuest6_Subbmission {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in 
    
    int n1 = 1;
    int n2 = 1;
    int n3 = 0;

    for (int i = 0; i < 13; i++){

      if (i == 0)
      {
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
      }

      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;

      System.out.print(n3 + " ");
    }

  }
}