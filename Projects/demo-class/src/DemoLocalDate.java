import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;

public class DemoLocalDate {

  public static void main(String[] args) {
    String date = "1987-01-03";

    LocalDate date2 = LocalDate.of(1998, 9, 8);
    System.out.println(date2.toString());

    LocalDate date3 = LocalDate.of(1999, 10, 2);
    if (date3.isAfter(date2)){
      System.out.println("date3 > date2");
    } else if (date3.equals(date2)){
      System.out.println("date 2 = date 3");
    }
    else {
      System.out.println("date3 < date2");
    }

    System.out.println(date3.isLeapYear()); //false
    System.out.println(LocalDate.of(2100, 10, 02).isLeapYear()); //false
    System.out.println(LocalDate.of(2000, 10, 02).isLeapYear()); //true

    System.out.println(date3.getMonthValue()); //10
    System.out.println(date3.getMonth().toString()); //OcTOBBER
  }
  
}
