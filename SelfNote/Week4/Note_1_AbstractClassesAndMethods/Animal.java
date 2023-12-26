package SelfNote.Week4.Note_1_AbstractClassesAndMethods;

public abstract class Animal {

  // abstract 的目的是確保沒有人可以生產 Animal 的 Object，但允許從 Animal 繼承其所有特性。

  String name;
  int age;

  // Method 加上 abstract 後，繼承其的所有 Class 都要使用這個 Method
  public abstract void makeNoise();

  
}
