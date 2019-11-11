package com.company.DSA3.Mathematics;

/*

GP Term

Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.

Input Format:
First line contains an integer, the number of test cases 'T'. T test cases follow. Each test case in its first line contains two positive integer A and B (First 2 terms of GP). In the second line of every test case it contains of an integer N.

Output Format:
In each seperate line print the Nth term of the Geometric Progression. Print the floor ( floor(2.3)=2 ) of the answer.

Your Task:
This is a function problem. You need to complete the function termOfGP() that takes A and B as parameter and returns Nth term of GP. The return value should be double that would be automatically converted to floor by the driver code.

Constraints:
1 <= T <= 100
-100 <= A <= 100
-100 <= B <= 100
1 <= N <= 5

Example:
Input:
2
2 3
1
1 2
2

Output:
2
2

Explanation:
Testcase 2: The second term of series whose common ratio is 2 will be 2.
 */

import java.util.Scanner;

public class Problem6 {

    public static double termOfGP(int A, int B, int N) {
        if (N == 1)
            return A;
        if (N == 2)
            return B;
        double r = B / (A * 1.0);
        return (A * Math.pow(r, N - 1));

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int a, b, n;
            a = s.nextInt();
            b = s.nextInt();
            n = s.nextInt();
            System.out.println((int) Math.floor(termOfGP(a, b, n)));
        }
    }
}
