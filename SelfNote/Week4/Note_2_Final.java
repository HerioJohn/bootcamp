package SelfNote.Week4;

// No class can be the child of this class because we set it to final (but do this only you are very sure)
public final class Note_2_Final {

  public static void main(String[] args) {
    
    final int finalNumber = 5;

    // finalNumber = 6; <= this will cause error because it is final

  }

  public final void finalMethod() {
    // No class can override this method if set to final
  }
  
}
