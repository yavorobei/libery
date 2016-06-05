package myarraylist;


/**
 * Created by user on 30.05.2016.
 * <p>
 * <p>
 * add(Object) +
 * add(index, Object) +
 * get(index) +
 * remove(index) +
 * remove(index, Object) +
 * set(index, Object) +
 * clear() +
 * contains(Object)+
 * size() +
 */
public class MyArrayList {

    private int size;
    private int capacity;
    private Object[] testArray = new Object[5];
//    todo create field capacity -> will clean your code


//    todo create diferent constructors see ArrayList

    //++++ todo_ return only filled part
    public Object[] getTestArray() {
        for (int i = 0; testArray[i]!=null; i++){
            size++;
        }
        Object[] tempArray = new Object[size];
        System.arraycopy(testArray, 0, tempArray, 0, size);

        return tempArray;
    }

    public int getSize() {
        return size;
    }


//+++ todo_ you must return this AL size not other
    public int size() {
        return testArray.length;
    }

    public void add(Object obj) {
        if (capacity >= testArray.length) {
            resizeArray();
        }
        testArray[capacity] = obj;
        capacity++;
    }
//+++  todo_ why public? resize on 1 cell is bad idea
    private void resizeArray() {
    //private Object[] resizeArray() {
        final int RESIZE_COEFFICIENT = capacity*3/2;
        Object[] resizeArray = new Object[RESIZE_COEFFICIENT];
        for (int i = 0; i < testArray.length; i++) {
            resizeArray[i] = testArray[i];
        }
        testArray = resizeArray;
    }

    public void showArray() {
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }

    public void add(int index, Object obj) {
//        todo use resize (overload it)
        final int RESIZE_COEFFICIENT = capacity*3/2;
            if (capacity >= testArray.length) {
                Object[] tempArray = new Object[RESIZE_COEFFICIENT];
            }
        Object[] tempArray = new Object[testArray.length+1];

        System.arraycopy(testArray, 0, tempArray, 0, index);
        tempArray[index] = obj;

        System.arraycopy(testArray, index, tempArray, ++index, testArray.length - (--index));

        testArray = tempArray;
    }

    public Object get(int index) {
        return testArray[index];
    }
// !! todo don't create new array
    public void remove(int index) {
        Object[] tempArray = new Object[testArray.length - 1];

        System.arraycopy(testArray, 0, tempArray, 0, index);
        System.arraycopy(testArray, ++index, tempArray, --index, tempArray.length - index);

        testArray = tempArray;
    }

    public void remove(int index, Object obj) {
//       ++ _todo can get NullPointerException

        if (obj.equals(testArray[index])) {
            Object[] tempArray = new Object[testArray.length - 1];

            System.arraycopy(testArray, 0, tempArray, 0, index);
            System.arraycopy(testArray, ++index, tempArray, --index, tempArray.length - index);

            testArray = tempArray;
        }
    }
//+++  _todo not void! macke chackes on Exceptions
    public Object set(int index, Object obj) {
        if (index >= capacity){
            throw new IndexOutOfBoundsException("Check index, becouse index >= capacity");
        }
        return testArray[index] = obj;
    }


    public void clear() {
//        todo not all cells have reference i < size
        for (int i = 0; i < size; i++) {
            testArray[i] = null;
        }
        size = 0;

    }

    public boolean contains(Object obj) {
        if (obj == null) return false;

       //++ _todo can get NullPointerException
        for (int i = 0; i < testArray.length; i++) {
            if (obj.equals(testArray[i])) return true;
        }
        return false;
    }
}
