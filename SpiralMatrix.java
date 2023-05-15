/****************************Print Matrix in Spiral form


Given a 2D array, write a program to print it in spiral form.

Input and Output Format:
The first line of the input consists of an integer, r that corresponds to the number of rows in the matrix.
The next line of the input consists of an integer, c that corresponds to the number of columns in the matrix.
The next 'm*n' lines in the input correspond to the elements in the matrix.
Output is a matrix.

Sample Input1:
4
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10****************************************/
import java.util.*;

public class SpiralMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, k = 0, l = 0;
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] a = new int[R][C];
         for (int m = 0; m < R; m++)
        {
            for (int n = 0 ; n < C; n++)
            {
                a[m][n]= sc.nextInt();
            }
            }
                  
       while (k < R && l < C) {
            for (i = l; i < C; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
  
            for (i = k; i < R; ++i) {
                System.out.print(a[i][C - 1] + " ");
            }
            C--;
  
           
            if (k < R) {
                for (i = C - 1; i >= l; --i) {
                    System.out.print(a[R - 1][i] + " ");
                }
                R--;
            }
  
           
            if (l < C) {
                for (i = R - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    
    }
}