import java.util.*;

public class TrapeziumPattern {
    public static void main(String[] args) {
        int n = 6;

        int start = 1;
        int end = n * (n + 1) / 2;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }

            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(start++ + "*");
            }

            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(end--);
                if (j < n / 2 - i - 1) System.out.print("*");
            }
            System.out.println();
        }
    }
}
