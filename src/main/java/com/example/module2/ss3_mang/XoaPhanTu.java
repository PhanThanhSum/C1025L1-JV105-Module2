package com.example.module2.ss3_mang;

import java.util.Scanner;

public class XoaPhanTu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Phần tử không tồn tại trong mảng");
        } else {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Mảng sau khi xoá:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
