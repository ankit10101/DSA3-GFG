package com.company.Mathematics;

/*
Given a positive integer N. The task is to find factorial of N.

Input:
The first line contains an integer 'T' denoting the total number of test cases. T test cases follow. In each test cases, it contains an integer 'N'.

Output:
For each testcase, in a new line, print the factorial of N.

Your Task:
This is a function problem. You just need to complete the function factorial() that takes N as parameter and returns factorial of N.

Constraints:
1 <= T <= 100
0 <= N <= 18

Example:
Input:
2
1
4

Output:
1
24

Explanation:
Testcase 2: Factorial of 4 is 4 * 3 * 2 * 1 = 24.
 */

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            int N = s.nextInt();
            System.out.println(factorial(N));
            T--;
        }
    }

    public static long factorial(int N) {
        long fact = 1;
        while (N != 0) {
            fact = fact * N;
            N--;
        }
        return fact;
    }
}
