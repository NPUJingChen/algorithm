import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(new Main().specialSection(a,low,high));
    }

    public int specialSection(int[] nums, int low, int high) {
        int sectionNumber = 0; // 符合要求区间的个数
        int sectionSum = 0; // 区间内的数字和
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sectionSum += nums[j];
                if (sectionSum >= low && sectionSum <= high) {
                    sectionNumber++;
                }
            }
            //还原
            sectionSum = 0;
        }
        return sectionNumber;
    }
}