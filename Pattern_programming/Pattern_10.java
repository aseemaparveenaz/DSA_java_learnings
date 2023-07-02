/*
Example 1:

Input: 5

Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*

*/

class Solution {

    void printTriangle(int n) {
        // code 
        //with 1 start
         for(int row=1;row<2*n;row++)
        {
            int totalcol=row>n?2*n-row:row;
            
                for(int col=1;col<=totalcol;col++)
                {
                       System.out.print("* ");
                }

             System.out.println();
        }
    }
}
