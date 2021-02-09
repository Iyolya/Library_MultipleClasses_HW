import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this. borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book){
        this.borrowedBooks.add(book);
    }

    public int countBorrowedBooks(){
       return this.borrowedBooks.size();
    }

    public void returnBook(Book book){
        this.borrowedBooks.remove(book);
    }

}


