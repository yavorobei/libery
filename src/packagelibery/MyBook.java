package packagelibery;

/**
 * Created by Dell-user on 5/23/16.
 */
public class MyBook {
    private String outhors;
    private String name;
    private int printYear;
    private boolean statusBoock=true;

    public MyBook(String outhors, String name, int printYear) {
        this.outhors = outhors;
        this.name = name;
        this.printYear = printYear;
    }

    public String getOuthors() {
        return outhors;
    }

    public void setOuthors(String outhors) {
        this.outhors = outhors;
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

    public boolean isStatusBoock() {
        return statusBoock;
    }

    public void setStatusBoock(boolean statusBoock) {
        this.statusBoock = statusBoock;
    }


    @Override
    public String toString() {
        return "MyBook{" +
                "outhors='" + outhors + '\'' +
                ", name='" + name + '\'' +
                ", printYear=" + printYear +
                ", statusBoock=" + statusBoock +
                '}';
    }
}
