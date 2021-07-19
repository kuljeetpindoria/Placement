package twoDArrays;

import java.util.Scanner;

public class spiralOrderMatrixTransversal {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        System.out.println("Enter array elements : ");

        int arr[][] = new int[n][m];
        
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
        // Spiral order print
        int row_start = 0, row_end = n - 1;
        int column_start = 0, column_end = m - 1;

        while (row_start <= row_end && column_start <= column_end) {
            // for row_start
            for (int col = column_start; col <= column_end; col++) {
                System.out.print(arr[row_start][col] + " ");
            }
            row_start++;
            // for column end
            for (int row = row_start; row <= row_end; row++) {
                System.out.print(arr[row][column_end] + " ");
            }
            column_end--;
            // for row end
            for (int col = column_end; col >= column_start; col--) {
                System.out.print(arr[row_end][col] + " ");

            }
            row_end--;
            /// for column_start
            for (int row = row_end; row >= row_start; row--) {
                System.out.print(arr[row][column_start] + " ");
            }
            column_start++;

        }

    }
}