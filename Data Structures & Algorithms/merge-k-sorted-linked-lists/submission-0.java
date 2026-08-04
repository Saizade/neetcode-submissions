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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result=null;
        for(int i=0;i<lists.length;i++){
            result=mergelist(result,lists[i]);
        }
        return result;
    }
        public ListNode mergelist(ListNode list1,ListNode list2){
            ListNode dummy=new ListNode(0);
            ListNode curr=dummy;
            while(list1!=null&&list2!=null){
                int val1=list1.val;
                int val2=list2.val;
                if(val1<val2){
                    curr.next=list1;
                    list1=list1.next;
                }
                else{
                    curr.next=list2;
                    list2=list2.next;
                }
                curr=curr.next;
            }
                if(list1!=null){
                    curr.next=list1;
                }
                else{
                    curr.next=list2;
                }
                return dummy.next;
            }
            
        }
    
