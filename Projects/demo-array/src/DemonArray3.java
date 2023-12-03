import java.util.Arrays;

public class DemonArray3 {

  public static void main(String[] args) {
    int[] arr = new int[] { 100, -100, 34 };
    int temp = 0;

    // for loop
    // {-100, 100, 34}
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
      }
    }

    System.out.println(Arrays.toString(arr));

    // -------------------------------------------------------

    // move target index value to the tail of the array
    int[] arr2 = new int[] { 100, -20, 4, 100, 500 };
    int targetindex = 1;
    int temp2 = 0;

    for (int i = 0; i < arr2.length - 1; i++) {
      if (i >= targetindex) {
        temp2 = arr2[i];
        arr2[i] = arr2[i + 1];
        arr2[i + 1] = temp2;
      }
    }
    System.out.println(Arrays.toString(arr2));

    // -------------------------------------------------------

    // Find Max value and move it to the tail
    int[] arr3 = new int[] { 100, 4, 1050, 500, -20 };
    int maxValue = 0;
    int temp3 = 0;


      for (int i = 0; i < arr3.length; i++) {
        if (arr3[i] > maxValue) {
          maxValue = arr3[i];
        } else if (i != 0) {
          temp3 = arr3[i];
          arr3[i] = maxValue;
          arr3[i - 1] = temp3;
        }
      }

    System.out.println("Max Value of Array 3 is: " + maxValue);
    System.out.println(Arrays.toString(arr3));

    //-----------------------------------------------------------

    String s = "abcabcabcabbc";

    // Approach 1

    char[] arr5 = new char[s.length()];

    for (int i = 0; i < s.length(); i++){
      arr5[i] = s.charAt(i);

    // Approach 2

    char[] arr6 = s.toCharArray();
    }

    // replace a -> c

    char[] arr7 = new char[s.length()];

    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) == 'a'){
        arr7[i] = 'c';
        continue;
      }
    }


  }
}
