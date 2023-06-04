/*268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 

Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
*/

class Solution {
     /*CYCIC SORT-->since 0 to n and time complexity should be o(n)
         0 to n range so there will be n+1 numbers
         Example:n=4 --> [4,0,2,1] but it should contain usually 0,1,2,3,4
         here therfore 3 is missing...
         [0,1,2,3,4]--> in sorted version we can see that the element == index
         [4,0,2,1]-->in 4 0 2 1 we cant place 4 anywhere out of index so igore n. (ie:4)
         [0,4,2,1]--> checks the 0 that is not in correct index so swaps
         [0,4,2,1]-->checks 2 that is in correct index
         [0,1,2,4]-->checks the 1 that is not in correct index so swaps
         so in 2 cases we can find:
         case1: index not as value
         case2: n itself is not there [0,1,2,3]and n=4 so missing is n ie 4
     */
    public int missingNumber(int[] nums) { 
       int i=0;
       //sorting i cyclic for o(n)
       while(i<nums.length)//traversing
       {
           int current=nums[i];// value of the index
           //nth value should be ignored && value of the current index arr[i],should be compared with the value of the found index arr[current]
           if(nums[i]<nums.length && nums[i]!=nums[current])//ex: arr[i]=0,arr[current]=4,ie;arr[0]=4
           {
               //swaps
                int temp=nums[i];
                nums[i]=nums[current];
                nums[current]=temp;
           }
           else
           {
               i++;
           }
       }
       //finding missing numbers
       for(int index=0;index<nums.length;index++)
       {
           //case 1 :index and values mismatch
           if(nums[index]!=index)
           {
               return index;
           }
       }
      //case 2: n not in the list hence returning n
      return nums.length;
    }
}
