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
    public int[] nextLargerNodes(ListNode head) {
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
       int answer[]=new int[size];
       curr=head;
       int i=0;
     
    while(curr!=null){
        ListNode temp=curr.next;
        while(temp!=null){
        if(temp.val>curr.val){
            answer[i]=temp.val;
            break;
        }
         temp=temp.next;
        }
    curr=curr.next;
    i++;
    }
    return answer;
    }
}