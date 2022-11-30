import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static int rob(int[] nums) {
        int[] max = new int[nums.length];

        if(nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        max[0] = nums[0];
        max[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {
            max[i] = Math.max(max[i-2] + nums[i], max[i-1]);
        }
        return max[max.length-1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = scanner.nextInt();
        }
        System.out.println(rob(ans));
    }
}