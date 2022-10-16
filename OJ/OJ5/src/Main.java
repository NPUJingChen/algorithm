import java.util.*;
import java.lang.Math;
/**
 * @author chenjing
 */
public class Main {

    public static void main(String arg[]) {

        Scanner snc =new Scanner(System.in);

        int n =snc.nextInt();

        Main main=new Main();

        System.out.println(main.countDigitOne(n));

    }

    public int countDigitOne(int n) {
        // 2021
        int res = 0;
        for (int i = 1; i <= n; i *= 10) {
            res =res+ (n / (i * 10)) * i + Math.min(Math.max(n % (i * 10) - i + 1,0), i);
        }
        return res;
    }
}