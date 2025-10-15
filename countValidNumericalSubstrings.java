import java.util.*;

public class countValidNumericalSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Result: " + helper(str));
        sc.close();
    }

    private static int helper(String S) {
        int count = 0;
        int n = S.length();
        int i = 0;

        while (i < n) {
            // Check if current char is digit
            if (Character.isDigit(S.charAt(i))) {
                int start = i;

                // Move till the end of this digit sequence
                while (i < n && Character.isDigit(S.charAt(i))) {
                    i++;
                }

                int end = i - 1;

                // Check boundaries (must have letters on both sides)
                if (start > 0 && end < n - 1) {
                    if (Character.isLowerCase(S.charAt(start - 1)) &&
                        Character.isLowerCase(S.charAt(end + 1))) {
                        count++;
                    }
                }
            } else {
                i++;
            }
        }

        return count;
    }
}
