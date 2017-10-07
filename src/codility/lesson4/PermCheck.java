package codility.lesson4;

import java.util.HashSet;

public class PermCheck {

	public static void main(String[] args) {
		int[] A = new int[] {4,1,1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		HashSet<Integer> set = new HashSet<>();
        for(int a : A)
        	set.add(a);
        int num = 1;
        while(set.contains(num))
        	num++;
		return num-1 == A.length ? 1 : 0;
	}

}
