/*Problem Statement: Given an array, we have to find the largest element in the array.
Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. */

//brute force--> TC=O(nlogn) since sorting; sc=o(1) method 1
class Solution {
    static int largestElement(int[] arr, int n) {
         Arrays.sort(arr);
         return arr[arr.length - 1];
    }
}

//optimal solution --> TC=O(n) since sorting; sc=o(1) method 2
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
