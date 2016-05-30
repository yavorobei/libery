package myarraylist;

/**
 * Created by user on 30.05.2016.
 */
public class TestMyArrayList {
    public static void main(String[] args) {
        Object[] testArray = new Object[10];


        MyArrayList testArrays = new MyArrayList();

        System.out.println(testArrays.size(testArray));

        testArrays.add("test add");
    }
}
