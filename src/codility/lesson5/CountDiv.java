package codility.lesson5;

public class CountDiv {

	public static void main(String[] args) {
		System.out.println(solution(1, 11, 3));
		System.out.println(solution_slow(1, 11, 3));
	}
	//O(1)
	public static int solution(int A, int B, int K){
		if(A%K == 0)
			return B/K - A/K + 1;
		else
			return B/K - A/K;
	}
	//O(N) for Check
	public static int solution_slow(int A, int B, int K){
		int count = 0;
		for(int i=A; i<=B; i++)
			if(i%K == 0)
				count++;
		return count;
	}
}
