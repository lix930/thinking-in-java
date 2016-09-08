

import java.awt.font.NumericShaper;
import java.util.Random;

/**
 * Created by fish-Xiang on 2016/9/8.
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = random.nextFloat();
        for (float x : f)
            System.out.println("random: " + x);
        for (char s : "an african swallow".toCharArray())
            System.out.print(s + " ");
    }
}

class ForEachString {

}