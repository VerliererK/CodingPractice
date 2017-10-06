package codility.lesson2;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] A = {1};
		System.out.println(Arrays.toString(solution(A, 99)));
	}

	public static int[] solution(int[] A, int K) {
		if(A.length < 1)
			return A;
		K = K%(A.length);
		if(K==0)
			return A;
		//旋轉全部，再根據 K 的位置旋轉 sub array
		reverseArray(A, 0, A.length-1);
		reverseArray(A, 0, K-1);
		reverseArray(A, K, A.length-1);
		return A;
	}
	
	public static void reverseArray(int[] A, int start, int end) {
		for(int i=0; i<=(end-start)/2; i++){
			int temp = A[start + i];
			A[start + i] = A[end - i];
			A[end - i] = temp; 
		}
	}
}
