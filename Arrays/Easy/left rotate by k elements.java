/*Rotating an Array
BasicAccuracy: 44.48%Submissions: 93K+Points: 1
Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
Given an array of size N. The task is to rotate array by D elements where D ≤ N.

Example 1:

Input:
N = 7
Arr[] = {1, 2, 3, 4, 5, 6, 7}
D = 2
Output: 3 4 5 6 7 1 2
Explanation: 
Rotate by 1: [2, 3, 4, 5, 6, 7, 1]
Rotate by 2: [3, 4, 5, 6, 7, 1, 2]

Example 2:

Input:
N = 4
Arr[] = {1, 3, 4, 2}
D = 3
Output: 2 1 3 4

Your Task:
You don't need to read input or print anything. Your task is to complete the function leftRotate() which takes the array of integers arr[], its size n and d as input parameters and rotates arr[] in-place without using any extra memory.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

//brute force
class Solution {
    void leftRotate(int[] arr, int n, int d) {
           //brute force
        if(n==0) return;
        d=d%n; //7%7==0 then no need to roatate so if 8%7==1 then rotae only for 1
        if (d == 0) return;
        int[] temp= new int[d]; //1 2 3 || 4 5 6 7 when d =3 
        for(int i=0;i<d;i++)// first is taken and kept
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++)// placing second half front
        {
            arr[i-d]=arr[i];
        }
         for (int i = n - d; i < n; i++)
         {
              arr[i] = temp[i - (n - d)]; // this issimilar to declaring j and temp[j++]
         }
    }
}/*Time Complexity: O(d)+O(n-d)+O(d) = O(n+d), where n = size of the array, d = the number of rotations. Each term represents each loop used in the code.
Space Complexity: O(d) extra space as we are using a temporary array of size d.*/


//optimized approach
class Solution {
      static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    void leftRotate(int[] arr, int n, int d) {
        if (n == 0) return;
        // Get the effective number of rotations:
        d = d % n;// {1, 2, 3, 4, 5, 6, 7}
         if (d == 0) return;
        reverse(arr, 0, d - 1);//2 1 ||  3 4 5 6 7
        reverse(arr, d, n - 1);// 2 1 || 7 6 5 4 3
        reverse(arr, 0, n - 1);//3 4 5 6 7 1 2
    } 
}
/*Time Complexity: O(d)+O(n-d)+O(n) = O(2*n), where n = size of the array, d = the number of rotations. Each term corresponds to each reversal step.
Space Complexity: O(1) since no extra space is required.*/
