package codility.lesson3;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 5};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		//注意用 int 會 overflow
		long N = A.length+1;
		int sum = 0;
		for(int a : A)
			sum+=a;
		return (int) ((1+N)*N/2 - sum);
	}

}
