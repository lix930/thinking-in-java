import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * System.setOut(ps); 改变标准输出 为 输出文件
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestObjectIO {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("d:/1.txt");
            ps = new PrintStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (ps != null) {
            System.setOut(ps);
        }

        int ln = 0;
        for (char c = 0; c <= 60000; c++) {
            System.out.print(c + " ");
            if (ln++ > 100) {
                System.out.println();
                ln = 0;
            }
        }
    }
}
