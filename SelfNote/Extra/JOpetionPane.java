import javax.swing.JOptionPane;

public class JOpetionPane {

  public static void main(String[] args) {

  String subject = JOptionPane.showInputDialog("Please enter the subject!");
  subject = subject.toLowerCase();

  if (subject.equals("history"))
  JOptionPane.showMessageDialog(null,"Mr Wong teach history.\nHe like fishing\nHe also like reading.");
  else
  JOptionPane.showMessageDialog(null, "Error!\nResult not found!");
    
  }


  
}
