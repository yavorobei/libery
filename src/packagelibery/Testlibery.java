package packagelibery;

/**
 * Created by Dell-user on 5/23/16.
 *
 *
 Предметная область - Библиотека
 Основные классы: Библиотека, Книга, Читатель

 Написать программу позволяющую узнать следующую информацию:
 1) посмотреть список читателей
 2) посмотреть список доступных книг
 3) добавить книгу в библиотеку
 4) добавить читателя в список читателей
 5) выдать книгу читателю (если книга есть в наличии).
 Читателю запрещается брать больше 3-х книг.
 6) посмотреть список книг, которые находятся у читателей
 7) посмотреть список книг, которые находятся у конкретного читателя
 8) добавить читателя в черный список (ему нельзя выдавать книги)
 9) посмотреть книги конкретного автора
 10) посмотреть книги конкретного года
 *
 *
 */
public class Testlibery {
    public static void main(String [] args){

       MyReader reader = new MyReader("Ser", "Vor");

       System.out.println(reader);

       MyBook book = new MyBook("Kathy Sierra, Bert Bates", "Head First Java", 2014);
       MyBook book1 = new MyBook("Kathy Sierra, Bert Bates", "Head First Java", 2015);

        Libery itLibery = new Libery("IT-Libery");

       itLibery.addBook(book);
       itLibery.addBook(book1);

       itLibery.showListOfBooks(itLibery.getBooks());

    }
}
