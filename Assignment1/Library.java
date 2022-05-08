import java.util.ArrayList;

public class Library extends Book{

    private String title;
    private ArrayList<String> author;
    private int number;
    private float price;
    private String publisher;

    Book books = new Book();


    public Library()
    {
        this.title = "";
        this.author = new ArrayList<String>();
        this.number = 0;
        this.price = 0.0f;
        this.publisher = "";
    }
    public Library(String title, ArrayList<String> author, int number, String publisher, float price) {
        super(title, author, number, publisher, price);
        this.title = title;
        this.author = author;
        this.number = number;
        this.price = price;
        this.publisher = publisher;



    }

    public void deleteBook(Book book) {
        
        ArrayList<Book> books = new ArrayList<Book>();
        books.remove(book);

    }

    public String toString() {


        return "Library [title=" + title + ", author=" + author + ", number=" + number + ", price=" + price + ", publisher=" + publisher + "]";


    }

    public void addBook(String string, ArrayList<String> arrayList, int i, String string2, float f) {

        ArrayList<Book> books = new ArrayList<Book>();
    }

    public double totalPrice() {

        return price+=price;
    }




}