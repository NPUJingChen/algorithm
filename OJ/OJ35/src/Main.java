import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner snc = new Scanner(System.in);
        int n=snc.nextInt();
        Main main = new Main();
        System.out.println(main.isFour(n));
    }

    public boolean isFour(int n) {

        while(n%4==0) {
            n=n/4;
        }
        return n==1;
    }
}