import java.util.Arrays;

public class DemoSorting {

  public static void main(String[] args) {

    int[] arr = new int[] {100, 4, 1050, 500, -20};

    //1. Bubble Sort

    int temp;

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(arr));


  }
  
}
