
import java.util.Scanner;

public class Maximum69Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(helper(num));
        sc.close();
    }

    private static int helper(int num) {
        String n = Integer.toString(num);
        num = 0;
        boolean flag = true;
        for (char ch: n.toCharArray()) {
            int temp = ch - '0';
            if (temp == 6 && flag) {
                temp = 9;
                flag  = false;
            }
            num = (num * 10) + temp;
        }
        return num;
    }


}
