import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        List<Map.Entry<Character, Integer>> list  = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> {
            return  e2.getValue().compareTo(e1.getValue());
        });

        int i = 0;
        int res = 0;
        for(Map.Entry<Character, Integer> list1 : list){
            if(i >= 0 && i < 8) {
                res += (list1.getValue() * 1);
            }
            else if (i >= 8 && i < 16) {
                res += (list1.getValue() * 2);
            }
            else if (i >= 16 && i < 24){
                res += (list1.getValue() * 3);
            }
            else res += (list1.getValue() * 4);
            i++;
        }
        // System.out.println(ch);
        return res;
    }
}

// Better Approach
class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i) - 'a']++;
        }
        Arrays.sort(arr);
        int i=25;
        int count = 0;
        int start = 1;
        int ans =0;
        while( i >= 0 && arr[i] != 0){
            ans+=(start * arr[i]);
            count++;
            if(count == 8){ 
                start++;
                count = 0;
            }
            i--;
        }
        return ans;
    }
}
