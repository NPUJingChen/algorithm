import java.util.Scanner;

public class Main {

    public static String[] low={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static String[] mid = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    public static String[] high = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public static String[] level ={"Hundred","Thousand","Million","Billion"};

    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();
        Main main = new Main();
        System.out.println(main.numberToWords(n));
    }

    public String bulidNumber(int num) {
        int a = num % 10;
        num/=10;
        int b = num % 10;
        num /= 10;
        int c = num;
        String str ="";
        if(c!=0) {
            str = str+low[c]+" "+"Hundred"+" ";
        }
        if(b==1) {
            str = str+mid[a];
        } else if(b==0) {
            str = str + low[a];
        } else {
            str = str +high[b]+" "+low[a];
        }
        return str.trim()+" ";
    }

    public String numberToWords(int num) {

        if(num==0) {
            return "Zero";
        }
        int p1 = num % 1000;
        num /= 1000;
        int p2 = num % 1000;
        num /= 1000;
        int p3 = num % 1000;
        num /= 1000;
        int p4 = num;
        String ans ="";

        if(p4 != 0) {
            ans = ans + bulidNumber(p4) +"Billion" + " ";
        }
        if (p3 != 0) {
            ans = ans + bulidNumber(p3) + "Million" + " ";
        }
        if (p2 != 0) {
            ans = ans + bulidNumber(p2) + "Thousand" + " ";
        }
        if(p1 != 0) {
            ans = ans + bulidNumber(p1);
        }
        return ans.trim();
    }
}