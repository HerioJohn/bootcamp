public class Note_2_Array {

  public static void main(String[] args) {
    
    // array = used to store multiple values in a single variable

  int[] score = new int[5];

  score[0] = 50;
  score[1] = 90;
  score[2] = 75;
  score[3] = 60;
  score[4] = 100;

  String[] student = {"Tommy","Bob","Mary","Peter","Zoey"};

  for (int i = 0; i < student.length; i++){

    System.out.println("In this exam, " + student[i] + " got " + score[i] + " point !");

  }








  }


  
}
