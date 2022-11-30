import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main{

    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(new Main().getResult(n));
    }

    public int getResult(int n) {
        long a = (1L << n) - 1L;
        long b = a - 1L;
        long c = b / 2L;
        long ans = ((a % MOD) * pow(b % MOD, c)) % MOD;

        return (int) ans;

    }

    public long pow(long b, long c) {
        long ans = 1;
        while (c > 0) {
            if ((c & 1) == 1) {
                ans = (ans * b) % MOD;
            }
            c >>= 1;
            b = (b * b) % MOD;
        }
        return ans;

    }
}