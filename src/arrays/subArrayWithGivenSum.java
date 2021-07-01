package arrays;

import java.util.Scanner;

public class subArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i=0, j=0, st=-1, en=-1, sum=0;
		
		while(j<n && sum+arr[j] <= s) {
			sum += arr[j];
			j++;
		}
		if(sum == s) {
			System.out.println(i+1 + " " + j);
			return;
		}
		while(j<n) {
			sum += arr[j];
			while(sum>s) {
				sum -= arr[i];
				i++;
			}
			if(sum == s) {
				st = i+1;
				en = j+1;
				break;
			}
			j++; 
		}
		System.out.println(st+ " " + en);

	}

}
