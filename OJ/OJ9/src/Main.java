import java.util.*;

/**
 * @author chenjing
 */
public class Main {

    public static void main(String arg[]) {

        Scanner snc =new Scanner(System.in);

        int n =snc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){

            arr[i]=snc.nextInt();

        }

        Main main=new Main();

        System.out.println(main.maximumGap(arr));

    }

    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]-nums[i]>max){
                max = nums[i+1]-nums[i];
            }
        }
        return max;
    }

}