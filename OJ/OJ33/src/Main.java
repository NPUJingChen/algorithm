import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static int MOD = 1337;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        StringBuffer b = new StringBuffer();
        for(int i=0;i<n;i++) {
            b.append(sc.next());
        }
        System.out.println(new Main().bigPow(a, b.toString()));
    }

    public long bigPow(int a, String b) {
        long ans = 1;
        long base = a;
        BigInteger bigInteger = new BigInteger(String.valueOf(b));
        while(!bigInteger.equals(new BigInteger(String.valueOf(0)))) {
            if(bigInteger.and(new BigInteger(String.valueOf(1))).equals(new BigInteger(String.valueOf(1)))) {
                ans = ans * base % MOD;
            }
            base = base * base % MOD;
            bigInteger = bigInteger.divide(new BigInteger(String.valueOf(2)));
        }
        return ans;
    }
}