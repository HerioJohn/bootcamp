public class Cat {

  String name;
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  int age;

  public Cat (String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Cat(" + "name = " + this.name + "age = " + this.age + ")";
  }
  
}
