package com.yuchen.leetcodetrainingOct;
/*
 * This test is to make sure whether a LinkedList assigned to another linkedlist can affect each otehr 
 * if one of them is changed
 * 
 * The conclusion is true, from the example below we know that l4 = l3 and then we changed l4's 
 * next node, when we print l3 again, we fount l3 is also changed.
 */
public class TestForLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l3.next =l2;
		l2.next = l1;
		l1.next = null;
		printLinkedList(l3);
		System.out.println("=============");
		ListNode l4 = l3;
		l4.next = new ListNode(0);
		printLinkedList(l3);
	}
	
	public static void printLinkedList(ListNode node){
		while(node!=null){
			System.out.println(node.val);
			node = node.next;
		}
	}

}
