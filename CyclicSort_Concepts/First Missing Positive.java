/*41. First Missing Positive
Hard
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
*/

class Solution {
    //ingone negatives since positve number missing isasked
    public int firstMissingPositive(int[] nums) {
         int i=0;
       //sorting i cyclic for o(n)
       while(i<nums.length)//traversing
       {
           int current=nums[i]-1;//since 1 to n numbers
           // value of the index
           //nth value should be ignored && value of the current index arr[i],should be compared with the value of the found index arr[current]
           if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[current])//ex: arr[i]=0,arr[current]=4,ie;arr[0]=4
        //ingone negatives since positve number missing isasked
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
           if(nums[index]!=index+1)//since 1 to n numbers
           {
               return index+1;
           }
       }
      //case 2: n not in the list hence returning n
      return nums.length+1; //all elemt 1to 4 in the list then 5 is the answer
    }
}




