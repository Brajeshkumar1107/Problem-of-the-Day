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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null && head.next == null) return head;

        ListNode curr = head;
        
        while (curr.next != null) {
            int num = 0;
            if (curr.val > curr.next.val) {
                num = gcd(curr.val, curr.next.val);
            }
            else {
                num = gcd(curr.next.val, curr.val);
            }
            
            ListNode temp = new ListNode(num);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }

        return head;
    }

    private int gcd(int a, int b) {
        if (b == 0) return  a;
        return gcd(b, a%b);
    }
}