import java.util.*;

/**
 * @author chenjing
 */
public class Main {
    public static void main(String arg[]) {
        Scanner snc =new Scanner(System.in);
        int n =snc.nextInt();
        Main main=new Main();
        System.out.println(main.convertToTitle(n));
    }

    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            sb.append((char)(columnNumber%26+'A'));
            columnNumber=columnNumber/26;
        }
        sb.reverse();
        return sb.toString();
    }




}