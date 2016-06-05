package packagelibery;

/**
 * Created by Dell-user on 6/4/16.
 */
public class Author {
    private String fullName;
    private short numberOfPublishedBook;
    Gender gender;

    public Author(String fullName, short numberOfPublishedBook) {
        this.fullName = fullName;
        this.numberOfPublishedBook = numberOfPublishedBook;
    }
}
