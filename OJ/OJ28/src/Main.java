import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print(new Main().getResult(n, k));
    }

    public char getResult(int n, int k) {
        if(k==1) {
            return '0';
        }

        int mid = 1<<(n-1);

        if(k==mid) {
            return '1';
        } else if(k<mid) {
            return getResult(n-1,k);
        } else {
            k = mid*2 -k;
            return invert(getResult(n-1,k));
        }
    }

    public char invert(char bit) {
        return (char) ('0' + '1' -bit);
    }
}