import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            //初始化
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        //sub用来存储前i个数的和
        int[] sub = new int[n+1];
        for (int i = 0; i < n; i++) {
            sub[i + 1] = sub[i] + nums[i];
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            //要求分出m组，i<m时，最多能分出i组
            //当i>m时，最多分出m组
            for (int j = 1; j <= Math.min(i,m); j++) {
                for (int k = 0; k < i ;k++) {
                    //sub[i]-sub[k]是 k+1到i的和
                    dp[i][j] = Math.min(dp[i][j],Math.max(dp[k][j-1],sub[i] - sub[k]));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        System.out.println(splitArray(nums,m));
    }
}