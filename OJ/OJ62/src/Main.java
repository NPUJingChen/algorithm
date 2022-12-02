import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {

    public static int trees(int n) {
        int[] G = new int[n+1];

        G[0] = 1;
        G[1] = 1;
        for(int i = 2; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                G[i] = G[i] + G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trees(n));
    }
}