/*283. Move Zeroes
Easy
14K
355
Companies
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/

//brute force //tc--> o(n)+o(x)+o(n-x)=o(2n)
//space complexity=o(n) in worst case as if no zeroes are found.
class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
        int temp[] = new int[n];
        int k=0;
        for (int i=0;i<n;i++){
            if (nums[i]!=0){
                temp[k]=nums[i];
                k++;
            }
        } 
        for(int i=0;i<temp.length;i++)
        {
            nums[i]=temp[i];
        }
        for(int i=temp.length;i<n;i++)
        {
            nums[i]=0;
        }
 }

//optimal 
    //tc-->(x)+(n-x)=o(n)
      //sc=o(1)
class Solution {
    //2 pointer approach when we alfedy iterating array
 //ex:1 0 2 3 2 0 0  4 5 1
    //1 2 0 3 2 0 0 4 5 1--> swaps if non zero found
    //1 2 3 0 2 0 0 4 5 1-->
    //1 2 3 2 0 0 0 4 5 1
    //....
    //1 2 3 2 4 0 0 0 5 1-->4 with 0
    //1 2 3 2 4 5 0 0 0 1--> 5 with 0
    //1 2 3 2 4 5 1 0 0 0-->end when swaps
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int j=-1; // no zero found
       for(int i=0;i<n;i++)
       {
           if(nums[i]==0)
           {
               j=i;// first zero found and its index ae updated
               break;
           }
       }
       if(j==-1) return;
       for(int i=j+1;i<n;i++)
       {
           if(nums[i]!=0)//swaps if non zero found
           {
                 int temp = nums[i];
                 nums[i] = nums[j];
                 nums[j] = temp;
                 j++; // if swaps j moes 
           }
       }
    
    }
}
  
}
