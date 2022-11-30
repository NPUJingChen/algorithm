import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
            System.out.println(new Main().longestLine(grid));
        }

    }


        public int longestLine ( int[][] M){
            if (M == null || M.length == 0 || M[0].length == 0)
                return 0;
            int ans = 0;
            int[][] horizontal = new int[M.length][M[0].length];
            int[][] vertical = new int[M.length][M[0].length];
            int[][] diagonal = new int[M.length][M[0].length];
            int[][] antidiagonal = new int[M.length][M[0].length];
            for (int i = 0; i != M.length; ++i) {
                for (int j = 0; j != M[0].length; ++j) {
                    if (M[i][j] == 0) {
                        horizontal[i][j] = 0;
                        vertical[i][j] = 0;
                        diagonal[i][j] = 0;
                        antidiagonal[i][j] = 0;
                    } else {
                        horizontal[i][j] = j > 0 ? horizontal[i][j - 1] + 1 : 1;
                        vertical[i][j] = i > 0 ? vertical[i - 1][j] + 1 : 1;
                        diagonal[i][j] = i > 0 && j > 0 ? diagonal[i - 1][j - 1] + 1 : 1;
                        antidiagonal[i][j] = i > 0 && j < M[0].length - 1 ? antidiagonal[i - 1][j + 1] + 1 : 1;
                        ans = Math.max(ans, horizontal[i][j]);
                        ans = Math.max(ans, vertical[i][j]);
                        ans = Math.max(ans, diagonal[i][j]);
                        ans = Math.max(ans, antidiagonal[i][j]);
                    }
                }
            }
            return ans;
        }
    }
