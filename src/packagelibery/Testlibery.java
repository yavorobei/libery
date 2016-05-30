package packagelibery;

/**
 * Created by Dell-user on 5/23/16.
 *
 * Предметная область - Библиотека
 * Основные классы: Библиотека, Книга, Читатель
 *
 * Написать программу позволяющую узнать следующую информацию:
 * 1) посмотреть список читателей +
 * 2) посмотреть список доступных книг +
 * 3) добавить книгу в библиотеку +
 * 4) добавить читателя в список читателей +
 * 5) выдать книгу читателю (если книга есть в наличии). +
 * Читателю запрещается брать больше 3-х книг.
 * 6) посмотреть список книг, которые находятся у читателей +
 * 7) посмотреть список книг, которые находятся у конкретного читателя +
 * 8) добавить читателя в черный список (ему нельзя выдавать книги) +
 * 9) посмотреть книги конкретного автора +
 * 10) посмотреть книги конкретного года +
 */
public class Testlibery {

    public static void main(String[] args) {

        Reader reader = new Reader("Ray", "Last");
        Reader reader1 = new Reader("Bob", "Red");
        Reader reader2 = new Reader("Dean", "Martin");


        Book book = new Book("Kathy Sierra, Bert Bates", "Head First Java", 2014);
        Book book1 = new Book("Kathy Sierra, Bert Bates", "Head First HTML", 2014);
        Book book2 = new Book("Kathy Tary", "Head First C++", 2014);
        Book book3 = new Book("Kathy Sierra", "Head First C#", 2014);
        Book book4 = new Book("Kathy Sierra, Bert Bates", "Head First Java", 2015);

        Library itLibrary = new Library("IT-Library");

        itLibrary.addBook(book);
        itLibrary.addBook(book1);
        itLibrary.addBook(book2);
        itLibrary.addBook(book3);
        itLibrary.addBook(book4);

        itLibrary.addReader(reader);
        itLibrary.addReader(reader1);
        itLibrary.addReader(reader2);


        itLibrary.showListOfBooks(itLibrary.getBooks());

        itLibrary.findBookOfOneYear(itLibrary.getBooks(), 2014);

        itLibrary.findBookSingleAuthor(itLibrary.getBooks(), "Kathy Sierra, Bert Bates");

        itLibrary.giveBook(book, reader);
        itLibrary.giveBook(book1, reader);
        itLibrary.giveBook(book2, reader);
        itLibrary.giveBook(book3, reader);

        itLibrary.showListOfReaders(itLibrary.getReaders());

        itLibrary.showListOfBooksParticularUser(reader);

        itLibrary.showBusyBook(itLibrary.getBooks());

        itLibrary.addReaderInBlackList(reader1);

        itLibrary.giveBook(book, reader1);

    }
}
