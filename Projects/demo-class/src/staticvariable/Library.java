package staticvariable;

import java.util.Arrays;

public class Library {

  private static int bookCounter = 0;

  private static Librarian librarian;

  private Book[] books;

  public Library(Librarian librarian){
    this.books = new Book[0];
    Library.librarian = librarian;

  }

  public String librarianName() {
    return librarian.getName();
  }

  public int bookCount() {
    return bookCounter;
  }

  public void addBook(Book book){
    bookCounter++;

    Book[] newBooks = new Book[this.books.length + 1];
    
    Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);
    newBooks[newBooks.length - 1] = book;
  }

  public static void main(String[] args) {
    Librarian librarian = new Librarian("Jenny");
    Libbrary library = new
  }
  
}
