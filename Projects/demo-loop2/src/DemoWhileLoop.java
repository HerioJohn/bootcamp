import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) throws Exception {

        // For Loop

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += 1;
        }

        System.out.println("sum = " + sum);

        // While Loop

        int j = 0;
        sum = 0;
        while (j < 5) {
            sum += j++;
        }
        System.out.println("j = " + j);
        System.out.println("2nd sum = " + sum);

        // continue, break in While Loop

        j = 0;
        sum = 0;

        while (++j <= 10) {
            if (j > 5) {
                break;
            } else if (j % 2 != 0) {
                System.out.println("J is = " + j);
                continue;
            }
        }

        System.out.println("j = " + j);
        System.out.println("3rd sum = " + sum);

        //------------------------------------

        int x = 10;
        int y = 5;
        while (x > 0 && y > 0){
            System.out.println("x = " + x + " And " + "y = " + y);
            x--;
            y--;
        }

      //------------------------------------

      boolean isOverLimit = false;
      int limit = 0;
      while (!isOverLimit){
        if (++limit > 100)
        isOverLimit = true;
      }

      //------------------------------------

      // Insertion Sort
      // 4 , 3 , 2 , 10, 12, 1 , 5 , 6

      int arr[] = new int []{4,3,2,10,12,1,5,6};
      int temp = 0;
      int i = 0;

      for (int t = 0; t < arr.length; t++)
      {
            i = 0;

        while ( i < arr.length) {
        if (i != 0 && arr[i] < arr[i-1]){
            temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            }
        else if (i == 0 && arr[i] > arr[i+1]) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;           
            }

            i++;
        }
      }

      System.out.println(Arrays.toString(arr));





    }
}
