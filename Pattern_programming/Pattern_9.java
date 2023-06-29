/*
For Input: 
5
Your Output: 
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/


class Solution {
    
    
    void printDiamond(int n) {
        // Your code here
        toptri(n);
        bottomtri(n);
    }
    
    public void toptri(int n)
    {
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
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     public void bottomtri(int n)
    {
         for(int i=1;i<=n;i++)
        {
            int spaces=i-1;
           //spaces are 0 1 2 3 <<<
            for(int s=0;s<spaces;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
