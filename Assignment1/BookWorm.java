import java.util.ArrayList;

public class BookWorm extends Book{
    public static void main(String[] args) throws Exception {

        

        ArrayList<Object> books = new ArrayList<Object>();

        books.add(new Library("Software Engineering Principles", new ArrayList<String>(), 100, "Pearson", 110.0f));
        books.add(new Library("Database Management and Administration", new ArrayList<String>(), 100, "Deitel & Deitel", 160.0f));
        books.add(new Library("Head First Java", new ArrayList<String>(), 100, "Beker", 150.0f));
        books.add(new Library("How to Program", new ArrayList<String>(), 100, "Pearson", 150.0f));
        books.add(new Library("Java for Dummies", new ArrayList<String>(), 100, "Joyce Farrel", 190.0f));

        Library library = new Library();



        for(int x=0; x<books.size(); x++)
        {
            library = (Library)books.get(x);
                    
            library.totalPrice();
        }

        System.out.println("Total Price: R" + library.totalPrice());


    }


}