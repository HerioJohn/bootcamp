// blueprint, to produce Person objects

public class Person {

  private String firstName;

  private String lastName;

  private int age; //0 by default

  // Constructor (Produce Person's object)
  public Person(String firstName) {
    this.firstName = firstName;
  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // Method
  // Setter
  public void setFullName(String x, String y){
    this.firstName = x;
    this.lastName = y;
  }

  public void setFirstName(String x){
    this.firstName = x;
  }

  public void setLastName(String x){
    this.lastName = x;
  }

  // Getter
  public String getFullName(boolean isCapLetter){
    //return this.firstName + " " + lastName;

    String fullName = this.firstName.concat(" ").concat(this.lastName);
    return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
  }

  public String getFullName(){
    //return this.firstName + " " + lastName;

    String fullName = this.firstName.concat(" ").concat(this.lastName);

    return lastName.isEmpty() ? this.lastName : this.firstName.concat(" ").concat(this.lastName);
  }

  public String getSubName(){
    return this.firstName.substring(0, 1).toUpperCase()
      .concat(this.firstName.substring(1, this.firstName.length()))
      .concat(" ")
      .concat(this.lastName.substring(0, 1).toUpperCase())
      .concat (this.lastName.substring(1, this.lastName.length()));
    
  }

  public String getLastName(){
    return this.lastName;
  }

  

}
