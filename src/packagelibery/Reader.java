package packagelibery;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Dell-user on 5/23/16.
 */
public class Reader {
    private String name;
    private String surname;
    private int id;
//    todo LocalDate
    private Date birthday;
    private Address address;
    private boolean isBanned;
    public ArrayList<Book> readerBooks = new ArrayList<Book>();
    private int countUserBook;
    private Gender gender;


    public boolean isBanned() {
       return isBanned;
    }

    public void setBanned(boolean isBlackList) {
        this.isBanned = isBlackList;
    }

    public Reader() {
    }

    public Reader(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Reader(String name, String surname, int id, Date birthday, Address address, Gender gender) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.birthday = birthday;
        this.address = address;
    }

//    todo validation in setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getCountBook() { return countUserBook; }

    public void setCountBook(int countBook) {this.countUserBook = countBook; }


//    todo equals

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", birthday=" + birthday +
                ", address=" + address +
                ", isBanned=" + isBanned +
               // ", readerBooks=" + readerBooks +
                ", countUserBook=" + countUserBook +
                '}';
    }
}
