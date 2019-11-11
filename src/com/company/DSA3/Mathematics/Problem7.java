package com.company.DSA3.Mathematics;

/*

Primality Test

For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case should contain a positive integer N.

Output:
For each testcase, in a new line, print "Yes" if it is a prime number else print "No".

Your Task:
This is a function problem. You just need to complete the function isPrime that takes N as parameter and returns True if N is prime else returns false. The printing is done automatically by the driver code.

Constraints:
1 <= T <= 100
1 <= N <= 103

Example:
Input:
2
5
4

Output:
Yes
No

Explanation:
Testcase 1: 5 is the prime number as it is divisible only by 1 and 5.
 */

import java.util.Scanner;

public class Problem7 {

    public static boolean isPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            if (isPrime(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
