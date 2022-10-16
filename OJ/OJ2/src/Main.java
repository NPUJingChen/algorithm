import java.util.*;
import java.lang.*;
/**
 * @author chenjing
 */
public class Main {
    public static void main(String arg[]) {
        Scanner snc =new Scanner(System.in);

        int n =snc.nextInt();
        int k =snc.nextInt();
        List<Integer> nums= new ArrayList<>();
        for(int i=0;i<n;i++){
            nums.add(snc.nextInt());
        }
        System.out.println(k_dis((ArrayList<Integer>) nums,k));
    }
    public static int k_dis (ArrayList<Integer> nums, int k) {

        int n=0;
        int i=0,j=0;
        for(i=0;i<nums.size();i++){
            for(j=i+1;j<nums.size();j++){
                if(Math.abs(nums.get(i)-nums.get(j))==k){
                    n++;
                }
            }
        }
        return n;
    }


}