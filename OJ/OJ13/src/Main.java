import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static void main(String[] args){
        Scanner snc=new Scanner(System.in);
        int n=snc.nextInt();
        Main main = new Main();
        System.out.println(main.intaddSumOfN(n));
    }

    public int intaddSumOfN(int n){
        boolean flag=n > 0 && (n += intaddSumOfN(n - 1)) > 0;
        return n;
    }
}