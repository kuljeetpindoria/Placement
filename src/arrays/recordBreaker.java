package arrays;

import java.util.Scanner;

public class recordBreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n + 1];
		arr[n] = -1;
		
		
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();	
		}
		
		if(n==1) {
			System.out.println("1");
			return;
		}
		int ans =0;
		int mx = -1;
		
		
		for(int i =0; i<n; i++) {
			if(arr[i] > mx && arr[i] >arr[i+1]) {
				ans++;
			}
			mx = Math.max(mx, arr[i]);
		}
		
		System.out.println(ans);

	}

}
