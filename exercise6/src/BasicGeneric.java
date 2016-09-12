import java.util.*;

/**
 * Created by fish-Xiang on 2016/9/12.
 */
public class BasicGeneric {
    public static void main(String[] args) {

        List<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");

        for(int i=0; i<c.size();i++) {
            String s = c.get(i);
            System.out.println(s);
        }

        Collection<String> c2 = new HashSet<String>();
        c2.add("aaa");
        c2.add("bbb");
        c2.add("ccc");
        for (Iterator<String> iterator = c2.iterator() ; iterator.hasNext(); ) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
