/*Input: 5
Output:
E
E D
E D C
E D C B
E D C B A
*/
class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            int start=n;
           for(int j=1;j<=i;j++)
           {
              System.out.print((char)(start+64)+" ");
              start--;
           }
        System.out.println();
       }
    }
}
