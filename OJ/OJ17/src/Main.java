import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author chenjing
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSum = scanner.nextInt();
        String numStr = "";
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while ((numStr = scanner.next()).equals("q") == false) {
            nums.add(Integer.parseInt(numStr));
        }
        System.out.println(new Main().minSelect(targetSum, nums));
    }

    public int getSteps(ArrayList<Integer> nums, int currentSum, int targetSum, int frontFlag, int backFlag) {
        if (currentSum > targetSum) {
            return -1;
        } else if (currentSum == targetSum) {
            return 1;
        } else {
            if (frontFlag < backFlag) {
                //从前往后搜索
                int frontToBack = getSteps(nums, currentSum + nums.get(frontFlag), targetSum,frontFlag + 1,backFlag);
                //从后往前搜索
                int backToFront = getSteps(nums,currentSum + nums.get(backFlag - 1),targetSum,frontFlag,backFlag - 1);

                if(frontFlag == -1 && backToFront ==-1) {
                    return  -1;
                } else if(frontFlag == -1) {
                    return backToFront + 1;
                } else if (backToFront == -1) {
                    return frontToBack + 1;
                } else {
                    if (backToFront > frontToBack) {
                        return  frontToBack + 1;
                    } else {
                        return backToFront + 1;
                    }
                }
            } else {
                return -1;
            }
        }

    }

    public int minSelect(int targetSum, ArrayList<Integer> nums) {
        if(nums.size() >= 2) {
            //从前往后
            int frontToBack = getSteps(nums,nums.get(0),targetSum,1,nums.size());
            //从后往前
            int backToFront = getSteps(nums, nums.get(nums.size() - 1),targetSum,0,nums.size() - 1);

            if(frontToBack == -1 && backToFront == -1) {
                return - 1;
            } else if (frontToBack == -1) {
                return backToFront;
            } else if (backToFront == -1) {
                return frontToBack;
            } else {
                if(backToFront > frontToBack) {
                    return frontToBack;
                } else {
                    return backToFront;
                }
            }
        } else if (nums.size() == 1) {
            if(nums.get(0) == targetSum) {
                return 1;
            }
        }
        return -1;
    }
}
