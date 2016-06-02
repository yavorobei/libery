package myarraylist;

/**
 * Created by user on 30.05.2016.
 */
public class TestMyArrayList {
    public static void main(String[] args) {

        MyArrayList testArrays = new MyArrayList();

        //System.out.println(testArrays.size(testArrays.getTestArray()));

        testArrays.add("test add0");
        testArrays.add("test add1");
        testArrays.add("test add2");
        testArrays.add("test add3");
        testArrays.add("test add4");
        testArrays.add("test add5");

        testArrays.showArray(testArrays.getTestArray());

        System.out.println("\nsize ==> " + testArrays.getSize() + "\n");

        testArrays.add(1,"-- insert 777 --");

        testArrays.showArray(testArrays.getTestArray());


        System.out.println("\nget element ==> " + testArrays.get(0) + "\n");

        System.out.println("Array after remove element: ");
        testArrays.remove(4);

        System.out.println("--------------------------- ");
        testArrays.showArray(testArrays.getTestArray());
    }
}
