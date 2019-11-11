package Arrays;

import java.util.Scanner;

public class Problem6 {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int t = arr[low];
            arr[low] = arr[high];
            arr[high] = t;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println("Array before reversal:");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Array after reversal:");
        printArray(arr);
    }
}
