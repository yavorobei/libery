package packagelibery;

/**
 * Created by Dell-user on 5/23/16.
 */
public class Book implements Comparable<Book>{
//   todo class Author
    private String author;
    private String name;
//    todo LocalDate
    private int printYear;
//    todo also create field count
    private boolean isTaken;

    public Book(String author, String name, int printYear) {
        this.author = author;
        this.name = name;
        this.printYear = printYear;
    }

    public boolean getTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        this.isTaken = taken;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
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
                ", name='" + name + '\'' +
                ", printYear=" + printYear +
                ", statusBoock=" + isTaken +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.name);
    }
}
