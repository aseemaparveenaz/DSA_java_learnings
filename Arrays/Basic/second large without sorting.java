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

for(int i=n-2;i>=0;i--)//with duplicate
  {
    if(arr[n-2]!=arr[n-1])
    {
      int secondsmall=arr[i];
       break;
    }
  }
