/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode a=headA;
        ListNode b= headB;
        
        while(a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
   
}