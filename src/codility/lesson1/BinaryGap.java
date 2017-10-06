package codility.lesson1;

public class BinaryGap {
	//lessons 1
	//Find longest sequence of zeros in binary 
	//representation of an integer.

	public static void main(String[] args) {
		int a = 4;
		System.out.println(Integer.toBinaryString(a));
		
		System.out.println(solution(a));
		//遞迴作法 但要先把偶數位元的0消掉
		while(a%2 == 0)
			a = a>>1;
		System.out.println(solution(a, 0, 0));
	}

	public static int solution(int N) {
		int count = 0;
		int maxCount = Integer.MIN_VALUE;
		boolean gap = false; // 只有夾在 1 中間的 0 才算
		while(N>0){
			if(N%2 == 0 && gap){
				count++;
			}
			else if(N%2 == 1){
				maxCount = Math.max(maxCount, count);
				count = 0;
				gap = true;
			}
			N = N>>1;
		}
		return maxCount;
	}
	
	//遞迴作法
	static int solution(int n, int max, int current) {
	    if (n == 0)
	        return max;
	    else if (n % 2 == 0)
	        return solution(n / 2, max, current + 1);
	    else
	        return solution(n / 2, Math.max(max, current), 0);
	}
}
