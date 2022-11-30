import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][3][2];

        for(int k = 0;k <= 2; k++) {
            dp[0][k][0] = 0;
            dp[0][k][1] = -prices[0];
        }

        for(int i = 1; i < prices.length; i++) {
            dp[i][0][1] = Math.max(dp[i-1][0][1], dp[i-1][0][0] - prices[i]);

            for(int k = 1; k <= 2; k++) {
                dp[i][k][0] = Math.max(dp[i-1][k][0],dp[i-1][k-1][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1],dp[i-1][k][0] -prices[i]);
            }
        }
        return dp[prices.length-1][2][0];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        System.out.println(maxProfit(prices));
    }

}