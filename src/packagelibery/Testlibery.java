package packagelibery;

/**
 * Created by Dell-user on 5/23/16.
 * <p/>
 * <p/>
 * Предметная область - Библиотека
 * Основные классы: Библиотека, Книга, Читатель
 * <p/>
 * Написать программу позволяющую узнать следующую информацию:
 * 1) посмотреть список читателей
 * 2) посмотреть список доступных книг
 * 3) добавить книгу в библиотеку
 * 4) добавить читателя в список читателей
 * 5) выдать книгу читателю (если книга есть в наличии).
 * Читателю запрещается брать больше 3-х книг.
 * 6) посмотреть список книг, которые находятся у читателей
 * 7) посмотреть список книг, которые находятся у конкретного читателя
 * 8) добавить читателя в черный список (ему нельзя выдавать книги)
 * 9) посмотреть книги конкретного автора
 * 10) посмотреть книги конкретного года
 */
public class Testlibery {
    public static void main(String[] args) {

        MyReader reader = new MyReader("Ray", "Last");
        MyReader reader1 = new MyReader("Bob", "Red");
        MyReader reader2 = new MyReader("Dean", "Martin");


        MyBook book = new MyBook("Kathy Sierra, Bert Bates", "Head First Java", 2014);
        MyBook book1 = new MyBook("Kathy Sierra, Bert Bates", "Head First Java", 2015);

        Libery itLibery = new Libery("IT-Libery");

        itLibery.addBook(book);
        itLibery.addBook(book1);

        itLibery.addReader(reader);
        itLibery.addReader(reader1);
        itLibery.addReader(reader2);

        System.out.println("\n List books:");
        itLibery.showListOfBooks(itLibery.getBooks());

        System.out.println("\n List readers:");
        itLibery.showListOfReaders(itLibery.getReaders());


    }
}
