package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			if(map.containsKey(target-nums[i]))
				return new int[]{map.get(target-nums[i]), i};
			map.put(nums[i], i);
		}
		return new int[]{-1, -1};
	}

	public String reverseString(String s) {
		StringBuilder builder = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--)
			builder.append(s.charAt(i));
		return builder.toString();
	}
	public String reverseString_array(String s) {
		char[] array = s.toCharArray();
		int i=0, j=array.length-1;
		while(i<j){
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;j--;
		}
		return new String(array);
	}
	public String reverseString_builder(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public List<String> FizzBuzz(int n){
		List<String> list = new ArrayList<>();
		for(int i=1; i<=n; i++){
			String s = i + "";
			if(i%3==0)
				s = "Fizz";
			if(i%5==0)
				s = "Buzz";
			if(i%3==0 && i%5==0)
				s = "FizzBuzz";
			list.add(s);
		}
		return list;
	}

	//TODO: WHY???
	public int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}
	public int singleNumber_set(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i:nums)
			if(set.contains(i))
				return i;
			else
				set.add(i);
		return 0;
	}


	//TODO: WHY???
	public int getSum(int a, int b) {
		if(a==b)
			return a<<1;
		else
			return a|b;
	}

	public void moveZeroes(int[] nums) {
		int index = 0;
		for(int i=0; i<nums.length; i++)
			if(nums[i]!=0) nums[index++] = nums[i];
		for(int i=index; i<nums.length; i++)
			nums[i] = 0;
	}

	public int titleToNumber(String s) {
		char[] array = s.toCharArray();
		int num = 0;
		for(char c : array)
			num += (int)c;
		return ((num/65)-1)*26 + (num%65)+1;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int value = l1.val+l2.val;
		ListNode l = new ListNode(-1);
		ListNode l3 = new ListNode(value%10);
		l.next = l3;
		while(l1.next !=null && l2.next !=null){
			int nextValue = l1.next.val+l2.next.val;
			l3.next = new ListNode(value/10 + nextValue%10);
			value = nextValue;
			l1 = l1.next;
			l2 = l2.next;
			l3 = l3.next;
		}
		return l.next;
	}

	
}
