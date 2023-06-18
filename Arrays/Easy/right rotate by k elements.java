/*189. Rotate Array
Medium
14.5K
1.6K
Companies
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/
//brute
class Solution {
    public void rotate(int[] nums, int k) {
        //brute force
        int n=nums.length;
        if(n==0) return;
        k=k%n; //7%7==0 then no need to roatate so if 8%7==1 then rotae only for 1
        if (k == 0) return;
        int[] temp= new int[n-k]; //1 2 3 || 4 5 6 7 when d =3 
        for(int i=0;i<n-k;i++)// first is taken and kept
        {
            temp[i]=nums[i];
        }
        for(int i=n-k;i<n;i++)// placing second half front
        {
            nums[i-(n-k)]=nums[i];
        }
         for (int i = k; i < n; i++)
         {
              nums[i] = temp[i - k]; // this issimilar to declaring j and temp[j++]
         }
    }
}
