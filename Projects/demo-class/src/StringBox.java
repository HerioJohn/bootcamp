public class StringBox { // Person

  private char[] characters; // object reference type

  public StringBox(String str){

    this.characters = new char[str.length()];

    for (int i = 0; i < str.length() ; i++){
      characters[i] = str.charAt(i);

    }
  }

  // instance method
  public boolean isEmpty() {
    // check if the char[] is empty
    return this.characters.length == 0;
  }

  public int length() {
    // return the char array length
    return this.characters.length;
  }

  public StringBox concat(String str) {

    //
    int idx = 0;
    char [] newArr = new char[this.characters.length + str.length()];

    for (int i = 0; i < this.characters.length; i ++) {
      newArr[idx++] = characters[i];
    }

    for (int i = 0; i < str.length(); i++) {
      newArr[idx++] = characters[i];
    }

    return new StringBox(String.valueOf(newArr));

  }

  public String toString() {
    return String.valueOf(this.characters);
  }


  public static void main(String[] args) {
    StringBox text = new StringBox("hello");
    System.out.println(text); 

    System.out.println(text.isEmpty());
    System.out.println(text.length());

    StringBox text2 = text.concat(" wworld");

    System.out.println(text2);
    
    StringBox text3 = text2.concat("world");

    //System.out.println(text);
    //System.out.println(text2);
    //System.out.println(text3);





  }








  
}
