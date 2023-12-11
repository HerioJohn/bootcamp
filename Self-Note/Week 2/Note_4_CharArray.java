import java.util.Arrays;

public class Note_4_CharArray {

  public static void main(String[] args) {
    
    String text = "I love food";
    char[] chars = text.toCharArray();
    System.out.println(Arrays.toString(chars)); // [I,  , l, o, v, e,  , f, o, o, d] 

  }
  
}
