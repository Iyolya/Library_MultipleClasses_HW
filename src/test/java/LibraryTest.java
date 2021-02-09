import org.junit.Before;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("The Red Book", "Carl Gustav Jung", "Biography");
    }
}
