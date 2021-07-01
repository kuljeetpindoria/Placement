package arrays;

import java.util.Scanner;

public class linearSearch {
	
	static int linearSearch(int arr[], int key , int n) {
		for(int i =0; i<n; i++) {
			if(arr[i] == key) {
				System.out.print(i);
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		
		linearSearch(arr, key , n);
		
		
	}

}
