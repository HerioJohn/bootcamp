public class DemoSwitch {

  public static void main(String[] argus) {
    //if, else-if -> comparison and logical operators

    // switch:single value comparison (==) // case 只要滿足一次，之後的 case 不會再檢查
    char vipGrade = 'G';

    switch (vipGrade){
      case 'D':
      System.out.println("50% Discount");
      case 'G':
      System.out.println("Gift2");
      case 'S':
      System.out.println("Gift");
      case 'N':
    }

      switch (vipGrade){ // break 合乎條件後，叫它不要再向下走了
      case 'D':
      System.out.println("50% Discount");
      break;
      case 'G':
      System.out.println("40% Discount");
      break;
      case 'S':
      System.out.println("30% Discount");
      break;
      case 'N':
      default: //如果沒有任何case符合，就使用預設的設定
      System.out.println("I am running Default Setting!");
    }
  }
  
}
