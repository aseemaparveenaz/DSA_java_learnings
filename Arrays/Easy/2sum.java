/* 1.Two sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/

// brute force o(n^2)
public static int[] twoSum(int n, int []arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
}
//better solution Time and space Complexity: O(N),
class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int res[] =new int[2];
    for(int i=0;i<nums.length;i++){
        if(hm.containsKey(target-nums[i])) {
            res[1]=i;
            res[0]=hm.get(target-nums[i]);
            return res;
        }
        else{
            hm.put(nums[i],i);}
        }
    return null;
   } 
}
// for variant 1 for yes/no ans 2 pointer approach can be done not for variant 2 which needindex as ans
//c++
string twoSum(int n, vector<int> &arr, int target) {
    sort(arr.begin(), arr.end());
    int left = 0, right = n - 1;
    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) {
            return "YES";
        }
        else if (sum < target) left++;
        else right--;
    }
    return "NO";
}
//time Complexity: O(N) + O(N*logN), where N = size of the array.
//Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.

//Space Complexity: O(1) as we are not using any extra space.
