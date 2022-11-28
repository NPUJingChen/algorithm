import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Main main = new Main();
        System.out.println(main.trueOrFalse(str.toCharArray()));
    }

    public int trueOrFalse(char[] strs) {
        Stack<Character> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for(char c : strs) {
            switch (c) {
                case '|':
                case '&':
                case '!':
                    operations.push(c);
                    break;
                case 't':
                case 'f':
                case '(':
                    numbers.push(c);
                    break;
                case ')':
                    boolean flag = false;
                    char num;
                    switch (operations.pop()) {
                        case '|':
                            flag = false;
                            while ((num = numbers.pop()) != '(') {
                                flag = flag |(num == 't');
                            }
                            numbers.push(flag ? 't' :'f');
                            break;
                        case '&':
                            flag = true;
                            while ((num = numbers.pop()) != '(') {
                                flag = flag &(num == 't');
                            }
                            numbers.push(flag ? 't' : 'f');
                            break;
                        case '!':
                            while ((num = numbers.pop())!='(') {
                                flag = (num != 't');
                            }
                            numbers.push(flag ? 't' : 'f');
                            break;
                    }
                    default :
                        break;
            }
        }

        if(numbers.pop() == 't') {
            return 1;
        } else {
            return 0;
        }
    }
}