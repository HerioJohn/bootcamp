public class Dog {

  private String name;

 // If there is no constructor explicitly in a class
 // empty constructor is provided by default

 public Dog(){
  
 }

 public Dog(String name){
  this.name = name;
 }

 public static int sum2(int[] integers){
  int sum = 0;
  for (Integer i : integers) {
    sum += 1;
  }
  return sum;
 }

 public static void main(String[] args) {
  System.out.println(sum(1,2,3,4,5)) //15

  // call sum2
  int[] arr = new int[]{1,2,3,4,5};
  System.out.println(sum(arr));
 }


  
}
