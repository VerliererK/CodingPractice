package codility.lesson6;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		int[] A = new int[]{-3,1,2,-2,5,6};
		int[] B = new int[]{-1000, -1000, 5, 999, 999, 1000};
		System.out.println(solution(A));
		System.out.println(solution(B));
	}
	
	public static int solution(int[] A){
		Arrays.sort(A);
		int max1 = A[0]*A[1]*A[A.length-1];
		int max2 = A[A.length-3]*A[A.length-2]*A[A.length-1];
		return Math.max(max1, max2);
	}
	public static boolean isTriangle(long P, long Q, long R){
		return P+Q>R && Q+R>P && R+P>Q;
	}
}
