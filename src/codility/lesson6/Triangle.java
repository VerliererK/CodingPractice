package codility.lesson6;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		int[] A = new int[]{10,2,5,1,8,20};
		int[] B = new int[]{10,50,5,1};
		int[] C = new int[]{Integer.MIN_VALUE,0,1,Integer.MAX_VALUE};
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));
	}
	
	public static int solution(int[] A){
		Arrays.sort(A);
		for(int i=0; i<A.length-2; i++)
			if(isTriangle(A[i], A[i+1], A[i+2]))
				return 1;
		return 0;
	}
	public static boolean isTriangle(long P, long Q, long R){
		return P+Q>R && Q+R>P && R+P>Q;
	}
}
