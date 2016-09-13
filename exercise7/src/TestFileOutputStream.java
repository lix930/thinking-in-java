import java.io.*;
/**
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:/HelloWorld.java");
            out = new FileOutputStream("D:/1.java");
            while((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        }catch(FileNotFoundException e2) {
            System.out.println("file not found");
            System.exit(-1);
        }
        catch(IOException e) {
            System.out.println("file IO exception");
            System.exit(-1);
        }
        System.out.println("file is already copy");

    }
}
