/*
Input: 4

Output:
****
*  *
*  *
****

*/
class Solution {
    void printSquare(int n) {
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
               if((j==1) || (j==n) || (i==1) || (i==n))
               {
                   System.out.print("*");
               }
               else
               {
                  System.out.print(" ");
               }
           }
         System.out.println();
        }
    }
}
