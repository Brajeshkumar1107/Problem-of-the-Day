package Day11-07-24;

class Solution {
    public int maximumGain(String s, int x, int y) {
        int countA = 0, countB = 0;;
        int res = 0;
        int less = (x > y) ? y : x;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch > 'b') {
                res += Math.min(countA, countB) * less;
                countA = 0;
                countB = 0;
            }
            else if(ch == 'a') {
                if(x < y && countB > 0){
                    countB--;
                    res += y;
                }
                else countA++;
            }
            else {
                if(x > y && countA > 0) {
                    countA--;
                    res += x;
                }
                else countB++;
            }
        }
        res += Math.min(countA, countB) * less;
        return res;
    }
}