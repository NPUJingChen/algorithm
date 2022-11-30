import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static boolean canPartition(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for(int num:nums) {
            sum += num;
        }
        if((sum&1) ==1) {
            return false;
        }

        int target = sum/2;

        boolean[][] dp = new boolean[n][target + 1];
        if(nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        for(int i = 1; i < n; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i-1][j];

                if(nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }
                if (nums[i] < j) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[n-1][target];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(canPartition(nums));
    }
}