package com.company.DSA3.Mathematics;

import java.util.Scanner;

/*

Absolute Value

You are given an integer I. You need to print the absolute value of the integer I.

Input Format:
The first line of input contains T, denoting number of test cases. Each testcase contains single integer I which may be positive or negative.

Output Format:
For each testcase, in a new line, output the absolute value.

Your Task:
This is function problem. You only need to complete the function absolute that takes integer I as parameter and returns the absolute value of I. All other things are taken care of by the driver code.

Constraints:
1 <= T <= 100
-106 <= I <= 106

Example:
Input:
2
-32
45

Output:
32
45

Explanation:
Testcase 1: Since -32 is negative, we prints its positive equivalent, i.e., 32
Testcase 1: Since 45 is positive, we prints its value as it is, i.e., 45
 */

public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            int I = s.nextInt();
            System.out.println(absolute(I));
            T--;
        }
    }

    private static int absolute(int I) {
        if (I < 0) {
            return I * -1;
        } else {
            return I;
        }
    }
}
