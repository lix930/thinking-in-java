import java.io.*;

/**
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestBufferStream2 {
    public static void main(String[] args) {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/1.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/1.txt"));
            String s = null;

            for (int i =1; i<= 1; i++) {
                s = String.valueOf(Math.random());
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            //读数据之前将缓冲区的数据涮出
            while ((s= bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
