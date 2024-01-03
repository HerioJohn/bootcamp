import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args){

    List<Staff> staffs = new ArrayList<>(List.of(new Staff("John", 20000.0d, new Staff("John", 15000.0d))));

    double sum = 0.0d;
    for (Staff staff : staffs) {
      sum += staff.getSalary();
    }
    System.out.println("max salary=" + max);


  }
}
