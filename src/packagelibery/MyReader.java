package packagelibery;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Dell-user on 5/23/16.
 */
public class MyReader {
    private String name;
    private String surname;
    private int id;
    private Date birthday;
    private Adress adress;
    private boolean isBlackList;
    private ArrayList<MyBook> books;
    private int countBook;

    public boolean isBlackList() {
        return isBlackList;
    }

    public void setBlackList(boolean isBlackList) {
        this.isBlackList = isBlackList;
    }

    public MyReader() {
    }

    public MyReader(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public MyReader(String name, String surname, int id, Date birthday, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.birthday = birthday;
        this.adress = adress;
    }

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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public int getCountBook() { return countBook; }

    public void setCountBook(int countBook) {this.countBook = countBook; }

    @Override
    public String toString() {
        return "MyReader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", birthday=" + birthday +
                ", adress=" + adress +
                '}';
    }
}
