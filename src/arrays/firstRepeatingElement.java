package arrays;

import java.util.Scanner;

public class firstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int N = (int) (1e6+2);
		int idx[] = new int[N];
		for(int i=0; i<N; i++) {
			idx[i] = -1;
		}
		int minidx = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			if(idx[arr[i]] != -1) {
				minidx = Math.min(minidx, idx[arr[i]]);
			}
			else {
				idx[arr[i]] = i;
			}
		}
		
		if(minidx == Integer.MAX_VALUE) {
			System.out.println("-1");
		}
		else {
			System.out.println(minidx+1);
		}
	}

}
