/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n]; 
        
        for(int[] mat : res) Arrays.fill(mat, -1);

        for(int i = 0; head != null && i <= m / 2; i++) {
            head = helper(i, m, n, res, head);
        }

        return res;
    }

    ListNode helper(int i, int m, int n, int[][] res, ListNode head) {

        for (int k = i; head != null && k <= n-1-i; k++) {
            res[i][k] = head.val;
            head = head.next;
        }

        for(int k = i + 1; head != null && k <= m-2-i; k++) {
            res[k][n-1-i] = head.val;
            head = head.next;
        }

        for(int k = n-1-i; head != null && k >= i; k--) {
            res[m - 1 - i][k] = head.val;
            head = head.next;
        }

        for(int k = m-1-i - 1; head != null && k > i; k--) {
            res[k][i] = head.val;
            head = head.next;
        }
        return head;
    }
}