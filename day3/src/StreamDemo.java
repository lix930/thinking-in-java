import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class StreamDemo {
    public static void main(String[] args) throws IOException {

        char c;
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, 'q' to quit.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }


}
