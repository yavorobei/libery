package packagelibery;

import java.util.ArrayList;

/**
 * Created by Dell-user on 5/23/16.
 */
public class Libery {
    private ArrayList <MyBook> books;
    private ArrayList<MyReader> readers;
    private String nameLibery;

    public Libery(String nameLibery) {
        this.nameLibery = nameLibery;
        books = new ArrayList<MyBook>();
        readers = new ArrayList<MyReader>();
    }

    public boolean addBook(MyBook book){
        return book != null && books.add(book);

    }

    public ArrayList<MyBook> getBooks() {
        return books;
    }

    public ArrayList<MyReader> getReaders() {
        return readers;
    }

    public boolean addReader(MyReader reader){
        if (reader == null || readers.contains(reader)) return false;
        return  readers.add(reader);
    }

    public boolean addReaderInBlackList(MyReader reader){
        reader.setBlackList(true);
        return reader.isBlackList();
    }

    public boolean deleteReaderInBlackList(MyReader reader){
        return false;
    }

    public boolean deleteBook(MyBook book){
        return false;
    }

    public boolean deleteReader(MyReader reader){
        return false;
    }

    public boolean giveBook(MyBook book, MyReader reader) {
        if (reader.isBlackList()) return false;
        //if (reader)
        return false;
    }

    public boolean takeBook(MyBook book, MyReader reader){
        return false;
    }

    public void showListOfReaders(ArrayList <MyReader> readers){
        for(MyReader item : readers){
            System.out.println(item);
        }
    }

    public void showListOfBooks(ArrayList <MyBook> books){
        for(MyBook item : books){
            System.out.println(item);
        }
    }

}
