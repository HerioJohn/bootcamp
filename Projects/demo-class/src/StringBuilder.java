public class StringBuilder {

  public static void main(String[] args) {
    
    // String: +=, concat()
    String x = "abc";

    x += "def";

    x = x.concat("def");
    System.out.println(x); //abcdefdef

    // StringBuilder

    StringBuilder y = new StringBuilder("abc");
    y.append("def").append("def");
    System.out.println(y.toString()); //abcdefdef

  }
      public StringBuilder(String x){
      
    }
  
}
