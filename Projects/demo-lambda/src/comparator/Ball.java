import Projects.demo.SortByPrice;

public class Ball extends{

  public static void main(String[] args) {
    







































  // Approach 1:
  Collections.sort (balls, new SortByColor());
  System.out.println(balls);

  Collections.sort(balls, new SortByPrice());
  System.out.println(balls);

  Comparator<Ball> sortByColor = (b1, b2) -> {
    return b2.getColor().name().compareTo(b1.getColor().name());
  }





  }


  



  
}
