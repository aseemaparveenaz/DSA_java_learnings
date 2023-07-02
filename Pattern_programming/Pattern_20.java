/* Input: 5
Output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/
class Solution {
    void printTriangle(int n) {
        top(n);
        bottom(n);
    }
    void top(int n)
    {
        int end=2*n-2;
         for(int i=1;i<=n;i++)
        {
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //space
             for(int space=1;space<=end;space++)//8 6 4 2
            {
                System.out.print(" ");
            }
            end=end-2;
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
     void bottom(int n)
    {
        int end=2;
         for(int i=1;i<=n-1;i++)
        {
            //star
            for(int j=1;j<=(n-1)-i+1;j++)
            {
                System.out.print("*");
            }
            //space
             for(int space=1;space<=end;space++)//2 4 6 8
            {
                System.out.print(" ");
            }
            end=end+2;
            //star
            for(int j=1;j<=(n-1)-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
