package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren2 {
	public static long unf(int[] arr, int index, int N, int K) {
		long unf = 0;
		K++;
		int i= index;
		for(int j=i; j<K+i; j++)
			for(int k=j+1; k<i+K; k++)
				unf += arr[k] - arr[j];
		return unf;
	}
	public static void solve(int[] arr, int N, int K) {
		Arrays.sort(arr);
		long min = Long.MAX_VALUE;
		int index = 0;
		K--;
		for(int i=0; i<N-K; i++){
			long ubf = 0;
			for(int j=0; j<=K/2; j++){
				ubf += (K-2*j)*(long)arr[i + j];
				ubf -= (K-2*j)*(long)arr[i + K - j];
			}
			min = Math.min(min, Math.abs(ubf));
			if(Math.abs(ubf) == min) index = i;
		}
		System.out.println(index + " "  + min );
	}


	public static void main(String[] args)  throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		solve(arr, N, K);
	}
}