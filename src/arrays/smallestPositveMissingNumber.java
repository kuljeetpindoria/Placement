package arrays;

import java.util.Scanner;

public class smallestPositveMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		 int N = (int) 1e6 + 2;
		 boolean check[] =  new boolean[N];
		 for(int i=0; i<N; i++) {
			 check[i] = false;
		 }
		 
		 for(int i=0; i<n; i++) {
			 if(arr[i] >= 0) {
				 check[arr[i]] = true;
			 }
		 }
		 
		 int ans = -1;
		 for(int i=1; i<N; i++) {
			 if(check[i] == false) {
				 ans = i;
				 break;
			 }
		 }
		 System.out.println(ans);
	}
}
