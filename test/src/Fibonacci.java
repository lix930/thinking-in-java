import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by fish-Xiang on 2016/9/8.
 */
public class Fibonacci {

    public static BigInteger compute2(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;
        for (int i = 2; i < n; i++) {
            result = num1.add(num2);
            num2 = num1;
            num1 = result;
        }
        return result;
    }


    public static void main(String[] args) {
        int f[] = new int[10];
        f[0] = 1;
        f[1] = 1;
        for (int i=2; i<10; i++)
            f[i] = f[i-1] + f[i-2];
        for (int num : f)
            System.out.println(num);
        System.out.println("输入要打印的第几个斐波拉契数：");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        BigInteger result = compute2(x);
        System.out.print(result.toString());


    }
}
