class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String str : details) {
            int age = 0;
            for(int i = 11;i < 13; i++) {
                age = ((age * 10) + (str.charAt(i) - '0'));
            }
            if (age > 60) count++;
        } 
        return count;
    }
}