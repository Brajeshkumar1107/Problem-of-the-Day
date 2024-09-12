class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String str = words[i];

            for(int j = 0; j < str.length(); j++) {
                int idx = allowed.indexOf(str.charAt(j));
                if(idx == -1) break;
                if(j == str.length() - 1)   count++;
            }
        }
        return count;
    }
}