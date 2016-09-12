import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * Created by fish-Xiang on 2016/9/12.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new TreeMap<>();

        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);

        m2.put("A", 1);
        m2.put("B", 2);

        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        if (m1.containsKey("two")) {
            int i = m1.get("two");
            System.out.println(i);
        }

        System.out.println(m2);
    }
}
