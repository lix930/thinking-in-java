import java.util.*;
/**
 * Created by fish-Xiang on 2016/9/12.
 */
public class BasicContainer {
    public static void main(String[] args) {


        Collection c = new HashSet();

        c.add(new Name("f2", "l2"));
        c.add(new Name("f113", "l1"));
        c.add(new Name("f341", "l3"));
        c.add(new Name("f313", "l3"));
        c.add(new Name("f7", "l3"));
        Iterator i = c.iterator();
        for (Iterator iterator = c.iterator(); i.hasNext();) {
            Name name = (Name) i.next();
            if (name.getFirstName().length() < 3) {
                i.remove();
                // 如果换成 c.remove(name) 则会产生 错误
            }
        }
    //    Collections.sort(N);
        System.out.println(c);
    //    c.remove("hello");
    //    c.remove(100);



        LinkedList l1 = new LinkedList();
        l1.add(new Name("xiang","li"));
        l1.add(new Name("du","lin"));
        l1.add(new Name("yunlong","lin"));
        l1.add(new Name("xiang","liu"));
        Collections.sort(l1);
        System.out.println("sorted list: " + l1);

    }
}
// 要实现Comparable接口
// 重写 compareTo 方法
class Name implements Comparable{
    private String firstName, lastName;

    public Name(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name name = (Name) obj;
            return (firstName.equals(name.firstName)) &&
                    (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }

    public int compareTo (Object o) {
        Name n = (Name)o;
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
}
