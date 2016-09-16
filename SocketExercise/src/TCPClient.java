/**
 * Created by fish-Xiang on 2016/9/16.
 */
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1", 8888);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Thread.sleep(3000);
        dos.writeUTF("hello server!222");
        dos.flush();
        dos.close();
        s.close();
    }
}
