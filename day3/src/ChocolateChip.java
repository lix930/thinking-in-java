import access.dessert.Cookie;

/**
 * Created by fish-Xiang on 2016/9/10.
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    protected void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip chocolateChip = new ChocolateChip();
        chocolateChip.chomp();
    }
}
