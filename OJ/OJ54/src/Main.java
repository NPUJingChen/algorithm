import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static long maxTaxiEarnings(int n, int[][] rides) {

        long[] dp = new long[n + 1];

        //按终点由小到大排序

        Arrays.sort(rides, (a, b) -> a[1] - b[1]);

        int index = 0;

        for (int i = 1; i <= n; i++) {

            //出租车从i-1位置走到i位置,不载人时他的最大收益等于dp[i-1]

            dp[i] = dp[i - 1];

            while (index < rides.length && rides[index][1] <= i) {

                //更新以i为终点载人情况的最大盈利

                dp[i] = Math.max(dp[i], dp[rides[index][0]] + rides[index][1] - rides[index][0] + rides[index][2]);

                index++;

            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] rides = new int[m][3];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                rides[i][j] = scanner.nextInt();
            }
        }
        System.out.println(maxTaxiEarnings(n,rides));
    }
}