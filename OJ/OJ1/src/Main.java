import java.util.*;

/**
 * @author chenjing
 */
public class Main {
    public static void main(String arg[]) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = snc.nextInt();
        }
        Main main = new Main();
        System.out.println(main.hIndex(arr));
    }

    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int h = 0;
        for (int j = citations.length - 1; j >= 0; j--) {
            if (citations[j] > h) {
                h++;
            }
        }
        return h;
    }
}