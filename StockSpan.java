/****************************************Stock Span

The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days.
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}

Input Format

Input consists of n+1 integers. The first integer corresponds to n, the number of days. The next n integers correspond to stock prices on days 1, 2...n.

Output Format

Output consists of n integers that correspond to the span values.

Sample Input:

7

100

80

60

70

60

75

85

Sample Output:

1

1

1

2

1

4

6
************************************************/
import java.util.*;

public class StockSpan {
     static void calculateSpan(int price[], int n, int S[])
    {
      
        S[0] = 1;
 
        
        for (int i = 1; i < n; i++) {
            S[i] = 1; 
 
         
            for (int j = i - 1;
                 (j >= 0) && (price[i] >= price[j]); j--)
                S[i]++;
        }
        for(int i =0; i<n;i++)
        {
            System.out.println(S[i]);
        }
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
             int n = sc.nextInt() ;
        int price[] = new int[n];
   for(int i=0;i<n;i++)
   {
       price[i]=sc.nextInt();
   }
        int S[] = new int[n];
 
        calculateSpan(price, n, S);
 
    }   
    }