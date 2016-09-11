import java.util.Arrays;

/**
 * Created by fish-Xiang on 2016/9/11.
 */
public class Count3Quit {
    public static void main(String[] args) {

        String str = "1,2,3,4,5,";
        String s[] = str.split(",");
        System.out.println(Arrays.toString(s));
        int[] number = new int[s.length];
        for(int i=0; i<s.length;i++) {
            number[i] = Integer.parseInt(s[i]);
        }
        for (int i=0;i<s.length;i++) {
            System.out.println(number[i]);
        }
    }
}

