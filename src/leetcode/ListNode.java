package leetcode;

public class ListNode {
	@Override
	public String toString() {
		String s = "";
		ListNode l = this;
		while(l!=null){
			s += l.val;
			l = l.next;
		}
		return s;
	}
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
