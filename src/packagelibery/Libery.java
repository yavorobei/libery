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
        System.out.println("\n|List readers:");
        System.out.println("--------------");
        for(MyReader item : readers){
            System.out.println(item);
        }
    }

    public void showListOfBooks(ArrayList <MyBook> books){
        System.out.println("\n|List books:");
        System.out.println("-----------");
        for(MyBook item : books){
            System.out.println(item);
        }
    }
    /*можно ли давать книгу для читателя*/
    public boolean checkUserQuantityBook(MyReader reader){
        if(reader.getCountBook()<=3) return true;
        return false;
    }

    //поиск книг одного года выпуска
    public void findBookOfOneYear(ArrayList <MyBook> books, int year){
        System.out.println("\n|Books of the one year:");
        System.out.println("-----------------------");
        for(MyBook item : books){
            if(item.getPrintYear()==year) {
                System.out.println(item);
            }
        }
    }

    public void findBookSingleAuthor(ArrayList <MyBook> books, String author){
        System.out.println("\n|Books single author:");
        System.out.println("---------------------");
        for(MyBook item : books){
            if(item.getOuthors().equals(author)) {
                System.out.println(item);
            }
        }
    }

}
