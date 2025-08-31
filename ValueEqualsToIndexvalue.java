import  java.util.*;

public class ValueEqualsToIndexvalue {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] numStrings = str.split(" ");
        for (int i = 0; i < numStrings.length; i++) {
            nums.add(Integer.valueOf(numStrings[i]));
        }
        List<Integer> result = helper(nums);
        System.out.println(result);
    }

    private static List<Integer> helper(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (i + 1 == nums.get(i)) result.add(i + 1);
        }
        return result;
    }
}
