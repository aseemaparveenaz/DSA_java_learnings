/*Find the missing number in an array
Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

Examples:

Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.
*/
//brute force --> linear search 
//Time Complexity: O(N2), sc-->0(1)
//Better Approach (using Hashing):tc-> O(N) + O(N) ~ O(2*N), Space Complexity: O(N), where N = size of the array+1
class Solution {
    public static int missingNumber(int []a, int N) {
        int hash[] = new int[N + 1]; //since i from 0 it adds as hash array
        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)// iterating the given array
            hash[a[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}

//optimal 1--> sum --> tc->o(n) sc->o(1)
import java.util.*;

public class tUf {
    public static int missingNumber(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}

//optimal sol 2 ->xor tc =0(n) sc-> o(1)-->a^a=0 a^0=a
