import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n =snc.nextInt();
        Main main = new Main();
        System.out.println(main.backOne(n));
    }

    public int backOne(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if(n%2==0) {
            return (backOne(n/2)+1);
        } else {
            return (Math.min(backOne(n-1),backOne(n+1))+1);
        }
    }

}