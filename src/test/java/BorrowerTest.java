import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("The Red Book", "Carl Gustav Jung", "Biography");
        borrower = new Borrower("Laura");
    }

    @Test
    public void canBorrow(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.countBorrowedBooks());
    }
}
