package packagelibery;

/**
 * Created by Dell-user on 5/23/16.
 */
public class Book implements Comparable<Book>{
    private Author author;
    private String bookName;
//    todo LocalDate
    private int printYear;
    private boolean isTaken;
    private short numberOfBooks;

    public Book(Author author, String bookName, int printYear, boolean isTaken, short numberOfBooks) {
        this.author = author;
        this.bookName = bookName;
        this.printYear = printYear;
        this.isTaken = isTaken;
        this.numberOfBooks = numberOfBooks;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public short getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(short numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //todo equals

    public boolean equals(Object o){
// ckeck reference
// check instance
        // casting
        // check fields

        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", printYear=" + printYear +
                ", statusBoock=" + isTaken +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return bookName.compareTo(o.bookName);
    }
}
