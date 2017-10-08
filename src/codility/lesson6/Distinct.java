package codility.lesson6;

import java.util.HashSet;

public class Distinct {

	public static void main(String[] args) {
		int[] A = new int[]{-1,1,1,1,1,1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		HashSet<Integer> set = new HashSet<>();
		for(int a : A)
			set.add(a);
		return set.size();
	}
}
