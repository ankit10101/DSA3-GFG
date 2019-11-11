package com.company.DSA3.Mathematics;

/*

Exactly 3 Divisors

Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Input:
The first line contains integer T, denoting number of test cases. Then T test cases follow. The only line of each test case contains an integer N.

Output:
For each testcase, in a new line, print the answer of each test case.

Your Task:
This is a function problem. You only need to complete the function exactly3Divisors() that takes N as parameter and returns count of numbers less than or equal to N with exactly 3 divisors.

Constraints :
1 <= T <= 105
1 <= N <= 109

Example:
Input :
3
6
10
30

Output :
1
2
3

Explanation:
Testcase 1: There is only one number 4 which has exactly three divisors 1, 2 and 4.

Hint:-
The logic behind this is, such numbers can have only three numbers as their divisor and also that include 1 and that number itself
resulting into just a single divisor other than number, so we can easily conclude that required are those numbers which are
squares of prime numbers so that they can have only three divisors (1, number itself and sqrt(number)).
So all primes i, such that i*i is less than equal to N are three-prime numbers.
Note: We can generate all primes within a set using any sieve method efficiently and
then we should all primes i, such that i*i <=N.

 */

import java.util.Scanner;

public class Problem8 {

    public static boolean isPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }

    public static int exactly3Divisors(int N) {
        int count = 0;
        for (int i = 2; i * i <= N; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            System.out.println(exactly3Divisors(n));
        }
    }
}
