import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("The Red Book", "Carl Gustav Jung", "Biography");
    }

    @Test
    public void libraryStockEmpty(){
        assertEquals(0, library.countStock());
    }

    @Test
    public void bookCanBeAdded(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countStock());
    }

    @Test
    public void bookCanBeRemoved(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
       assertEquals(2, library.countStock());
    }


}
