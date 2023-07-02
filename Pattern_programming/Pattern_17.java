/*Input: 4
Output:
   A
  ABA
 ABCBA
ABCDCBA
*/
class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            int spaces=n-i;
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
           
            for(int j1=i-1;j1>=1;j1--)
            {
                System.out.print((char)(j1+64));
            }
            System.out.println();
        }
    }
}
