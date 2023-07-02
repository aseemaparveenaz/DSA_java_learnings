/*
Example 1:

Input: 5

Output:
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

*/

class Solution {
//[number,spcae,number]
//[1 6 1][2 4 2][3 2 3][4 0 4]
    void printTriangle(int n){
        //numbers
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
              System.out.print(j+ " ");
           }
        //space
          for(int j=1;j<=2*(n-i);j++)//6 4 2 0
           {
              System.out.print("  ");
           }
        //numbers
           for(int j=i;j>=1;j--)   //reverse
           {
              System.out.print(j+ " ");
           }
        System.out.println();
       }
    }
}
