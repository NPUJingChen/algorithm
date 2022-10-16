import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();
        Main main = new Main();
        System.out.println(main.intHibonacci(n));
    }
    public int intHibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int x = 0, y = 1, z = 1;
            int sum = 0;
            for (int i = 3; i <= n; i++) {
                sum = x + y + z;
                x = y;
                y = z;
                z = sum;
            }
            return sum;
        }
    }
}