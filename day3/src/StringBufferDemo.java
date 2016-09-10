/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("StringBufferDemo ");
        sBuffer.append("String Buffer Test");
        System.out.println(sBuffer);
        System.out.println(sBuffer.reverse());
        System.out.println("capacity: " + sBuffer.capacity());
        System.out.println("length: " + sBuffer.length());
    }
}
