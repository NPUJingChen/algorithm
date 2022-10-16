import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (String s : new Main().getResult(n)) {
            System.out.println(s);
        }
    }

    public String[] getResult(int n) {
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = String.valueOf(i+1);
        }
        if(n==0) {
            return nums;
        }
        
        return new String[0];
    }
}