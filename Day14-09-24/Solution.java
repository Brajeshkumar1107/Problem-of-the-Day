class Solution {
    public int longestSubarray(int[] nums) {
        int maxValue = 0, result = 0, streak = 0;

        for(int num : nums) {
            if(num > maxValue) {
                maxValue = num;
                result = 0;
                streak = 0;
            }

            if(num == maxValue) {
                streak++;
            }
            else {
                streak = 0;
            }

            result = Math.max(result, streak);
        }

        return result;
    }
}