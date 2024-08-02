class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int countOne = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) countOne++;
        }

        int countZero = 0;
        for(int i = 0; i < countOne; i++) {
            if(nums[i]== 0) countZero++;
        }
        
        int res = countZero;
        int start = 0, end = countOne - 1;
        while(start < n) {
            if(nums[start] == 0) countZero--;
            start++;
            end++;
            if(nums[end % n] == 0) countZero++;

            res = Math.min(res, countZero);
        }
        return res;
    }
}