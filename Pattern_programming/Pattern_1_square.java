/*Example 1:

Input: 5

Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/

class Solution {

    void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
