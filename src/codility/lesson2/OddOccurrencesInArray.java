package codility.lesson2;

public class OddOccurrencesInArray {
	//lessons 2
	//Find value that occurs in odd number of elements.

	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		int[] B = {5,3,7,2,2,3,7};
		int[] C = {5,9,7,9,5,3,7};
		int[] D = {1};
		System.out.println(solution(A));//7
		System.out.println(solution(B));//5
		System.out.println(solution(C));//3
		System.out.println(solution(D));//1
	}

	public static int solution(int[] A) {
		int a = A[0];
		for(int i=1; i<A.length; i++)
			a ^= A[i];
		return a;
	}
}
