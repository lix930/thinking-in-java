/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class StringDemo {
    public static void main(String[] args) {
        String greeting = "Hello world!";
        String name = "li xiang";
        String school = "DHU";
        int len = greeting.length();
        System.out.println(name.compareTo(greeting));
        System.out.println(greeting.compareTo(name));
        System.out.println(greeting.compareTo(school));
        System.out.println(name.concat(greeting));
        System.out.println("the length is: " + len);
    }
}
