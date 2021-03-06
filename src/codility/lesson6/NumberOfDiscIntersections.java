package codility.lesson6;

import java.util.Arrays;

public class NumberOfDiscIntersections {

	public static void main(String[] args) {
		int[] A = new int[]{1,5,2,1,4,0,1,5,2,1,4,0,1,5,2,1,4,0,5,6,8,7,9,14,5};
		//int[] A = new int[]{1, 2147483647, 0};
		//int[] A = new int[50000];
		System.out.println(solution(A));
		System.out.println(solution_slow(A));
	}

	//O(N^2)
	public static int solution_slow(int[] A){
		int intersect = 0;
		for(int i=0; i<A.length; i++)
			for(int j=i+1; j<A.length; j++)
				if((long)A[i]+(long)A[j] >= j-i){
					intersect++;
					if(intersect > 10000000)
						return -1;
				}
		return intersect;
	}

	//O(NlogN)
	//A[i] + A[j] >= j-i  --->  (far) A[i] + i >= (near) j - A[j]
	//
	// example: [1,5,2,1,4,0]
	// far = [1 4 4 5 6 8], near = [-4 -1 0 0 2 5] (after sort)
	// nonIntersect = (near < far)
	// far[0]<far[1]<far[2]<near[5] ---> nonIntersect = 3
	// far[0]<near[4] ---> nonIntersect = 3 + 1
	// far[0]<near[3] = false ---> finish
	//
	// intersect = all - nonIntersect = N*(N-1)/2 - nonIntersect;
	//Be care of Overflow...
	public static int solution(int[] A){
		int N = A.length;
		long[] far = new long[N];
		long[] near = new long[N];
		for(int i=0; i<N; i++)
			far[i] = (long)A[i]+i;
		for(int i=0; i<N; i++)
			near[i] = i-(long)A[i];
		Arrays.sort(far);
		Arrays.sort(near);
		
		int i = N-1;
		int j = N-1;
		long nonIntersect = 0;
		
		while(i>=0 && j>=0){
			if(near[i] > far[j]){
				nonIntersect += j+1;
				i--;
			}
			else
				j--;
		}
		//Be care of Overflow...
		long intersect = (long)N*(N-1) / 2 - nonIntersect;
		if(intersect > 10000000)
			return -1;
		return (int) intersect;
	}
}
