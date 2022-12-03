import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static int minCost(int[] costs) {
        int n = costs.length;
        Arrays.sort(costs);
        int result = 0;
        if (n >= 2) {
            for (int i = n-1; i >= 1; i--) {
                int temp = costs[i] + costs[i-1];
                result += temp;
                i = i-2;
                if(i == 1) {
                    result += costs[0];
                }
            }
        }
        else {
            result += costs[0];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = scanner.nextInt();
        }
        System.out.println(minCost(costs));
    }
}