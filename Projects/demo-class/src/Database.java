package src;
public class Database {

  private static String[] strings = new String[0];

  private final int HOURS_PER_DAY = 24; // Contstant instance variable

  public static void add(String str) {

    String[] newArr = new String[strings.length + 1];

    for (int i = 0; i < strings.length; i++){
      newArr[i] = strings[i];
    }

    newArr[newArr.length - 1] = str;
    strings = newArr;

  }

  public static String get(int index) {

    if (!isIndexValid(index))
    return null;
    return strings[index];

  }

  public static boolean isIndexValid(int index) {
    return index >= 0 && index < strings.length;
  }

  public static boolean remove(int index) {

    if (!isIndexValid(index))
      return false;

    String[] arr = new String[strings.length - 1];
    int j = 0;

    for (int i = 0; i < strings.length; i++) {
      if (index == i)
        continue;
      arr[j++] = strings[i];
    }
    
    strings = arr;
    return true;
  }

  public String read(int index) {
    return strings[index];
  }

  public static void main(String[] args) {
    Database.add("hello");
    //System.out.println(Database.get(0)); //hello
    //System.out.println(Database.get(1)); //null

    Database d1 = new Database();
    Database d2 = new Database();

    //System.out.println(d1.get(0));
    Database.add("world");
    Database.remove(0);
    Database.get(0);
    System.out.println(strings[0]);
  }
   
}
