package Projects;

public class test {

  public int maximum69Number (int num) {

    int input = 6699;
    String inputText = String.valueOf(input);
    char[] inputTextArray = inputText.toCharArray();
    int changingCount = 0;

    for (int i = 0 ; i < inputText.length() ; i++ ) {

      if (changingCount > 0){
        break;
      }

      if (inputText.charAt(i) == '6'){
        inputTextArray[i] = '9';
        changingCount++;  
      }

    }

    int output = Integer.parseInt(new String(inputTextArray));
    return output;
  }

  public static void main(String[] args) {

    test obj = new test();
    int result = obj.maximum69Number(9669);
    System.out.println("The result is: " + result);
    

  }
  
}
