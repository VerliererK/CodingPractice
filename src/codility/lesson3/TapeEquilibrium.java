package codility.lesson3;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = {1000, -1000};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		long min = Integer.MAX_VALUE;
		long sum = 0;
		for(int a : A)
			sum += a;
		long sum2 = 0;
		for(int i=0; i<A.length-1; i++){
			sum -= A[i];
			sum2 += A[i];
			min = Math.min(Math.abs(sum2 - sum), min);
		}
		return (int) min;
	}

}
