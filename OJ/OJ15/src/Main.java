import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println((new Main().calculateResult(str.toCharArray())));
    }

    public char calculateResult(char[] chars) {
        Stack<Character> stack = new Stack<>();
        int charsLength = chars.length;
        for (int iter = charsLength - 1; iter >= 0; iter--) {
            if (chars[iter] == ':') {
                //遇到分号压栈
                stack.push(chars[--iter]);
            } else if (chars[iter] == '?') {
                //遇到问好出栈
                char temp = stack.pop();
                if (chars[--iter] == 'T') {
                    //遇到T出战
                    stack.pop();
                    stack.push(temp);
                }
            } else {
                stack.push(chars[iter]);
            }
        }
        return stack.peek();
    }
}