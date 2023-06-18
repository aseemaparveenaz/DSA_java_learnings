/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
*/
class Solution {
    public int[] findErrorNums(int[] nums) {
      //cycle sort
     int i=0;
        while(i<nums.length)
        {
          int current=nums[i]-1;// since range from 1
            if(nums[i]!=nums[current]) //check with the value that has taken as the index
            {
                  //swaps ifnot equal that means it wasnot present beforeso not a duplicate
                int temp=nums[i];
                nums[i]=nums[current];
                nums[current]=temp;
            }
         
         else
           i++;
        }

        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
