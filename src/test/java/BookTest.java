import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Red Book", "Carl Gustav Jung", "Biography");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Red Book", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Carl Gustav Jung", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Biography", book.getGenre());
    }
}
