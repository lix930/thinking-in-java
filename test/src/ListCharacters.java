/**
 * Created by fish-Xiang on 2016/9/8.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c=0; c<=128; c++) {
            if (Character.isUpperCase(c))
                System.out.println("the value is :" + (int)c + " character is :" + c);
        }
    }
}
