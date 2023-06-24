/*74. Search a 2D Matrix
Medium
12.7K
355
Companies
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true*/


//1. tc-->o(m+n) sc->o(1)
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      //check if input data is incorrect
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0, j = matrix[0].length - 1;
      while(i < matrix.length && j >= 0) {
        if(matrix[i][j] == target)
          return true;
        else if(matrix[i][j] > target)
          j --;  //go left
        else if(matrix[i][j] < target)
          i ++;  // go down
      }
      return false;
    }
}
//using bin search as monotonous array ;tc-->o(logm*n) sc= o(!)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
      int row=matrix.length,col=matrix[0].length;
      int low=0,high=(row*col)-1; //left bottom last ele is high index
      while(low<=high)
      {
        int mid=low+(high-low)/2;
         if(matrix[mid/col][mid%col]==target)
        {
            return true;
        }
        if(matrix[mid/col][mid%col]<target)
        {
            low=mid+1;
        }
        else
            high=mid-1;
      }
      return false;

    }
}

