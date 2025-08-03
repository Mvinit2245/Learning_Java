package day2;

public class LinkedCycle {
	
	public static void main(String args[]) {
		
		
	}
	
	public static boolean hasLoop(ListNode head) {
		
	
		
	}
	
public static boolean loopStart(ListNode head) {
		
	ListNode slow = head ;
	ListNode fast = head;
	
	while(fast !=null && fast.getNExt()!=null) {
		slow = slow.getNext();
		fast = fast.getNext().getNext();
		
		if(slow == fast) {
			break;
		}
	}
	
	slow = head ;
	while(slow != fast) {
		slow = slow.getNext();
		fast = fast.getNext();
	}
		
	}
	
	public static int[] findNextGreater(int[] arr) {
		int[] result = new int[arr.length];
		Stack<Integer> stack =new Stack<Intege>();
		
		for(int i=arr.length-1; i>=0;i--) {
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			result[i] = stack.isEmpty()?-1 : stack.peek();
			stack.push(arr[i]);
		}
		return result;
	}

}

class Node{
	
}


for(i=0; i<arr.length; i++) {

if(arr[i] < arr[i+1]) {
	return arr[i+1];
}
else {
	return -1;
}
}

