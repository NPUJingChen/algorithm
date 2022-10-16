import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(new Main().getResult(n));
    }

    public String getResult(int n) {

        String res = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < res.length(); j++) {
                int count =1;
                while (j+1 < res.length()&& res.charAt(j) ==res.charAt(j+1)) {
                    count++;
                    j++;
                }
                sb.append(count).append(res.charAt(j));
            }
            res = sb.toString();
        }
        return res;
    }
}