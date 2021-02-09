import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int stockCapacity;
//    private HashMap<String, String>


    public Library(int stockCapacity){
        this.stockCapacity = stockCapacity;
        this.books = new ArrayList<>();
    }
}
