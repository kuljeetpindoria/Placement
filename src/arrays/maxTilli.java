package arrays;

import java.util.Scanner;

public class maxTilli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = -199999999;
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			max = Math.max(max,arr[i]);
			System.out.print(max);
		}
	}

}
