/* Example 1:
Input: 5
Output:
A
AB
ABC
ABCD
ABCDE
*/
class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
        {
            System.out.print((char)(j+64));
        }
        System.out.println();
        }
    }
}
