import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static int minASCII(String str1,String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i-1][0] + str1.charAt(i-1);
        }
        for (int j = 1; j <= m; j++) {
            dp[0][j] = dp[0][j-1] + str2.charAt(j-1);
        }

        for(int i = 1; i <= n;i++) {
            for (int j = 1; j <= m; j++) {
                int c1 = str1.charAt(i-1);
                int c2 = str2.charAt(j-1);

                if(c1 == c2) {
                    //不需要删除
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i][j-1] + c2, dp[i-1][j] + c1);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(minASCII(str1,str2));
    }
}