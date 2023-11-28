public class DemoStringArray {

  public static void main(String[] args){
    String s1[] = new String[] {"abc","ijk","xyz"};

    String s2[] = new String[3];
    s2[0] = "abc";
    s2[1] = "ijk";
    s2[2] = "xyz";

    // Excersie - for loop
    // strings[0] -> "abcijk"
    // string[1] -> "ijkxyz"
    // string[2] -> "xyz"

    String s3[] = new String[] {"abcijk","ijkxyz","xyz"};

    for (int i = 0 ; i < s3.length ; i++) { //0,1,2
      // code here...
      System.out.println(s3[i]);
    }

    for (int i = 0 ; i < s3.length ; i++) {
      if (i == s3.length - 1){
        System.out.println(s2[2].concat("!"));
      }
    }
    
  }
  
}
