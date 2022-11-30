import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print(new Main().getPermutation(n,k));
    }

    String ans = "";
    int cnt;

    public String getPermutation(int n, int k) {
        boolean[] visited = new boolean[n + 1];
        cnt = k;
        backTrack(n, new StringBuilder(), visited);
        return ans;
    }

    private boolean backTrack(int n, StringBuilder sb, boolean[] visited) {
        if (sb.length() == n) {
            if (--cnt == 0) {
                ans = sb.toString();
                return true;
            }
            return false;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }
            sb.append(i);
            visited[i] = true;
            //剪枝，找到答案了就直接返回，不要继续了
            if (backTrack(n, sb, visited)) {
                return true;
            }
            visited[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
        return false;
    }

}