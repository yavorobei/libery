package myarraylist;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by user on 02.06.2016.
 */
public class T2 {
    public static void main(String[] args) {


        int index = 0;
        String[] testArray = {"a", "b", "c", "d", "e"};
        String[] tempArray = new String[testArray.length-1];

        System.arraycopy(testArray, 0, tempArray, 0, index);


        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }

        System.out.println("==================");

        System.arraycopy(testArray, ++index, tempArray, --index, tempArray.length-index);




        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }

    }
}
