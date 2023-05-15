/******************************************Matrix Sum

Write a  program to find the sum of the elements in the matrix.

 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row-wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

Output Format:

Refer sample output for details.

 

Sample Input 1:

3

2

4 5

6 9

0 3

Sample Output 1:

The sum of the elements in the matrix is 27
*****************************************/
import java.io.*;                 
import java.util.Scanner;  
public class MatrixSum
{
      public static void main(String args[])  
      {
            Scanner sc=new Scanner(System.in);
            
            int m=sc.nextInt();
            int n=sc.nextInt();
            int [][] arr=new int[m][n];
            
            for(int i=0;i<m;i++)
            {
                  for(int j=0;j<n;j++)
                  {
                        arr[i][j]=sc.nextInt();
                  }
            }
            int result=0;
             for(int i=0;i<m;i++)
            {
                  for(int j=0;j<n;j++)
                  {
                       result=result+arr[i][j];
                  }
            }
            System.out.println("The sum of the elements in the matrix is "+result);
      }
}