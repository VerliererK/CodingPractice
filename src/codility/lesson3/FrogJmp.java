package codility.lesson3;

public class FrogJmp {

	public static void main(String[] args) {
		System.out.println(solution(1, 5, 2));
	}
	public static int solution(int X, int Y, int D){
		int diff = Y-X;
		if(diff%D == 0) //剛好 >= 即可
			return diff/D;
		else
			return diff/D + 1;
	}

}
