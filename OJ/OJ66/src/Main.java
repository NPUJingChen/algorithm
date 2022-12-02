import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right) {
            int area = Math.min(height[left],height[right]) * (right - left);
            result = Math.max(result,area);
            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(maxArea(height));
    }
}