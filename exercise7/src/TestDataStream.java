/**
 * Created by fish-Xiang on 2016/9/13.
 */

import java.io.*;
public class TestDataStream {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(byteArrayOutputStream);

        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);

            ByteArrayInputStream bais = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

            System.out.println(bais.available());
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
