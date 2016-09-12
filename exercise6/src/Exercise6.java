import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by fish-Xiang on 2016/9/12.
 */
class name {

}

public class Exercise6 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //
        int num = 3;
        c.add("hello");
        c.add(new Double("1.1111"));
        c.add(new Integer("332"));
        c.add(num);
        System.out.println(c.size());
        System.out.println(c);
    }
}
