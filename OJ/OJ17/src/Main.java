import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSum = scanner.nextInt();
        String numStr = "";
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while ((numStr = scanner.next()).equals("q") == false) {
            nums.add(Integer.parseInt(numStr));
        }
        System.out.println(new Main().minSelect(targetSum, nums));
    }

    private boolean minSelect(int targetSum, ArrayList<Integer> nums) {
    }
}