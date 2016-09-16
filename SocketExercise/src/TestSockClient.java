/**
 * Created by fish-Xiang on 2016/9/16.
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class TestSockClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputStream is = null;
        OutputStream os = null;
        String output = null;

        try {
            Socket socket = new Socket("localhost", 8888);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);

            while ((output = sc.nextLine()) != null) {
                if (output.equals("exit"))
                    break;
                dos.writeUTF(output);
                String s = null;
                if ((s = dis.readUTF()) != null) {
                    System.out.println("Server: " + s);
                }
            }
            dos.close();
            dis.close();
            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
