package leetcode;
import java.util.Arrays;


public class Main {
	static Solution sol = new Solution();
	public static void main(String[] args) {
		int[] array = new int[]{3, 2, 4};
		System.out.println(Arrays.toString(sol.twoSum(array, 6)));
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(7);
		l1.next.next = new ListNode(7);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(1);
		System.out.println(sol.addTwoNumbers(l1, l2).toString());
		
	}

}
