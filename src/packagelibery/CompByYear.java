package packagelibery;

import java.util.Comparator;

/**
 * Created by Dell-user on 6/1/16.
 */
public class CompByYear implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrintYear() - o2.getPrintYear();
    }
}
