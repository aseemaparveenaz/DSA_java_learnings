/*
Example 1:

Input: 5

Output:
* * * * *
* * * * 
* * * 
* *  
* 

*/

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
        }
    }
}
