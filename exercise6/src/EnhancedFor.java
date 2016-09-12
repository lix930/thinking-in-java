import java.util.*;

/**
 * Created by fish-Xiang on 2016/9/12.
 */
public class EnhancedFor {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println(i);
        }

        Collection collection = new ArrayList();
        collection.add("abcdefg");
        collection.add("qwertyu");
        collection.add("zxcvbnm");
        collection.add("abcdefg");

        for (Object object : collection) {
            System.out.println(object);
        }

        List l1 = new LinkedList();
        for (int i=0; i<=5; i++) {
            l1.add("a"+i);
        }

        System.out.println(l1);
        l1.add(3, "a100");
        System.out.println(l1);
        l1.set(6, "a200");
        System.out.println(l1);
        System.out.print(l1.get(2) + " ");
        System.out.println(l1.indexOf("a3"));
        l1.remove(1);
        System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println("shuffle "+l1);
        Collections.reverse(l1);
        System.out.println("reverse " + l1);
        Collections.sort(l1);
        System.out.println("sort " + l1);

    }
}
