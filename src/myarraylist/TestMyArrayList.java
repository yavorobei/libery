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
        System.out.println("--------------------------- ");
        testArrays.remove(4);
        testArrays.showArray(testArrays.getTestArray());

        System.out.println("\nArray after remove element by index and value: ");
        System.out.println("---------------------------------------------- ");
        testArrays.remove(3, "test add2");
        testArrays.showArray(testArrays.getTestArray());

        System.out.println("\nArray after set element: ");
        System.out.println("------------------------ ");
        testArrays.set(4, "test ---SET---");
        testArrays.showArray(testArrays.getTestArray());

        System.out.println("\nCheck method contain:");
        System.out.println("---------------------- ");
        System.out.println(testArrays.contains("test add4"));

        System.out.println("\nArray after clear: ");
        System.out.println("------------------- ");
        testArrays.clear();
        testArrays.showArray(testArrays.getTestArray());

    }
}
