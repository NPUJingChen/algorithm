import java.util.*;

/**
 * @author chenjing
 */
public class Main{

    public List<List<Integer>> res;

    public List<List<Integer>> getFactors(int n) {

        res = new ArrayList<>();
        if(n < 3) {
            return res;
        }
        List<Integer> road = new ArrayList<>();
        dfs(n,2,road);
        return res;
    }

    private void dfs(int n,int i,List<Integer> road) {
        if (n == 1) {
            if(road.size() > 1) {
                res.add(new ArrayList<>(road));
            }
            return;
        }
        for (int j = i; j <= n; j++) {
            if(n % j == 0) {
                road.add(j);
                dfs(n/j,j,road);
                road.remove(road.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Main slt = new Main();

        for(int i=0;i<slt.getFactors(num).size();i++) {

            System.out.println(slt.getFactors(num).get(i));

        }

    }

}