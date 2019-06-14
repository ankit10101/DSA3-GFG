package com.company.Mathematics;

/*
Given a quadratic equation in the form ax2 + bx + c. You need to print roots of it.

Input Format:
First line of input contains an integer, the number of test cases T. Each test case contains three positive numbers a, b and c in the same line seperated by space.

Output Format:
If roots of equations exits, then print the two roots separated by space (Higher valued root should be printed before lower valued). If roots are imaginary, then print "Imaginary".

Note 1 :  Please do NOT to add "\n" or newline after printing output in your function.  Newline is added by the driver code.
Note 2 : Please do float division like (-b+sqrt(b2-4ac)) / 2.0*a.
Note 3 : Please use floor function, note that roots can be negative.

Your Task:
This is a function problem. You only need to complete the function quadraticRoots that takes a,b,c as parameters and prints the floor value of roots. The other tasks are already performed by the driver function. The newline is already appended by the driver code.

Constraints:
1 <= T <= 50
1 <= a <= 103
1 <= b <= 103
1 <= c <= 103

Example:
Input:
3
1 -2 1
1 -7 12
1 4 8

Output:
1 1
4 3
Imaginary

Explanation:
Testcase 1: Roots of equation x2 - 7x + 12 are 4 and 3.
Testcase 3: Roots of equation x2 + 4x + 8 are imaginary since it's discriminant is less than 0.
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            int a, b, c;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            quadraticRoots(a, b, c);
            T--;
        }
    }

    public static void quadraticRoots(int a, int b, int c) {
        double r1, r2;
        int d = (b * b) - (4 * a * c);
        if (d < 0)
            System.out.print("Imaginary");
        else {
            r1 = Math.floor((-b + Math.sqrt(d)) / (2.0 * a));
            r2 = Math.floor((-b - Math.sqrt(d)) / (2.0 * a));
            System.out.print((int) r1 + " " + (int) r2);
        }
    }
}
