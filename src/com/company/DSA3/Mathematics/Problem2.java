package com.company.DSA3.Mathematics;

import java.util.Scanner;

/*

Celsius to Fahrenheit

Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

Input Format:
The first line of input contains T, denoting number of test cases. Each testcase contains single integer C denoting the temperature in celsius.

Output Format:
For each testcase, in a new line, output the temperature in fahrenheit.

Your Task:
This is a function problem. You only need to complete the function CtoF that takes C as parameter and returns temperature in fahrenheit( in double). The flooring and printing is automatically done by the driver code.

Constraints:
1 <= T <= 100
1 <= C <= 104

Example:
Input:
2
32
50
Output:
89
122

Explanation:
Testcase 1: For 32 degree C, the temperature in Fahrenheit = 89.
 */

public class Problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            int C = s.nextInt();
            System.out.println((int) cToF(C));
            T--;
        }
    }

    public static double cToF(int C) {
        double F;
        F = (9 * C) / 5 + 32;
        return F;
    }
}
