package com.example.module2.ss3_mang;

import java.util.Scanner;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = scanner.nextInt();
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("Phần tử lớn nhất là: " + max);

        scanner.close();
    }
}

