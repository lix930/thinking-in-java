import java.util.Arrays;

/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arrayRefVar;
        arrayRefVar = new int[100];
        int[] arrayRefVar2 = new int[10];
        int[] arrayRefVar3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(arrayRefVar));
//        System.out.println(Arrays.toString(arrayRefVar2));
//        System.out.println(Arrays.toString(arrayRefVar3));

        double[] myList = {1.9, 2.9, 3.4, 3.5, 13, 1.3, 12, 3.2, 123, 4.2, 1.1};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        double total = 0;
        for (double x : myList) {
            total += x;
        }
        System.out.println("total is:" + total);
        double max = 0;
        for (double x : myList) {
            if (x > max)
                max = x;
        }
        System.out.println("max is: " + max);
        Arrays.sort(myList);
        System.out.println("sorted myList:" + Arrays.toString(myList));
        Arrays.spliterator(myList);



    }





}
