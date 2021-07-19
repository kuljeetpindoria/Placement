package twoDArrays;

import java.util.Scanner;

public class searchingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == x) {
					System.out.println(i + " " + j);
					flag = true;
				}
			}
		}
		
		if(flag) {
			System.out.println("Element Found");
		}else {
			System.out.println("Element Not Found");
		}
	}

}
