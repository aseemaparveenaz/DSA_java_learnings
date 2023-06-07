/*287. Find the Duplicate Number
Companies
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
Constraints: time o(n)
*/

class Solution {
    /*1 3 4 2 2  (1)checks element!=index+1
      1 4 3 2 2  (2)arr[i]!=arr[current] where current =arr[i]-1
      1 2 3 4 2 if wrong swap oterwise return the ans when (2) condition fails and 
      when the req pos already has the req value */

    public int findDuplicate(int[] nums) {
      //cycle sort
     int i=0;
        while(i<nums.length)
        {
         if (nums[i] != i + 1) // if elements are not in correct pos example:1 2 3 4 (2)
         {
            int current=nums[i]-1;// since range from 1
            if(nums[i]!=nums[current]) //check with the value that has taken as the index
            {
                  //swaps
                int temp=nums[i];
                nums[i]=nums[current];
                nums[current]=temp;
            }
            else
               return nums[i];
         }
         else
           i++;
        }
        return -1;
    }
}
