class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Q5
 {
    public static ListNode detectCycle(ListNode head) {
        //write your code here
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }ListNode temp=head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
    }return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;  // Creating a cycle

        ListNode cycleNode = detectCycle(head);
        
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}

