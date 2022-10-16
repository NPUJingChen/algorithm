import java.util.*;

/**
 * @author chenjing
 */
public class Main {
    public static void main(String arg[]) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();
        int k = snc.nextInt();
        Main main = new Main();
        int res = main.isPP(n,k)?1:0;
        System.out.println(res);
    }

    public boolean isPP(int n,int k){

        int p=1;
        boolean x =false;
        while(p<n) {
            p=p*k;
        }
        if(p>n) {
            x=false;
        } else if (p==n) {
            x = true;
        }
        return x;
    }
}