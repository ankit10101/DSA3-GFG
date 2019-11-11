package com.company.DSA3.Mathematics;

/*

Mean And Median

Given an array a[ ] of size N. The task is to find the median and mean of the array elements.

Note: To find the median, you'd need to sort the array. Since sorting is covered in later tracks,
we have already provided the sort function to you in the code.

Input Format:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two line input, 1st line is the size of array and the 2nd line is the integer array elements.

Output Format:
For each testcase, in a new line, print the space separated mean and median of the array elements.

Your Task:
This is a function problem. You just need to complete the following two function:

mean(): It takes the array and its size N as parameters and returns the mean as an integer.
median(): It takes the array and its size N as parameters and returns the median as an integer.
Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= a[i] <= 106

Example:
Input:
2
5
1 2 19 28 5
4
2 8 3 4

Output:
11 5
4 3

Explanation:
Testcase 1: For array of 5 elements , mean and median are 11 and 5 respectively.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {

    public static int median(int A[], int N) {
        Arrays.sort(A);
        if (N % 2 != 0) {
            return A[N / 2];
        } else {
            return (int) ((A[(N / 2)] + A[(N / 2) - 1]) / 2.0);
        }
    }

    public static int mean(int A[], int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
        }
        int avg = sum / N;
        return avg;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n;
            n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            System.out.println(mean(a, n) + " " + median(a, n));
        }
    }
}
