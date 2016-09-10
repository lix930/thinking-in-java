import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class RegexMatches {
    public static void main(String[] args) {

        String line = "This order was placed for QT3000! OK?";
        String pattern;
        pattern = "(.*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);

        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO  MATCH");
        }
    }
}
