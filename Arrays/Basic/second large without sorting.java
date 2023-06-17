/*Find Second Smallest and Second Largest Element in an array
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
Examples:

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present
*/
//brute force with sorting Time Complexity: O(NlogN), For sorting the array ,Space Complexity: O(1)
Arrays.sort(arr); //without duplicate
	int small = arr[1];
	int large = arr[n - 2];

for(int i=n-2;i>=0;i--)  { //with duplicate O(n)
    if(arr[n-2]!=arr[n-1]){
      int secondsmall=arr[i];
       break;
    }
  }
//with 2 pass method 2 better solution
//Time Complexity: O(N), We do two linear traversals in our array that is o(2n) //Space Complexity: O(1)
class Solution {
    int print2largest(int arr[], int n) {
    int large=arr[0];
    int second_large = -1; // Integer.MIN_VALUE; use when -1 is listed in array
    int i;
	for (i = 0;i < n;i++)
	{
		large = Math.max(large,arr[i]);
	}
    for (i = 0;i < n;i++)
	{
		if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
    return second_large;
    }
}
//one pass with swap //o(n)-->tc sc-->o(1)
public class Solution {
    static int secondLargest(int[] a,int n)
    {
        int slargest=-1;// since no neg num
        int largest=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>largest)//large=5 slarge=3 when finds 5 in array which is larger than large that is 5
            {
                // then swaps as large =6 and slarge=large that i 5
                slargest=largest;
                largest=a[i];
            } 
            else if(a[i]>slargest)//godd to use else if(a[i]<largest && a[i]>slargest) ie--> in between
            {
                //if isbetween case when a[i]=4and large=5 and seclar is 3 change only slarge
                slargest=a[i];
            }
        }
        return slargest;
    }
    static int secondSmallest(int[] a,int n)
    {
        int ssmallest=Integer.MAX_VALUE; //dont know the max value
        int smallest=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<smallest)//samll=2 ss=4, when finds 1 in array which is smallerr than small that is 2
            {
                // then swaps as small=1 and ssmall=small ie 2
                ssmallest=smallest;
                smallest=a[i];
            } 
            else if(a[i]>smallest && a[i]<ssmallest) /// when inbetween
            {
                //if isbetween case when a[i]=4and large=5 and seclar is 3 change only slarge
                ssmallest=a[i];
            }
        }
        return ssmallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
	int secsmallest = secondSmallest(a,n);
	int seclargest =  secondLargest(a,n);
    return new int[]{seclargest,secsmallest};
    }
}
