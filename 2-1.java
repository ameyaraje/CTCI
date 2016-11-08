package com.ameya;

import java.util.Set;
import java.util.HashSet;

public class Q2A {
	
	public static void main(String args[]) {
		ListNode n = new ListNode(1);
		n.next = new ListNode(1);
		n.next.next = new ListNode(2);
		n.next.next.next = new ListNode(4);
		
		System.out.println("Original List: ");
		Q2A obj = new Q2A();
		obj.displayNode(n);
		
		System.out.println("Updated List: ");
		ListNode x = obj.removeDuplicate(n);
		obj.displayNode(n);
	}
	
	public ListNode removeDuplicate(ListNode head) {
		if (head == null)
			return head;
		
		Set<Integer> set = new HashSet<Integer>();
		
		ListNode ptr1 = head;
		ListNode ptr2 = head.next;
		
		set.add(ptr1.val);
		
		while (ptr2 != null) {
			if (set.contains(ptr2.val)) {
				ptr1.next = ptr2.next;
			}
			else {
				set.add(ptr2.val);
				ptr1 = ptr2;
				ptr2 = ptr2.next;
			}
		}
		return head;
	}
	
	public ListNode removeDuplicate2(ListNode head) {
		if (head == null)
			return head;
		
		ListNode ptr = head;
		
		while (ptr != null) {
			ListNode runner = ptr;
			while (runner.next != null) {
				if (runner.val == ptr.val) {
					runner.next = runner.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			ptr = ptr.next;
		}
		
		return head;
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

class ListNode {
	int val;
	ListNode next;
	public ListNode (int val) {
		this.val = val;
		next = null;
	}
}
