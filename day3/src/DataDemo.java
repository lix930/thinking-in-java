import java.util.Date;

/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class DataDemo {
    public static void main(String[] args) {
        Date day1 = new Date(93,9,30);

        Date day2 = new Date(67,8,14);

        System.out.println(day1.toString());
        System.out.println(day2.toString());
        if ( day1.after(day2))
            System.out.println("day1 after day2");
        else
            System.out.println("day1 before day2");

    }
}
