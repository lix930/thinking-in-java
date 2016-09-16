/**
 * Created by fish-Xiang on 2016/9/16.
 */

import java.net.*;
import java.util.*;
import java.io.*;

public class TestClient {
    public static void main(String[] args) {
        try {
            Socket s1 = new Socket("127.0.0.1", 8888);
            InputStream is = s1.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
            dis.close();
            s1.close();
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
