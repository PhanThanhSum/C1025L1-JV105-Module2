package com.example.module2.ss3_mang;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần chèn: ");
        int x = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();

        if (index <= -1 || index >= n) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            n++;

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
