import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static int minCost(int[][] costs) {
        int n = costs.length;
        int[] dp = new int[3];
        for (int i = 0; i < 3; i++) {
            dp[i] = costs[0][i];
        }

        for (int i = 1; i < n; i++) {
            int[] dpNew = new int[3];
            dpNew[0] = Math.min(dp[1], dp[2]) + costs[i][0];
            dpNew[1] = Math.min(dp[0], dp[2]) + costs[i][1];
            dpNew[2] = Math.min(dp[0], dp[1]) + costs[i][2];

            dp = dpNew;
        }

        return Arrays.stream(dp).min().getAsInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] costs = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }
        System.out.println(minCost(costs));
    }
}