import java.util.ArrayList;
//import java.util.HashMap;

public class Library {
    private int stockCapacity;
    private ArrayList<Book> books;
//    private HashMap<String, String>


    public Library(int stockCapacity){
        this.stockCapacity = stockCapacity;
        this.books = new ArrayList<>();
    }

    public int countStock() {
        return this.books.size();
    }

}
