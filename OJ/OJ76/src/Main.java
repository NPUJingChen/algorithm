import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static int maxProfit(int[] cost, int k) {
        int n = cost.length;
        int buy = cost[0] + k;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if(cost[i] + k <buy) {
                buy = cost[i] + k;
            } else if (cost[i] > buy) {
                profit = profit + cost[i] -buy;
                buy = cost[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(maxProfit(cost,k));
    }
}