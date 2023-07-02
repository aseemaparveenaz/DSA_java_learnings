/*
Input: 5
Output:
ABCDE
ABCD
ABC
AB
A
*/

class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n-i+1;j++)
           {
            System.out.print((char)(j+64));
           }
        System.out.println();
        }
    }
}
