import java.util.ArrayList;
import java.util.HashMap;


public class Library {
    private int stockCapacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> stockByGenre;
    //using int instead of the wrapper-class Integer allows us
    //to use methods related to Integer. We want to treat int
    //as any other object si it has "nullability" and Integer
    // makes it possible. Wrapper classes inherit from
    // Object classes unlike primitives.


    public Library(int stockCapacity){
        this.stockCapacity = stockCapacity;
        this.books = new ArrayList<>();
        this.stockByGenre = new HashMap<>();
    }

    public int countStock() {
        return this.books.size();
    }

    public void addBook(Book book){
        if(this.books.size() < this.stockCapacity){
            this.books.add(book);
        }
    }

    public void removeBook(Book book){
        if(this.books.size() > 0){
            this.books.remove(book);
        }
    }
}
