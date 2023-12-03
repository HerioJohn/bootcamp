import java.util.ArrayList;
import java.util.Arrays;

public class Note_2B_ArrayVsArrayList {

  public static void main(String[] args) {

    // Arrays - Can hold primitives or objects
    
    String[] friendsArray = new String[5];  // [0][1][2][3][4]

    String[] friendsArray2 = {"John","Peter","Tommy","Zoey","Mary"};

    System.out.println(friendsArray2[1]); // Peter

    System.out.println(friendsArray.length); // 5

    // ArrayList - Grows and shirnks automatically! Can only hold objects, but support wrapper types for primitives.

    ArrayList<String> friendArrayList = new ArrayList<>();

    ArrayList<String> friendArrayList2 = 
      new ArrayList<>(Arrays.asList("John","Peter","Tommy","Zoey","Mary"));

    System.out.println(friendArrayList2.get(2)); // Tommy

    System.out.println(friendArrayList2.size()); // 5

    // ArrayList - Can easily add length

    friendArrayList2.add("Bill");

    System.out.println(friendArrayList2.get(5)); // Bill 


  }
  
}
