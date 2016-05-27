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
 * 8) добавить читателя в черный список (ему нельзя выдавать книги)
 * 9) посмотреть книги конкретного автора +
 * 10) посмотреть книги конкретного года +
 */
public class Testlibery {
    public static void main(String[] args) {

        MyReader reader = new MyReader("Ray", "Last");
        MyReader reader1 = new MyReader("Bob", "Red");
        MyReader reader2 = new MyReader("Dean", "Martin");


        MyBook book = new MyBook("Kathy Sierra, Bert Bates", "Head First Java", 2014);
        MyBook book1 = new MyBook("Kathy Sierra, Bert Bates", "Head First HTML", 2014);
        MyBook book2 = new MyBook("Kathy Tary", "Head First C++", 2014);
        MyBook book3 = new MyBook("Kathy Sierra", "Head First C#", 2014);
        MyBook book4 = new MyBook("Kathy Sierra, Bert Bates", "Head First Java", 2015);

        Libery itLibery = new Libery("IT-Libery");

        itLibery.addBook(book);
        itLibery.addBook(book1);
        itLibery.addBook(book2);
        itLibery.addBook(book3);
        itLibery.addBook(book4);

        itLibery.addReader(reader);
        itLibery.addReader(reader1);
        itLibery.addReader(reader2);


        itLibery.showListOfBooks(itLibery.getBooks());

        itLibery.findBookOfOneYear(itLibery.getBooks(), 2014);

        itLibery.findBookSingleAuthor(itLibery.getBooks(), "Kathy Sierra, Bert Bates");

        itLibery.giveBook(book, reader);
        itLibery.giveBook(book1, reader);
        itLibery.giveBook(book2, reader);
        itLibery.giveBook(book3, reader);

        itLibery.showListOfReaders(itLibery.getReaders());

        itLibery.showListOfBooksParticularUser(reader);

        itLibery.showBusyBook(itLibery.getBooks());

        itLibery.addReaderInBlackList(reader1);

        itLibery.giveBook(book, reader1);

    }
}
