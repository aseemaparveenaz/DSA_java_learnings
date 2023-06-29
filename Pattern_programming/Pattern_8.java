/*
Example 1:

Input: 5

Output:

*********
 *******
  *****
   ***
    *


*/

class Solution {

    void printTriangle(int n) {
        // code here
          for(int i=1;i<=n;i++)
        {
            int spaces=i-1;
           //spaces are 0 1 2 3 <<<
            for(int s=0;s<spaces;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
