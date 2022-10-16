import java.util.*;

public class Main {

    public static void main(String arg[]) {

        Scanner snc =new Scanner(System.in);

        int n =snc.nextInt();

        int k =snc.nextInt();

        Main main=new Main();

        System.out.println(main.minimumNumbers(n,k));

    }

    public int minimumNumbers(int num, int k) {
        if(num==0) {return 0;}
        for(int n=1;n<=10&&num-k+n>=0;n++){
            if((num-n*k)%10==0&&(num-n*k)>=0) {
                return n;
            }
        }
        return -1;
    }

}