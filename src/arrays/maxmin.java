package arrays;

import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxNo = arr[0];
		int minNo = arr[0];
		
		for(int i = 0; i<n;i++) {
			if(arr[i]>maxNo) {
				maxNo = arr[i];
			}
			if(arr[i]<minNo) {
				minNo = arr[i];
			}
		}
		
		
			System.out.print(maxNo + " and " + minNo + " are the  maximum and minimum") ;
	


	}

}
