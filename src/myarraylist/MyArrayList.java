package myarraylist;


/**
 * Created by user on 30.05.2016.
 *
 *
 * add(Object) +
 * add(index, Object) +
 * get(index) +
 * remove(index) +
 * remove(index, Object) +
 * set(index, Object) +
 * clear() +
 * contains(Object)+
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

    public void add(int index, Object obj){
        Object[] tempArray = new Object[size+1];

        System.arraycopy(testArray, 0, tempArray, 0, index);
        tempArray[index] = obj;

        System.arraycopy(testArray, index, tempArray, ++index, testArray.length-(--index));

        testArray=tempArray;
    }

    public Object get(int index){
        return testArray[index];
    }

    public void remove(int index){
        Object[] tempArray = new Object[testArray.length-1];

        System.arraycopy(testArray, 0, tempArray, 0, index);
        System.arraycopy(testArray, ++index, tempArray, --index, tempArray.length-index);

        testArray=tempArray;
    }

    public void remove(int index, Object obj){
        if(testArray[index].equals(obj)){
            Object[] tempArray = new Object[testArray.length-1];

            System.arraycopy(testArray, 0, tempArray, 0, index);
            System.arraycopy(testArray, ++index, tempArray, --index, tempArray.length-index);

            testArray=tempArray;
        }
    }

    public void set(int index, Object obj){
        testArray[index] = obj;
    }

    public void clear(){
        for(int i=0; i<testArray.length; i++){
            testArray[i] = null;
        }
    }

    public boolean contains(Object obj){
        if(obj==null) return false;
            for (int i = 0; i < testArray.length; i++){
               if(testArray[i].equals(obj)) return true;
            }
        return false;
    }
}
