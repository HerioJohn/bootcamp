import java.util.Arrays;

/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12_Submission {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] answers = twoSum(new int[] { 2, 7, 11, 15 }, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum

    System.out.println("answers is: " + Arrays.toString(answers));
    System.out.println("answers 2 is: " + Arrays.toString(answers2));
    System.out.println("answers 3 is: " + Arrays.toString(answers3));
  }

  // Code a method here to return an array of two numbers that sum up to the
  // target

  public static int[] twoSum(int[] y, int x){

  int[] result = {0,0} ;

    for (int i = 0; i < y.length; i++){

      for (int j = 0; j < y.length - i - 1; j++){

          if (y[j] + y[j+1] == x){
            result = new int[]{j,j+1};
            break;
          }
          continue;
      }

    }

    if (result[0] == 0 && result[1] == 0){
      result = new int[]{-1,-1};
    }

    return result;
  }

}
