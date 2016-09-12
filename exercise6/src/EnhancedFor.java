import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

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

    }
}
