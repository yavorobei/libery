package myarraylist;

import java.util.Objects;

/**
 * Created by user on 30.05.2016.
 */
public class MyArrayList {

    private int size;
    private Object[] testArray = new Object[10];


    public int size(Object[] testArray){
       return testArray.length;
    }

    public void add(Object obj){
        if(size>=testArray.length){
            resizeArray();
        }
        testArray[size] = obj;
        size++;
    }

    public void resizeArray(){
        Object[] resizeArray = new Object[size*2];
        for (int i = 0; i < testArray.length; i++) {
            resizeArray[i] = testArray[i];
        }
    }

}
