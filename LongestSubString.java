import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first strings: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second strings: ");
        String str2 = sc.nextLine();

        int result = helper(str1, str2);
        System.out.println(result);
    }

    private static int helper(String s1, String s2) {
        int sum = 0;
        int max = 0;
        int ind = -1;

        int m = s1.length();
        int n = s2.length();

        int[][] a = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    a[i][j] = a[i - 1][j - 1] + 1;

                    if (a[i][j] > max) {
                        max = a[i][j];
                        ind = i - 1;
                    }
                } else {
                    a[i][j] = 0;
                }
            }
        }

        // If a common substring exists
        if (max > 0) {
            System.out.println("Longest Common Substring: ");
            // Go from start index to end index (not reverse)
            for (int i = (ind - max + 1); i <= ind; i++) {
                char ch = s1.charAt(i);
                sum += (int) ch;
                System.out.println(ch + " : " + (int) ch);
            }
        } else {
            System.out.println("No common substring found.");
        }

        return sum;
    }
}
