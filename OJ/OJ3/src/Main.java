import java.util.*;

public class Main {

    public static void main(String arg[]) {

        Scanner snc =new Scanner(System.in);

        int n =snc.nextInt();

        System.out.println(totalMoney(n));

    }

    public static int totalMoney(int n) {
        int week=(n/7)+1;
        //存了几周
        int firstMoney=(1+7)*7/2;
        //第一周存了多少钱
        int lastMoney=firstMoney+7*(week-2);
        //最后一周存了多少钱
        int weekMoney=(firstMoney+lastMoney)*(week-1)/2;
        //完整的周一共存了多少钱
        int day=n%7;
        //除了周剩下的零散的天数
        int firstDayMoney=1+(week-1);
        //这周第一天存了多少钱
        int lastDayMoney=firstDayMoney+(day-1);
        //这周最后一天存了多少钱
        int dayMoney=(firstDayMoney+lastDayMoney)*day/2;
        //天数存了多少钱
        return weekMoney+dayMoney;
    }

}