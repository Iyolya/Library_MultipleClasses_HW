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



}
