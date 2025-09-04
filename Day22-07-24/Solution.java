import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < heights.length; i++)     map.put(heights[i], names[i]);

        Arrays.sort(heights);
        int count = 0;
        
        for(int i = heights.length - 1; i >= 0; i--) {
            int h = heights[i];
            String str = map.get(h);
            names[count] = str;
            count++;
        }

        return names;
    }
}