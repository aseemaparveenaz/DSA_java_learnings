/*

Example 1:

Input: 5

Output:
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1

*/


class Solution {

    void printTriangle(int n) {
        // code here
        int start=1;
        for(int i=1;i<=n;i++)
        {
            //odd row start with 1
            if(i%2==0) start=0;
            else       start=1;
           for(int j=1;j<=i;j++)
           {
              System.out.print(start+ " ");
              start=1-start;// keep fliping
           }
             System.out.println();
        }
    }
}
