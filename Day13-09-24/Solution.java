class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if(left > 0) {
                res[i] = arr[left - 1] ^ arr[right];
            }
            else  {
                res[i] = arr[right];
            }
        }
        
        return res;
    }
}