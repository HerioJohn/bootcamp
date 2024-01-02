import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

public class DemoConsumer {

  public static void main(String[] args) {
    
    Consumer<String> sendEmail = emailAddress -> sendEmail(emailAddress);

    List<String> emails = new ArrayList<>

  }

  public static boolean sendEmail(String emailAddress) {
    System.out.println("I am sending email ..." + emailAddress);
    return true;
  }


  
}
