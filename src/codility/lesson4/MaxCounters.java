package codility.lesson4;

import java.util.Arrays;

public class MaxCounters {
	public static void main(String[] args) {
		int[] A = new int[] {6,4,4,6,3,5,6,1,1,6,4,4,3,1,6,1,6,1,6,1,6,1,1,6,1,6};
		//int[] A = new int[] {2,1,1,2,1};
		//int[] A = new int[1100000];
		//Arrays.fill(A, 1001);
		System.out.println(Arrays.toString(solution(5, A)));
		System.out.println(Arrays.toString(solution_slow(5, A)));
	}

	//O(M+N)
	//儲存前一次需要 maxCounter 的 max 值
	//最後再將低於 max 值的 counter 補上
	public static int[] solution(int N, int[] A) {
		int[] counter = new int[N];
		int max = 0;
		int previousMax = 0;

		//O(M)
		for(int i=0; i<A.length; i++){
			if(A[i] == N+1){
				previousMax = max;
			}
			else if(A[i] < N+1){
				if(counter[A[i]-1] < previousMax)
					//小於上一次 maxCounter
					//表示需要 maxCount 並 count 1次
					counter[A[i]-1] = previousMax + 1;
				else
					counter[A[i]-1]++;
				max = Math.max(max, counter[A[i]-1]);
			}
		}
		//O(N)
		for(int i=0; i<N; i++)
			if(counter[i] < previousMax)
				counter[i] = previousMax;

		return counter;
	}

	//Score: 77
	//Correctness: 100, Performance: 60 
	//Worst O(M*N)
	public static int[] solution_slow(int N, int[] A) {
		int[] counter = new int[N];
		int max = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] == N+1)
				Arrays.fill(counter, max);
			else{
				counter[A[i]-1]++;
				max = Math.max(max, counter[A[i]-1]);
			}
			//System.out.println(Arrays.toString(counter));
		}
		return counter;
	}
}