# 常用类
## 字符串相关类
 java.lang.String 类代表**不可变**的字符序列 
 
 "xxxxxxx" 为该类的一个对象
 
 String 类的常见构造方法：
 - String(String original)
 - String(char[] value)
 - String(char[] value, int offset, int count)
 ```java
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
    }
}
 ```
 
 - public char charAt(int index) 
 - public int length()
 - public int indexOf(String str)
 - public int indexOf(String str, int fromIndex)
 - public boolean equalsIgnoreCase(String another)
 - public String replace(char oldChar, char newChar)
 
 ```java
public class StringTest {
    public static void main(String[] args) {
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
 ```
 
 - public boolean startsWith(String prefix)
 - public boolean endsWith(String suffix)
 - public String toUpperCase()
 - public String toLowCase()
 - public String substring(int beginIndex)
 - public String substring(int beginIndex, int endIndex)
 - public String trim()
 
 ```java
 String s = "Welcome to Java World!";
 String s1 = "    sun java    ";
 System.out.println(s.startsWith("Welcome")); //true
 System.out.println(s.endsWith("World")); //false
 
 String sL = s.toLowerCase();
 String sU = s.toUpperCase();
 System.out.println(sL); //welcome to java world!
 System.out.println(sU); //WELCOME TO JAVA WORLD!
 
 String subS = s.substring(11);
 System.out.println(subS); //java World!
 String sp = s1.trim();
 System.out.println(sp); //sun java
 ```
- public static String valueOf(...) 
- public String[] split(String regex)
 ```java
 public class Test {
     public static void main(String[] args) {
         int j = 1234567;
         String sNumber = String.valueOf(j);
         System.out.println("j 是" + sNumber.length() + "位数。");
         String s = "Mary, F, 1976";
         String[] sPlit = s.split(",");
         for (int i=0; i<sPlit.lentgh; i++) {
             System.out.println(sPlit[i]);
         }
     }
 }
 ```
## 基本数据类型包装类
## Math类
## File类
## 枚举类 
