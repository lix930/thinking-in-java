/**
 * Created by fish-Xiang on 2016/9/11.
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello";
        System.out.println(s1 == s3); //true

        s1 = new String("hello");
        s2 = new String("hello");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        char[] c = {'s', 'u', 'n', ' ', 'j', 'a', 'v', 'a'};
        String s4 = new String(c);
        String s5 = new String(c, 4, 4);
        System.out.println(s4); //sun java
        System.out.println(s5); //java


        String v1 = "sun java", v2 = "Sun Java";
        System.out.println(v1.charAt(1)); //u
        System.out.println(v2.length()); //8
        System.out.println(v1.indexOf("java")); //4
        System.out.println(v2.indexOf("java")); //-1
        System.out.println(v1.equals(v2)); //false
        System.out.println(v1.equalsIgnoreCase(v2)); //true

        String s = "我是程序员，我在学java";
        String sr = s.replace('我','你');
        System.out.println(sr);
        //你是程序员，你在学java



    }
}
