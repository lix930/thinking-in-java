/**
 * Created by fish-Xiang on 2016/9/16.
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class TestSockServer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output = null;
        InputStream in = null;
        OutputStream out = null;

        try {
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            in = s.getInputStream();
            out = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            DataInputStream dis = new DataInputStream(in);
            String str = null;
            while ((output = sc.nextLine()) != null) {
                if (output.equals("exit"))
                    break;
                if ((str = dis.readUTF()) != null) {
                    System.out.println("Client: " + str);
                    System.out.println(" From: " + s.getInetAddress());
                    System.out.println(" Port: " + s.getPort());
                }
                dos.writeUTF(output);
            }
            dis.close();
            dos.close();
            s.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
