/*
Example 1:

Input: 5

Output:
    *
   ***  
  *****
 *******
*********


*/

class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
           // int spaces=n-i;
           //if i=0 to n then s=n-i-1
            for(int s=1;s<=n-i;s++)
           // for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
           // if i=0 to n then j=2*i+1
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
