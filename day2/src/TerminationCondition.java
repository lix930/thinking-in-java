/**
 * Created by fish-Xiang on 2016/9/9.
 */
class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut)
            System.out.println("error: checked out");
    }


}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);

        novel.checkIn();
        System.out.println("finalize");
        new Book(true);
        System.out.println("finalize");
        new Book(false);
        System.gc();
    }
}
