// Last updated: 9/15/2026, 10:24:15 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public boolean isPalindrome(ListNode head) {
13        ListNode curr = head;
14        Stack<Integer> st = new Stack<>();
15        while(curr!=null){
16            st.push(curr.val);
17            curr = curr.next;
18        }
19        curr = head;
20
21        while(curr!=null){
22            if(!st.isEmpty() && st.pop() != curr.val){
23                return false;
24            }
25            curr=curr.next;
26        }
27        return true;
28    }
29}