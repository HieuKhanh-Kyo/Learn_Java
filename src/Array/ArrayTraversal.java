package Array;

// Cho 1 mảng số ng gồm n phần tử đc nhập từ bàn phím
// Tìm số lớn nhất trong mảng

import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Biggest element in the array:");
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i];
            }
        }
        System.out.println(a);
    }
}
