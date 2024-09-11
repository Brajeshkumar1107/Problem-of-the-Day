class Solution {
    public int minBitFlips(int start, int goal) {

        int res = 0;
        int xor = start^goal;
        while(xor > 0) {
            xor = xor & (xor - 1);
            res++;
        }a

        return res;
    }
}