import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n= snc.nextInt();
        Main main =new Main();
        System.out.println(main.getFibonacci(n));
    }

    public int getFibonacci(int n) {
        if(n==1||n == 2) {
            return 1;
        }
        int p=0,q=0,r=1;
        for (int i = 2; i <= n; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}