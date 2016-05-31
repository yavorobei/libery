package myarraylist;

import java.util.ArrayList;

/**
 * Created by user on 30.05.2016.
 */
public class TestMyArrayList {
    public static void main(String[] args) {

        MyArrayList testArrays = new MyArrayList();

        System.out.println(testArrays.size(testArrays.getTestArray()));

        testArrays.add("test add0");
        testArrays.add("test add1");
        testArrays.add("test add2");
        testArrays.add("test add3");
        testArrays.add("test add4");
        testArrays.add("test add5");
        testArrays.add("test add6");
        testArrays.add("test add7");
        testArrays.add("test add8");
        testArrays.add("test add9");
        testArrays.add("test add10");
        testArrays.showArray(testArrays.getTestArray());

        System.out.println("size ==> " + testArrays.getSize());


    }
}
