
import java.io.*;
import java.util.Date;

/**
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestPrintStream3 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileWriter fw = new FileWriter("D:/1.log",true);
            PrintWriter log = new PrintWriter(fw);
            while ( (s=br.readLine()) != null ) {
                if(s.equalsIgnoreCase("exit"))
                    break;
                log.println("------");
                log.println(s.toUpperCase());
                log.flush();
            }

            log.println("====" + new Date() + "====");
            log.flush();
            log.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
