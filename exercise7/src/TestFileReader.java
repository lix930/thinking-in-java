import java.io.*;

/**
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        int c = 0;
        try{
            fr = new FileReader("D:/HelloWorld.java");
            int ln = 0;
            while((c = fr.read()) != -1) {
                System.out.print((char)c);
            }
            fr.close();
        }catch(FileNotFoundException e2) {
            System.out.println("file not found");
        }catch(IOException e) {
            System.out.println("read file error");
        }
        System.out.println("read file success");
    }
}
