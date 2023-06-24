/*
26. Remove Duplicates from Sorted Array
Easy
11.4K
15.3K
Companies
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

//brute force | unique elements--> set
//tc--> set insertion o(nlogn)+ array insetion o(n) so o(nlogn)+o(n)
//sc=o(n) when all are unique
class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet < Integer > set1= new HashSet < > ();
        for (int i = 0; i < nums.length; i++) {
            set1.add(nums[i]);
        }
        int k = set1.size();
        int j = 0;
        for (int x: set1) {
            nums[j++] = x;
        }
        return k;
    }
}


//2 pointer approach
// 1 1 2 2 2 3 3 --> 1 2 3 2 2 3 3
//tc-->o(n);sc-->o(1)
class Solution {
    public int removeDuplicates(int[] nums) {
     int i=0;// i in always first of array
     for(int j=i+1;j<nums.length;j++)
     { 
        if(nums[j]!=nums[i]) // if non equal ele founds then 
        {
           nums[i+1]=nums[j];//i says takes the position in front of me and
           i++; // i also moves on i.. therefore the last element is ihence returning i+1
        }
     }
     return i+1; // note : after i+1 anything it can have
    }
}
