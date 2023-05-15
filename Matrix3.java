/**********************************Fourth row sum Matrix
Write a program to get a 3x3 matrix and display a matrix of order 4x4, with fourth row and column as sum of rows and columns respectively.
[Note: First find the sum for rows then the column.]
Input Format:
Input consists of elements in the 3x3 matrix.
Output Format:
Print the obtained 4x4 matrix.
Sample Input and Output:
Enter the 3x3 matrix
1
2
3
1
2
3
1
2
3
The sum matrix is
1 2 3 6 
1 2 3 6 
1 2 3 6 
3 6 9 18 ************************************/
import java.util.Scanner;
class Matrix3 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[][] result = new int[4][4];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3x3 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j];
                result[i][3] += matrix[i][j];
                result[3][j] += matrix[i][j]; 
            }
        }
        result[3][3] = result[0][3] + result[1][3] + result[2][3];
        System.out.println("The sum matrix is");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}