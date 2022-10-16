import java.util.*;

/**
 * @author chenjing
 */
public class Main {
    public static void main(String arg[]) {
        Scanner snc =new Scanner(System.in);
        int n =snc.nextInt();
        Main main=new Main();
        System.out.println(main.consecutiveNumbersSum(n));
    }
    public int consecutiveNumbersSum(int n) {

        int res = 0;
        for (int k=1;k*k<2*n;k++){
            if(2*n%k==0&&(2*n/k-k+1)%2==0){
                res++;
            }
        }
        return res;
    }


}