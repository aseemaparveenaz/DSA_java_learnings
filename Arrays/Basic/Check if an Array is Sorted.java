/*Check if an Array is Sorted
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Note: Two consecutive equal values are considered to be sorted.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.
*/

public class Solution {

    static int largestElement(int[] arr, int n) {
         int max = arr[0];
      for (int i = 0; i < n; i++) {
          if (max < arr[i]) {
          max = arr[i];
    }
   }
    return max;
    }
}

// tc--> o(n) sc-->o(1)
