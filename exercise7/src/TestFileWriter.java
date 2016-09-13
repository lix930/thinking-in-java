import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("d:/1.txt");
            for (int c=0; c<=50000; c++) {
                fw.write(c);
            }
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
