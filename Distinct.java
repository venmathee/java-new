/***********************************Number of Distinct Elements in an Unsorted Array

 

Write a program to find the number of distinct elements in an unsorted array.

Note: Do it without sorting the array.

 

Input Format:

Input consists of n+1 integers.

The first integer corresponds to n, the number of elements in the array. 

The next n integers correspond to the elements in the array. Assume that the maximum value of n is 15.

Output Format:

The output consists of a single integer which corresponds to the number of distinct elements in the array.

[All text in bold corresponds to the input and the rest corresponds to output.]

Sample Input:

5

3

2

3

780

90

Sample Output:

4

 

Explanation:

If there is an element in the array for more than one time, then consider the element once. For instance, value 3 occurred more than one time in the sample input, so it has to be counted once. So distinct elements are 3,2,780,90.

Same way if the array holds same value “n” times eg: 3 3 3 then number of distinct element is 1. (i.e) if a number occurred more than one time, then it has to be counted once.
**********************************************/
import java.util.*;
public class Distinct {

	public static void main(String[] args) {
		// your code here
		Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int arr[] = new int [size];
      int n = arr.length;
      int res = 1;
      for(int i=0; i<size; i++){
         arr[i] = s.nextInt();
      }
       for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
 
            if (i == j)
                res++;
        }
       System.out.println(res);
     }

}
