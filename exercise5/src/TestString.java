/**
 * Created by fish-Xiang on 2016/9/11.
 */
public class TestString {
    public static void main(String[] args) {
        String s = "AaaaABBBcc&^adfsfdCCOOkk99876 _haHa";
        String s1 = "sunjavahpjavakojavajjavahahajavajavagoodjava";
        int index = -1;
        int count = 0;
        while((index=s1.indexOf("java")) != -1) {
            s1 = s1.substring(index + "java".length());
            count ++;
        }
        System.out.println(count);
        Long l = new Long("123456");
        long l1 = l;
        System.out.println(l1);
    }
}
