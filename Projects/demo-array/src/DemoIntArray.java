public class DemoIntArray {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 7;
        int x3 = 12;  // Very troublesome
        int x4 = 15;

        // Define an array (container) to store a list of int number
        int[] array = new int[10]; // [length] of array , by index 0 - 9

        array[0] = 1; 
        System.out.println("array[0] is: " + array[0]); 
        array[1] = 7;
        array[2] = 12;
        array[3] = 15;
        System.out.println("array[4] is: " + array[4]); //array[4] haven't assign any number, default will be 0

        int array2[] = new int[] {5, 10, -15, 20, 25}; // another way to assign number and set the capacity
        System.out.println("The length is array 2 is: " + array2.length); //5

        String fruit[] =  new String[] {"apple", "orange", "banana", "mango", "starfruit", "berry"};
        System.out.println("I got some fruit, I got " + fruit[0] + ", " + fruit[1] + " and " + fruit[4] + "!");

        //default value of int[]
        int[] x5 = new int[3];
        /* for (int i = 0; i < x5.length; i++){
            //x5 is storing the address of the array object
            // we use arr[i] find out the 3 value stored in the array object
            System.out.println(x5[i]); */
        

        String str = "hello"; //str is strong the address of String object hello
        String str2 = new String ("hello"); //str2 is storing the address of String object hhello
        String str3 = String.valueOf("hello");


        }

    
}
