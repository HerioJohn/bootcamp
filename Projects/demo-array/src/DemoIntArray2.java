public class DemoIntArray2 {

  public static void main(String[] args){
    // int array 10, 8, 6, 4, 2
    int[] arr = new int[] {10, 8, 6, 4, 2};
    // for loop -> sum
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    System.out.println("sum=" + sum);

    //Find the max value


/* 
    int max = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max) {
        max = arr[i];
      }
      else {
        continue;
      }
    }


  
    System.out.println("max=" + max);

    //Find the min value
    int min = 10000;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max) {
        continue;
      }
      else {
        min = arr[i];
      }
    }
    System.out.println("min=" + min);

    //Second max value - My answer
    /*int max2 = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max2 && arr[i] != max) {
        max2 = arr[i];
      }
      else {
        continue;
      }
    }
    System.out.println("max2=" + max2); */


    //Second max value
    int array[] = new int[]{10, 8, 6 ,4, 2};
    int max = 0;
    int max2 = 0;

    for (int i = 0; i < arr.length; i++){
      if (array[i] > max)
      {
        max2 = max;
        max = array[i]; 
      }
      else if (array[i] > max2){
        max2 = array[i];
      }
  }

  System.out.println("Max number is: " + max);
  System.out.println("Second Max number is: " + max2);

  }
  
}
