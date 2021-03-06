package packagelibery;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dell-user on 5/23/16.
*/
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private String nameLibery;
//    todo what does this variable function is?
    private int count;

    public Library(String nameLibery) {
        this.nameLibery = nameLibery;
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        count++;
        return book != null && books.add(book);

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public boolean addReader(Reader reader) {
//        todo contains don't work without equals in Reader
        if (reader == null || readers.contains(reader)) return false;
        return readers.add(reader);
    }

    public boolean addReaderInBlackList(Reader reader) {
        if(reader==null) return false;
        reader.setBanned(true);
        return reader.isBanned();
    }

    public boolean deleteReaderInBlackList(Reader reader) {
        return false;
    }

    public boolean deleteBook(Book book) {

        //        todo
        count--;
        return false;
    }

    public boolean deleteReader(Reader reader) {
        if(reader==null) return false;
        for(int i=0; i<readers.size(); i++){
            if(reader.equals(readers.get(i))){
                readers.remove(i);
            }
        }
        //        todo
        return false;
    }

    public boolean giveBook(Book book, Reader reader) {
        if (reader.isBanned()) {
            System.out.println(reader + "==> this user in black list");
            return false;
        }
        if (reader.getCountBook() < 3 && !book.isTaken()) {
            reader.setCountBook(++count);
            reader.readerBooks.add(book);
            book.setTaken(true);
            return true;
        }
        return false;
    }

    public boolean takeBook(Book book, Reader reader) {
        return false;
    }

    public void showListOfReaders() {
        System.out.println("\n|List readers:");
        System.out.println("--------------");
        for (Reader item : readers) {
            System.out.println(item);
        }
    }

    public void showListOfBooks() {
        System.out.println("\n|List books:");
        System.out.println("-----------");
        Collections.sort(books, new CompByYear());
        for (Book item : books) {
            System.out.print(item);
        }
        System.out.println();
    }

    public void showListOfBooksParticularUser(Reader reader) {
        if(reader!=null){
            System.out.println("\n|List of books particular reader:");
            System.out.println("---------------------------------");

            for (Book item : reader.readerBooks) {
                System.out.println(item);
            }
        } else System.out.println("we don't have this reader");
    }

    //поиск книг одного года выпуска
    public void findBookOfOneYear(int year) {
        System.out.println("\n|Books of the one year:");
        System.out.println("-----------------------");
        for (Book item : books) {
            if (item.getPrintYear() == year) {
                System.out.println(item);
            }
        }
    }

    public void findBookSingleAuthor(String author) {
        System.out.println("\n|Books single author:");
        System.out.println("---------------------");
        for (Book item : books) {
            if (item.getAuthor().equals(author)) {
                System.out.println(item);
            }
        }
    }

    public void showBusyBook() {
        System.out.println("\n|List busy books:");
        System.out.println("-----------------");
        for (Book item : books) {
            if (item.isTaken() == true) {
                System.out.println(item);
            }
        }
    }
}
