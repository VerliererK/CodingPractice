package codility.lesson5;

public class PassingCars {

	public static void main(String[] args) {
		int[] A = new int[]{0,1,0,1,1};
		System.out.println(solution(A));
	}

	public static int solution(int[] A){
		int sum = 0;
		for(int a : A)
			sum+=a;
		int passingCars = 0;
		for(int a : A){
			if(a==0) passingCars += sum;
			else if(a==1) sum--;
			if(passingCars>1000000000) return -1;
			if(sum==0) return passingCars;
		}
		return -1;
	}
}
