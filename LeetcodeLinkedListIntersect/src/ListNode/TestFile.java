/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListNode;

/**
 *
 * @author Huawei
 */
public class TestFile {
    public static void main(String[] args) {
        ListNode a= new ListNode(4);
        a.next=new ListNode(1);
        a.next.next=new ListNode(8);
        a.next.next.next=new ListNode(4);
        a.next.next.next.next=new ListNode(5);
        
        ListNode b= new ListNode(5);
        b.next= new ListNode(6);
        b.next.next= new ListNode(1);
        b.next.next.next= new ListNode(8);
        b.next.next.next.next= new ListNode(4);
        b.next.next.next.next.next= new ListNode(5);
        
        b.next.next.next=a.next.next;
        
        Solution solution = new Solution();
        ListNode intersectNode=solution.getIntersectionNode(a, b);
        
        if (intersectNode != null) {
            System.out.println("Intersection Node Value: " + intersectNode.val);
        } else {
            System.out.println("No Intersection Node");
        }
    }
    
}
