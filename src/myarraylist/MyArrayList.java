package myarraylist;


/**
 * Created by user on 30.05.2016.
 *
 *
 * add(Object) +
 * add(index, Object) +
 * get(index)
 * remove(index)
 * remove(index, Object)
 * set(index, Object)
 * clear()
 * contains(Object)
 * size() +
 *
 *
 */
public class MyArrayList {

    private int size;
    private Object[] testArray = new Object[1];

    public Object[] getTestArray() {
        return testArray;
    }

    public int getSize() {
        return size;
    }

    public void setTestArray(Object[] testArray) {
        this.testArray = testArray;
    }

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
        Object[] resizeArray = new Object[size+1];
        for (int i = 0; i < testArray.length; i++) {
            resizeArray[i] = testArray[i];
        }
        testArray=resizeArray;
    }

    public void showArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*скопировать все елементы до указаного в новый масив
      скопировать указанный елемент в новый масив
      скопировать оставшиюся часть масивы в новый */

    public void add(int index, Object obj){
        Object[] tempArray = new Object[size+1];

        System.arraycopy(testArray, 0, tempArray, 0, index);
        tempArray[index] = obj;

        System.arraycopy(testArray, index, tempArray, ++index, testArray.length-(--index));

        testArray=tempArray;
    }
}
