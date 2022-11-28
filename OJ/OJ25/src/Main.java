import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main{
    private final static int N = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(new Main().getGoodDivisor(n));
    }

    public int getGoodDivisor(int n) {

        if (n <= 3) {
            return n;
        }
        int a = n / 3, b = n % 3;
        if (b == 1) {
            return (int) (quickPow(3, a - 1, N) * 4 % N);
        } else if (b == 2) {
            return (int) (quickPow(3, a, N) * 2 % N);
        } else {
            return (int) quickPow(3, a, N);
        }
    }


    /**
     * 快速求幂
     * 取余
     */
    public long quickPow(int p, int q, int MOD) {
        long ans = 1;
        long temp = p;
        while (q != 0) {
            if ((q & 1) == 1) {
                ans = ans * temp % MOD;
            }
            temp = temp * temp % MOD;
            q = q >> 1;
        }
        return ans;
    }
}