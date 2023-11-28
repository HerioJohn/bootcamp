import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoCounting {

  public static void main (String[] args){
    // assume all number is possitive
    int[] numbers = new int[]{10,2,200,2000,2000,2,2};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    // int[] counts = new int[];

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max)
      max = numbers[i];

      if (numbers[i] < min)
      min = numbers[i];
    }
      System.out.println("Max = " + max);
      System.out.println("Min = " + min);

    //---------------------------------------

    String str = "abcabcdpolxyzaa";
    char maxChar = ' ';
    int maxCount = 0;
    int counts2[] = new int[26];
    // charAt()
    for (int i = 0; i < str.length(); i++){
      counts2[str.charAt(i) - 'a']++; // 'a' - 'a' -> 97 - 97 -> 0
    }

    for (int i = 0; i < counts2.length; i++) {
      if (counts2[i] > maxCount){
        maxCount = counts2[i];
        maxChar = (char) (i + 'a');
      } 
    }

    System.out.println("MaxCount :" + maxCount + ", " + "char :" + maxChar);

  }
  
}
