package codility.lesson15;

import java.util.HashSet;

public class AbsDistinct {

	public static void main(String[] args) {
		int[] A = new int[6];
		A[0] = -5;
		A[1] = -3;
		A[2] = -1;
		A[3] =  0;
		A[4] =  3;
		A[5] =  6;
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int a : A)
        	hset.add(Math.abs(a));
        return hset.size();	
    }

}
