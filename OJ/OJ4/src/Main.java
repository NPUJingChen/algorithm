import java.util.*;

public class Main {

    public static void main(String arg[]) {

        Scanner snc =new Scanner(System.in);

        int n =snc.nextInt();

        System.out.println(maximumEvenSplit(n));

    }

    public static List<Long> maximumEvenSplit(long finalSum) {

        if((finalSum&1)==1){
            return new ArrayList<Long>();
        }
        else {
            List<Long> result=new ArrayList<Long>();
            for(long i=2;finalSum>0;i=i+2){
                if(finalSum<=i*2){
                    result.add(finalSum);
                    break;
                }
                result.add(i);
                finalSum=finalSum-i;
            }
            return result;
        }
    }

}