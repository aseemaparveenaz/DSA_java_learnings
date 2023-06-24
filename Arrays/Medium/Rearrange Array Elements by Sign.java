/*You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].*/


//brute force  
import java.util.*;

class solution{

public static int[] RearrangebySign(int[] A, int n){
    
  // Define 2 vectors, one for storing positive 
  // and other for negative elements of the array.
  ArrayList<Integer> pos=new ArrayList<>();
  ArrayList<Integer> neg=new ArrayList<>();
  
  // Segregate the array into positives and negatives.
  for(int i=0;i<n;i++){
      
      if(A[i]>0) pos.add(A[i]);
      else neg.add(A[i]);
  }
  
  // Positives on even indices, negatives on odd.
  for(int i=0;i<n/2;i++){
      
      A[2*i] = pos.get(i);
      A[2*i+1] = neg.get(i);
  }

 
  return A;
}    

public static void main(String args[]) 
{
  // Array Initialisation.
  int n = 4;
  int A[]= {1,2,-4,-5};


  int[]ans= RearrangebySign(A,n);
  
  for (int i = 0; i < n; i++) {
    System.out.print(ans[i]+" ");
  }

}
}


/*Time Complexity: O(N+N/2) 
Space Complexity:  O(N/2 + N/2) = O(N) */

//optimal
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        int posIndex=0,negIndex=1;
        for(int i=0;i<n;i++)
        {
          if(nums[i]>0) // if neg
          {
              ans[posIndex]=nums[i];
              posIndex+=2;
          }
          else{
              ans[negIndex]=nums[i];
              negIndex+=2;
          }
        }
        return ans;
    }
}
/*Time Complexity: O(N) 
  sc-->o(n)*/
