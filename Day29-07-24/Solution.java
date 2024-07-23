import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int a : nums)   freq.put(a,freq.getOrDefault(a,0) + 1);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((e1,e2) -> {
            int compareValue = e1.getValue().compareTo(e2.getValue());
            if(compareValue == 0) {
                return e2.getKey().compareTo(e1.getKey());
            }
            else return compareValue;   
        });
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int n = entry.getValue();
            int num = entry.getKey();
            for(int i = 0; i < n; i++)  {
                nums[count] = num;
                count++;
            }
        }
        
        return nums;
    }
}