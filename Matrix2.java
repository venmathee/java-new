/************************************Row sum and Column sum

Write a program to find row sum and column sum of a given matrix.

Input format :

Input consists of row size,r and columun size,c followed by r*c values.

Output Format :

Output consists of sum of each row and sum of  each column values in the input matrix.

[ Refer Sample Input and Output for further details ]

Sample Input and Output  :

[ All text of bold corresponds to Input and the rest output ]

Enter the row size

2

Enter the column size

2

Enter the matrix values

1

5

4

7

The matrix is

1 5

4 7

Row 1 sum is 6

Row 2 sum is 11

Column 1 sum is 5

Column 2 sum is 12
******************************************************/
import java.util.Scanner;
class Matrix2{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in); 
 int rows, cols, sumRow, sumCol; 
 System.out.println("Enter the row size");
rows=sc.nextInt();
System.out.println("Enter the column size");
cols=sc.nextInt();
int[][] matrix=new int[rows][cols];
System.out.println("Enter the matrix values");
for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < cols; j++) 
                {
                    matrix[i][j] = sc.nextInt();
                }
            }
System.out.println("The matrix is");
for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < cols; j++) 
                {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println("");
            }
            
rows = matrix.length;    
cols = matrix[0].length;    
   for(int i = 0; i < rows; i++){    
            sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + matrix[i][j];    
            }    
            System.out.println("Row " + (i+1) +" sum is " + sumRow);    
        }    

for(int i = 0; i < cols; i++){    
            sumCol = 0;    
            for(int j = 0; j < rows; j++){    
              sumCol = sumCol + matrix[j][i];    
            }    
            System.out.println("Column " + (i+1) +" sum is " + sumCol);    
        }    
    }    
}