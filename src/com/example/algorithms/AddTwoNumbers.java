package com.example.algorithms;

public class AddTwoNumbers {

//	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//	Output: 7 -> 0 -> 8
//	Explanation: 342 + 465 = 807.
	public static void main(String[] args) {
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);
		l11.next = l12;
		l12.next = l13;

		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l21.next = l22;
		l22.next = l23;
		ListNode ret = addTwoNumbers(l11,l21);
		do {
			System.out.println(ret.val);
			ret = ret.next;
		}while(ret != null);
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode head = new ListNode(0);
	        if(l1== null && l2 == null){
	            return head;
	        }else if(l2 == null){
	            return l1;
	        }else if(l1 == null ){
	            return l2;
	        }
	        ListNode index = head;
	        ListNode temp1 = l1;
	        ListNode temp2 = l2;
	        int c =0;
	        do{ 
	            int v1 =0;
	            if(temp1 != null)
	            {
	                v1 = temp1.val;
	            }
	            int v2 =0;
	            if(temp2 != null)
	            {
	                v2 = temp2.val;
	            }
	            
	            int sum = v1+ v2 +c;
	            if(sum >=10) {
	            	c = sum/10;
	            	sum = sum%10;
	            }else {
	            	c =0;
	            }
	            System.out.println(sum);
	            index.next = new ListNode(sum);
	            index = index.next;
	            if(temp1 != null) {
	            	temp1 = temp1.next;
	            }
	            if(temp2 != null) {
	            	temp2 = temp2.next;
	            }
	        }while(temp1 != null || temp2 != null);
	        if(c!=0){
	            index.next = new ListNode(c);
	            index = index.next;
	        }
	        return head.next;
    }
	
	
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
}
