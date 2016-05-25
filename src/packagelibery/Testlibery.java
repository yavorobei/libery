package libery;

/**
 * Created by Dell-user on 5/23/16.
 */
public class Testlibery {
    public static void main(String [] args){

       MyReader reader = new MyReader("Ser", "Vor");

       System.out.println(reader);

        MyBook book = new MyBook("BY", "a1", 1999);
        Libery libery1 = new Libery("SuperLibery");

        libery1.addBook(book);

    }
}
