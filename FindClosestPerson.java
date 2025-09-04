
public class FindClosestPerson {
    public static void main(String[] args) {
        int x = 2,
            y = 7, 
            z = 4;
        System.out.println(helper(x,y,z));
    }

    private static int helper(int x, int y, int z) {
        int a = Math.abs(z - x);
        int b = Math.abs(z - y);
        if (a == b) return 0;
        if (a < b) return 1;
        return 2;
    }
}
