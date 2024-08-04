import java.util.*;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        int[] arr = new int[n * (n + 1) / 2];
        int count = 0;
        for(int i = 0 ; i < n; i++) {
            int num = 0;
            for(int j = i; j < n; j++){
                num += nums[j];
                arr[count] = num;
                count++;
            }
        }
        Arrays.sort(arr);

        long res = 0;
        for(int i = left - 1; i < right; i++) {
            res += arr[i];
            res %= 1000000007;
        }
        return  (int) res;
    }
}