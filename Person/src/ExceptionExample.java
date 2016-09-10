import java.lang.*;
import java.lang.Exception;

/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        String[][] s = new String[5][];

        try {
            s[1][0] = "hello";
            s[1][1] = "你好";
        } catch (NullPointerException e) {
            System.out.println("数组元素没有正确实例化");
        }

        try {
            s[5] = new String[3];
            s[5][1] = "hello";
        } catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println("有异常发生了");
        } catch(Exception e2) {
            System.out.println("数组下标越界");
        }
    }
}
