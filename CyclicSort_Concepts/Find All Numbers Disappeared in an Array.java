/* 448. Find All Numbers Disappeared in an Array

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
*/

class Solution {
    // range (1,n) so cyclic sort
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //after sorting incorrect indices are the missing numbers
         int i=0;
        while(i<nums.length)
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
             i++;
        }
        //just fing missing no
        List<Integer> ans=new ArrayList<>();

        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index+1) //index[0]=1 bcz it starts with 1
            {
                ans.add(index+1);
            }
        }
        return ans;
    }
}
