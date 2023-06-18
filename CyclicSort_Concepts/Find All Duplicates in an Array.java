/*Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.
Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //q-> 4 3 2 7 8 2 3 1 
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
        //sorted one-->1 2 3 4 3 2 7 8
        //just fing missing no
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index+1) //index[0]=1 bcz it starts with 1
            {
                //wrong indices are added ie 3 and 2 from sortedarr
                ans.add(nums[index]);
            }
        }
        return ans; 
    }
}
