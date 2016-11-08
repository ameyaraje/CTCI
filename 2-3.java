package com.ameya;

public class Q2C {
	public static void main(String args[]) {
		ListNode n = new ListNode(1);
		n.next = new ListNode(1);
		n.next.next = new ListNode(2);
		n.next.next.next = new ListNode(4);
		System.out.println("Original List: ");
		
		Q2C obj = new Q2C();
		obj.displayNode(n);
		System.out.println("Updated List: ");
		boolean ans = obj.removeNode(n.next.next);
		obj.displayNode(n);
		System.out.println(ans);
	}
	
	public boolean removeNode(ListNode node) {
		if (node == null || node.next == null)
			return false;
	
		node.val = node.next.val;
		node.next = node.next.next;
		
		return true;
	}
	
	public void displayNode(ListNode head) {
		ListNode ptr = head;
		while (ptr != null) {
			System.out.print("->" + ptr.val);
			ptr = ptr.next;
		}
		System.out.println();
	}
}


