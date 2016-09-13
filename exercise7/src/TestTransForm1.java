import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestTransForm1 {
    public static void main(String[] args) {

        try{
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/1.txt"));
            osw.write("microsoft ibm sun apple hp");
            System.out.println(osw.getEncoding()); //得到编码类型
            osw.close();
            //加true 意思为 追加写
            osw = new OutputStreamWriter(new FileOutputStream("D:/1.txt",true), "gbk");
            osw.write("microsoft ibm sun apple hp");
            System.out.println(osw.getEncoding());
            osw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
