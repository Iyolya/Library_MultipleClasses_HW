import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Red Book", "Carl Gustav Jung", "Biography");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Red Book", book.getTitle());
    }
}
