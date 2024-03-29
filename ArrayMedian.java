/*********************************Array Median

Write a program to find the median of the elements in an array. Median is the middle value in a sorted array. If there is an even number of elements in an array, then the median is mean of 2 middle values.

Note :
Use Array methods to sort the array values.


Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in an array.
The first integer corresponds to n and the next n integers correspond to the elements in an array.
Assume that the maximum number of elements in an array is 20.

Output Format:

The output consists of a double value which corresponds to the median of an array.
All the double values should be displayed upto 2 decimal places.
Refer sample input and output for formatting specifications.


[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output 1 :

Enter the number of elements in the array

5

Enter the elements in the array

2

4

1

3

5

The median of the array is 3.00

Sample Input and Output 2:

Enter the number of elements in the array

6

Enter the elements in the array

1

2

3

45

56

2

The median of the array  is 2.50
************************************************/
import java.util.*;
import java.util.Arrays;
public class ArrayMedian {

	public static void main(String[] args) {
		// your code here
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the array");
		int [] arr=new int[n];
		float median=0f;
		int r=n/2;
		for(int i=0,j=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(n%2==0)
		median=(float)(arr[r-1]+arr[r])/2;
		else 
		median=arr[((n+1)/2)-1];
	
		System.out.printf("The median of the array is %.2f\n",median);
	}

}