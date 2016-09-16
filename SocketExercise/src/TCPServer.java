/**
 * Created by fish-Xiang on 2016/9/16.
 */

import java.io.DataInputStream;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888); //端口号
        while (true) {
            Socket s = ss.accept();  //阻塞
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
        }

    }
}
