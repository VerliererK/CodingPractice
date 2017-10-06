package codility.lesson4;

import java.util.HashSet;

public class MissingInterger {

	public static void main(String[] args) {
		int[] A = new int[] {-1, -3};
		System.out.println(solution(A));
	}
    
    public static int solution(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int a : A)
        	if(a>0)
        		hset.add(a);
        while (hset.contains(num)) //從 1 開始 有找到就 ++
            num++;        
        return num;
    }

}
