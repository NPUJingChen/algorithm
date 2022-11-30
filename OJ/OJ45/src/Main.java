import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static int longestSubsequence(int[] arr, int difference) {
        int[] dp = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] - arr[j] == difference) {
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = Math.max(result,dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int difference = scanner.nextInt();
        System.out.println(longestSubsequence(arr,difference));
    }
}