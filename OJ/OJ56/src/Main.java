import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(orderNumber(arr));
    }

    public static int orderNumber(int[] arr) {
        if(arr.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int difference1 = arr[j] - arr[i];
                    int difference2 = arr[k] - arr[j];
                    if((difference1  * difference2) > 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}